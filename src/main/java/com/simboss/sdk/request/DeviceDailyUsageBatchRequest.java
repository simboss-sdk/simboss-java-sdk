package com.simboss.sdk.request;

import com.google.gson.reflect.TypeToken;
import com.simboss.sdk.constant.UriConstants;
import com.simboss.sdk.dto.DailyUsageDTO;
import com.simboss.sdk.dto.DailyUsageListDTO;
import com.simboss.sdk.dto.ThreeIdCombineDTO;
import com.simboss.sdk.exception.SimbossException;
import com.simboss.sdk.response.SimbossResponse;
import com.simboss.sdk.utils.DateTimeUtil;

import java.lang.reflect.Type;
import java.util.Date;
import java.util.TreeMap;

/**
 * 基础类
 * Created by Abel 2018-06-20.
 **/
public class DeviceDailyUsageBatchRequest extends ThreeIdCombineDTO implements SimbossRequest {

  @Override
  public String getUri() {
    return UriConstants.URI_DEVICE_DAILY_USAGE_BATCH;
  }

  @Override
  public TreeMap<String, String> getParam() {
    TreeMap<String, String> map = super.getParam();
    if (date == null) {
      throw new SimbossException("param date is required");
    }
    map.put("date", DateTimeUtil.convertDateToString(date, "yyyy-MM-dd"));
    return map;
  }

  @Override
  public Type getResponseType() {
    return new TypeToken<SimbossResponse<DailyUsageListDTO>>() {
    }.getType();
  }

  private Date date;

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }
}
