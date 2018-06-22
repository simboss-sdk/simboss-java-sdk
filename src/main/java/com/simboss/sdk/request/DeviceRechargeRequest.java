package com.simboss.sdk.request;

import com.google.gson.reflect.TypeToken;
import com.simboss.sdk.constant.UriConstants;
import com.simboss.sdk.dto.ThreeIdCombineDTO;
import com.simboss.sdk.exception.SimbossException;
import com.simboss.sdk.response.SimbossResponse;

import java.lang.reflect.Type;
import java.util.TreeMap;

/**
 * 基础类
 * Created by Abel 2018-06-20.
 **/
public class DeviceRechargeRequest extends ThreeIdCombineDTO implements SimbossRequest {

  @Override
  public String getUri() {
    return UriConstants.URI_DEVICE_RECHARGE;
  }

  @Override
  public TreeMap<String, String> getParam() {
    TreeMap<String, String> map = super.getParam();
    if (ratePlanId == null) {
      throw new SimbossException("param ratePlanId is required");
    }
    map.put("ratePlanId", ratePlanId.toString());
    month = month == null ? 1 : month;
    map.put("month", month.toString());
    if (externalOrder != null) {
      map.put("externalOrder", externalOrder);
    }
    return map;
  }

  @Override
  public Type getResponseType() {
    return new TypeToken<SimbossResponse>() {}.getType();
  }

  private Integer ratePlanId;

  private Integer month;

  private String externalOrder;

  public Integer getRatePlanId() {
    return ratePlanId;
  }

  public void setRatePlanId(Integer ratePlanId) {
    this.ratePlanId = ratePlanId;
  }

  public Integer getMonth() {
    return month;
  }

  public void setMonth(Integer month) {
    this.month = month;
  }

  public String getExternalOrder() {
    return externalOrder;
  }

  public void setExternalOrder(String externalOrder) {
    this.externalOrder = externalOrder;
  }
}
