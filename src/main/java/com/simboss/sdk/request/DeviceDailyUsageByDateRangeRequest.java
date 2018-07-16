package com.simboss.sdk.request;

import com.google.gson.reflect.TypeToken;
import com.simboss.sdk.constant.UriConstants;
import com.simboss.sdk.dto.DailyUsageDTO;
import com.simboss.sdk.dto.ThreeIdCombineDTO;
import com.simboss.sdk.exception.SimbossException;
import com.simboss.sdk.response.SimbossResponse;
import com.simboss.sdk.utils.DateTimeUtil;

import java.lang.reflect.Type;
import java.util.Date;
import java.util.List;
import java.util.TreeMap;

/**
 * 基础类
 * Created by Abel 2018-06-20.
 **/
public class DeviceDailyUsageByDateRangeRequest extends ThreeIdCombineDTO implements SimbossRequest {

  @Override
  public String getUri() {
    return UriConstants.URI_DEVICE_DAILY_USAGE_BY_DATE_RANGE;
  }

  @Override
  public TreeMap<String, String> getParam() {
    TreeMap<String, String> map = super.getParam();
    if (startDate == null) {
      throw new SimbossException("param startDate is required");
    }
    map.put("startDate", DateTimeUtil.convertDateToString(startDate, "yyyy-MM-dd"));
    if (endDate == null) {
      throw new SimbossException("param endDate is required");
    }
    map.put("endDate", DateTimeUtil.convertDateToString(endDate, "yyyy-MM-dd"));
    return map;
  }

  @Override
  public Type getResponseType() {
    return new TypeToken<SimbossResponse<List<DailyUsageDTO>>>() {
    }.getType();
  }

  private Date startDate;

  private Date endDate;

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }
}
