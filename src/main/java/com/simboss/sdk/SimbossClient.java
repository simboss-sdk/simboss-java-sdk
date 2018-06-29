package com.simboss.sdk;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.simboss.sdk.conf.SimbossConfig;
import com.simboss.sdk.exception.SimbossException;
import com.simboss.sdk.request.SimbossRequest;
import com.simboss.sdk.response.SimbossResponse;
import com.simboss.sdk.utils.SignatureUtil;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;
import org.apache.http.impl.nio.conn.PoolingNHttpClientConnectionManager;
import org.apache.http.impl.nio.reactor.DefaultConnectingIOReactor;
import org.apache.http.impl.nio.reactor.IOReactorConfig;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.nio.reactor.ConnectingIOReactor;
import org.apache.http.nio.reactor.IOReactorException;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Future;

/**
 * Simboss Client
 * Created by Abel 2018-06-20.
 **/
public class SimbossClient {

  private Logger logger = LoggerFactory.getLogger(SimbossClient.class);

  private CloseableHttpAsyncClient closeableHttpAsyncClient;

  private static final String defaultCharSet = "UTF-8";

  private SimbossConfig config;

  public SimbossClient() {
    config = new SimbossConfig().build();
  }

  public SimbossClient(String appId, String appSecret) {
    config = new SimbossConfig(null, appId, appSecret).build();
  }

  public SimbossClient(String appId, String appSecret, InputStream confIn) {
    config = new SimbossConfig(null, appId, appSecret).withConf(confIn).build();
  }

  public SimbossClient(String apiUrl, String appId, String appSecret) {
    config = new SimbossConfig(apiUrl, appId, appSecret).build();
  }

  public SimbossClient(String apiUrl, String appId, String appSecret, InputStream confIn) {
    config = new SimbossConfig(apiUrl, appId, appSecret).withConf(confIn).build();
  }

  public SimbossClient(InputStream confIn) {
    config = new SimbossConfig().withConf(confIn).build();
  }

  public <T extends SimbossResponse> T excute(SimbossRequest request) {
    T response = null;
    HttpResponse httpResponse = null;
    HttpEntity resultEntity = null;
    try {
      String url = this.config.getApiUrl() + request.getUri();
      HttpPost post = new HttpPost(url);
      TreeMap<String, String> paramTreeMap = this.getRequestParam(request);
      List<NameValuePair> formparams = new ArrayList<NameValuePair>();
      Set<String> keys = paramTreeMap.keySet();
      for (String key : keys) {
        formparams.add(new BasicNameValuePair(key, paramTreeMap.get(key)));
      }
      UrlEncodedFormEntity paramEntity = new UrlEncodedFormEntity(formparams, defaultCharSet);
      post.setEntity(paramEntity);
      Future<HttpResponse> future = closeableHttpAsyncClient.execute(post, null);
      httpResponse = future.get();
      resultEntity = httpResponse.getEntity();
      String result = EntityUtils.toString(resultEntity, defaultCharSet);
      logger.debug("request url: " + url
        + ", statusCode:" + httpResponse.getStatusLine().getStatusCode()
        + ", param:" + EntityUtils.toString(paramEntity, defaultCharSet)
        + ", result: " + result);
      Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
      response = gson.fromJson(result, request.getResponseType());
    } catch (Exception e) {
      logger.error(e.getMessage(), e);
      response.setSuccess(false);
      response.setMessage(e.getMessage());
      response.setCode("599");
    } finally {
      if (resultEntity != null) {
        EntityUtils.consumeQuietly(httpResponse.getEntity());
      }
    }
    return response;
  }

  private TreeMap<String, String> getRequestParam(SimbossRequest request) {
    TreeMap<String, String> paramTreeMap = request.getParam();
    paramTreeMap.put("appid", config.getAppId());
    paramTreeMap.put("timestamp", System.currentTimeMillis() + "");
    String sign = SignatureUtil.getSignature(paramTreeMap, config.getAppSecret());
    paramTreeMap.put("sign", sign);
    return paramTreeMap;
  }

  public SimbossClient init() {
    try {
      logger.info("start simboss client...");
      if (closeableHttpAsyncClient != null) {
        close();
      }
      IOReactorConfig ioReactorConfig = IOReactorConfig.custom().setIoThreadCount(Runtime.getRuntime().availableProcessors())
        .setConnectTimeout(config.getConnectionTimeout())
        .setSoTimeout(config.getSocketTimeout()).build();
      ConnectingIOReactor ioReactor = new DefaultConnectingIOReactor(ioReactorConfig);

      PoolingNHttpClientConnectionManager connManager = new PoolingNHttpClientConnectionManager(ioReactor);
      ConnectionConfig connectionConfig = ConnectionConfig.custom().setMalformedInputAction(CodingErrorAction.IGNORE)
        .setUnmappableInputAction(CodingErrorAction.IGNORE)
        .setCharset(Charset.forName(defaultCharSet)).build();
      connManager.setDefaultConnectionConfig(connectionConfig);
      connManager.setMaxTotal(config.getPoolMaxTotal());
      connManager.setDefaultMaxPerRoute(config.getPoolDefaultMaxPerRoute());

      closeableHttpAsyncClient = HttpAsyncClients.custom().setConnectionManager(connManager).build();
      closeableHttpAsyncClient.start();
      return this;
    } catch (IOReactorException e) {
      this.close();
      String msg = "start simboss client error, errMsg:" + e.getMessage();
      logger.error(msg, e);
      throw new SimbossException(msg, e);
    }
  }

  public void close() {
    logger.info("close simboss client");
    if (closeableHttpAsyncClient != null) {
      try {
        closeableHttpAsyncClient.close();
      } catch (Exception e) {
        logger.error(e.getMessage(), e);
      }
    }
  }

}
