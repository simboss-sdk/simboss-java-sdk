package com.simboss.sdk.conf;

import com.simboss.sdk.exception.SimbossException;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 配置信息
 * Created by Abel 2018-06-20.
 **/
public class SimbossConfig {

  private Logger logger = LoggerFactory.getLogger(SimbossConfig.class);

  private Integer connectionTimeout;

  private Integer socketTimeout;

  private Integer poolDefaultMaxPerRoute;

  private Integer poolMaxTotal;

  private String apiUrl;

  private String appId;

  private String appSecret;

  private Properties properties;

  public SimbossConfig() {
  }

  public SimbossConfig(String apiUrl, String appId, String appSecret) {
    setApiUrl(apiUrl);
    setAppId(appId);
    setAppSecret(appSecret);
  }

  public SimbossConfig withConf(String filePath) {
    FileInputStream in = null;
    try {
      in = new FileInputStream(filePath);
      Properties properties = new Properties();
      properties.load(in);
    } catch (IOException e) {
      throw new SimbossException("load config file error, errMsg:" + e.getMessage(), e);
    } finally {
      if (in != null) {
        try {
          in.close();
        } catch (IOException e) {
          logger.error(e.getMessage(), e);
        }
      }
    }
    return this;
  }

  public SimbossConfig withConf(InputStream in) {
    Properties properties = null;
    try {
      properties = new Properties();
      properties.load(in);
    } catch (IOException e) {
      logger.error(e.getMessage(), e);
    } finally {
      if (in != null) {
        try {
          in.close();
        } catch (IOException e) {
          logger.error(e.getMessage(), e);
        }
      }
    }
    this.withConfig(properties);
    return this;
  }

  public SimbossConfig withConfig(Properties properties) {
    this.properties = properties;
    return this;
  }

  public SimbossConfig build() {
    if (properties == null) {
      logger.info("no custom config, use system detail");
      properties = new Properties();
      InputStream in = null;
      try {
        in = SimbossConfig.class.getResourceAsStream("/simboss.properties");
        properties.load(in);
      } catch (IOException e) {
        e.printStackTrace();
      } finally {
        if (in != null) {
          try {
            in.close();
          } catch (IOException e) {
            logger.error(e.getMessage(), e);
          }
        }
      }
    }
    if (properties == null) {
      return this;
    }
    //http
    setConnectionTimeout(this.getConfInt(properties, "http.connection.timeout", "10000"));
    setSocketTimeout(this.getConfInt(properties, "http.socket.timeout", "30000"));
    setPoolDefaultMaxPerRoute(this.getConfInt(properties, "http.pool.defaultMaxPerRoute", "50"));
    setPoolMaxTotal(this.getConfInt(properties, "http.pool.maxTotal", "50"));
    //api
    if (StringUtils.isBlank(this.getApiUrl())) {
      setApiUrl(properties.getProperty("simboss.api.url", "https://api.simboss.com"));
    }
    if (StringUtils.isBlank(this.getAppId())) {
      setAppId(properties.getProperty("simboss.api.appId"));
    }
    if (StringUtils.isBlank(this.getAppSecret())) {
      setAppSecret(properties.getProperty("simboss.api.appSecret"));
    }
    properties = null;
    return this;
  }


  private Integer getConfInt(Properties properties, String key, String defVal) {
    String v = properties.getProperty(key, defVal);
    return Integer.parseInt(v);
  }


  public Integer getConnectionTimeout() {
    return connectionTimeout;
  }

  public void setConnectionTimeout(Integer connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
  }

  public Integer getSocketTimeout() {
    return socketTimeout;
  }

  public void setSocketTimeout(Integer socketTimeout) {
    this.socketTimeout = socketTimeout;
  }

  public Integer getPoolDefaultMaxPerRoute() {
    return poolDefaultMaxPerRoute;
  }

  public void setPoolDefaultMaxPerRoute(Integer poolDefaultMaxPerRoute) {
    this.poolDefaultMaxPerRoute = poolDefaultMaxPerRoute;
  }

  public Integer getPoolMaxTotal() {
    return poolMaxTotal;
  }

  public void setPoolMaxTotal(Integer poolMaxTotal) {
    this.poolMaxTotal = poolMaxTotal;
  }

  public String getApiUrl() {
    return apiUrl;
  }

  public void setApiUrl(String apiUrl) {
    this.apiUrl = apiUrl;
  }

  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public String getAppSecret() {
    return appSecret;
  }

  public void setAppSecret(String appSecret) {
    this.appSecret = appSecret;
  }
}
