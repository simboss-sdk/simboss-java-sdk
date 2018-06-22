package com.simboss.sdk.utils;

import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.TreeMap;

/**
 * Created by albin on 2016/11/3.
 */
public class SignatureUtil {

  private static Logger logger = LoggerFactory.getLogger(SignatureUtil.class);

  public static String getSignature(TreeMap<String, String> paramsTreeMap,String appSecret) {
    String sign = "";
    for (String key : paramsTreeMap.keySet()) {
      sign += key + "=" + paramsTreeMap.get(key) + "&";
    }
    if (sign.endsWith("&")) {
      sign = sign.substring(0, sign.length() - 1);
    }
    sign = sign + appSecret;
    String message = "SHA256Hex(" + sign + ")=";
    sign = DigestUtils.sha256Hex(sign);
    logger.debug("sign: " + message + sign);
    return sign;
  }

}
