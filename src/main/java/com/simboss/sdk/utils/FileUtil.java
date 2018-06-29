package com.simboss.sdk.utils;

import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 文件工具类
 * Created by Abel 2018-06-21.
 **/
public class FileUtil {

  private static Logger logger = LoggerFactory.getLogger(FileUtil.class);

  public static String convertFileToBase64(InputStream in) throws IOException {
    return FileUtil.convertFileToBase64(in, false);
  }

  public static String convertFileToBase64(InputStream in, Boolean closeIn) throws IOException {
    try {
      byte[] data = new byte[in.available()];
      in.read(data);
      Base64 encoder = new Base64();
      return encoder.encodeAsString(data);
    } finally {
      if (closeIn) {
        in.close();
      }
    }
  }

}
