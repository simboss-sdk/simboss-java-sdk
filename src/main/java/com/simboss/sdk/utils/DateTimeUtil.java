package com.simboss.sdk.utils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeUtil {

  private static Log log = LogFactory.getLog(DateTimeUtil.class);

  /**
   * 以指定的格式来格式化日期
   *
   * @param date   Date
   * @param format String
   * @return String
   */
  public static String convertDateToString(Date date, String format) {
    String result = "";
    if (date != null) {
      try {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        result = sdf.format(date);
      } catch (Exception ex) {
        ex.printStackTrace();
      }
    }
    return result;
  }

  /**
   * 日相加
   *
   * @param date 日期
   * @param day  天数
   * @return 返回相加后的日期
   */
  public static Date addDate(Date date, int day) {
    Calendar c = Calendar.getInstance();
    c.setTime(date);
    c.add(Calendar.DAY_OF_MONTH, day);
    return c.getTime();
  }

}


