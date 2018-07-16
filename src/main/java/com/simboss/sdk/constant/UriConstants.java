package com.simboss.sdk.constant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Properties;

/**
 * URI常量
 * Created by Abel 2018-06-20.
 **/
public class UriConstants {

  private Logger logger = LoggerFactory.getLogger(UriConstants.class);

  private static Properties properties = new Properties();

  static {
    try {
      properties.load(UriConstants.class.getResourceAsStream("/simboss-uri.properties"));
    } catch (IOException e) {

    }
  }

  public static final String URI_USER_DASHBOARD_GET = properties.getProperty("uri.user.dashboard.get", "/2.0/user/dashboard/get");

  public static final String URI_DEVICE_DETAIL_BATCH = properties.getProperty("uri.device.detail.batch", "/2.0/device/detail/batch");

  public static final String URI_DEVICE_DETAIL = properties.getProperty("uri.device.detail", "/2.0/device/detail");

  public static final String URI_DEVICE_ORDERED_PLANS = properties.getProperty("uri.device.ordered.plans", "/2.0/device/orderedPlans");

  public static final String URI_DEVICE_RATEPLANS = properties.getProperty("uri.device.rateplans", "/2.0/device/rateplans");

  public static final String URI_DEVICE_RECHARGE = properties.getProperty("uri.device.recharge", "/2.0/device/recharge");

  public static final String URI_DEVICE_RECHARGE_RECORDS = properties.getProperty("uri.device.recharge.records", "/2.0/device/recharge/records");

  public static final String URI_DEVICE_GPRS_STATUS = properties.getProperty("uri.device.gprsStatus", "/2.0/device/gprsStatus");

  public static final String URI_DEVICE_USER_STATUS = properties.getProperty("uri.device.user.status", "/2.0/device/userStatus");

  public static final String URI_DEVICE_RUNNING_STATUS = properties.getProperty("uri.device.running.status", "/2.0/device/runningStatus");

  public static final String URI_DEVICE_RATEPLAN_SUMMARY = properties.getProperty("uri.device.rateplan.summary", "/2.0/device/ratePlan/summary");

  public static final String URI_DEVICE_MODIFY_DEVICE_STATUS = properties.getProperty("uri.device.modify.device.status", "/2.0/device/modifyDeviceStatus");

  public static final String URI_DEVICE_DAILY_USAGE = properties.getProperty("uri.device.daily.usage", "/2.0/device/dailyUsage");

  public static final String URI_DEVICE_DAILY_USAGE_BY_DATE_RANGE = properties.getProperty("uri.device.daily.usage.rangedate", "/2.0/device/dailyUsageByDateRange");

  public static final String URI_DEVICE_CANCEL_TESTING = properties.getProperty("uri.device.cancel.testing", "/2.0/device/cancelTesting");

  public static final String URI_DEVICE_MEMO_UPDATE = properties.getProperty("uri.device.memo.update", "/2.0/device/memo/update");

  public static final String URI_DEVICE_MEMO_BATCH_UPDATE = properties.getProperty("uri.device.memo.batch.update", "/2.0/device/memo/batchUpdate");

  public static final String URI_CARD_POOL_DETAIL = properties.getProperty("uri.card.pool.detail", "/2.0/card/pool/detail");

  public static final String URI_CARD_POOL_LIST = properties.getProperty("uri.card.pool.list", "/2.0/card/pool/list");

  public static final String URI_REALNAME_SUBMIT_REALNAME = properties.getProperty("uri.realname.submit.realname", "/2.0/realname/submitRealname");

  public static final String URI_SMS_SEND = properties.getProperty("uri.sms.send", "/2.0/sms/send");

  public static final String URI_SMS_LIST = properties.getProperty("uri.sms.list", "/2.0/sms/list");

}
