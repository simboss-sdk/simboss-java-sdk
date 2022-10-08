package com.simboss.sdk.request;

import com.google.gson.reflect.TypeToken;
import com.simboss.sdk.constant.UriConstants;
import com.simboss.sdk.dto.ThreeIdsCombineDTO;
import com.simboss.sdk.exception.SimbossException;
import com.simboss.sdk.response.SimbossResponse;
import java.lang.reflect.Type;
import java.util.List;
import java.util.TreeMap;


public class CombineDeviceRechargeBatchRequest extends ThreeIdsCombineDTO implements SimbossRequest {

  @Override
  public String getUri() {
    return UriConstants.URI_COMBINE_DEVICE_RECHARGE_BATCH;
  }

  @Override
  public TreeMap<String, String> getParam() {
    TreeMap<String, String> map = super.getParam();
    if (ratePlanId == null) {
      throw new SimbossException("param ratePlanId is required");
    }
    map.put("ratePlanId", ratePlanId.toString());
    if (idempotentId==null){
      throw new SimbossException("param idempotentId is required");
    }
    map.put("idempotentId", idempotentId);
    if (externalOrder != null) {
      map.put("externalOrder", externalOrder);
    }
    return map;
  }

  @Override
  public Type getResponseType() {
    return new TypeToken<SimbossResponse<List<String>>>() {
    }.getType();
  }

  private Integer ratePlanId;



  private String externalOrder;

  private String appKey;

  private String idempotentId;

  public Integer getRatePlanId() {
    return ratePlanId;
  }

  public void setRatePlanId(Integer ratePlanId) {
    this.ratePlanId = ratePlanId;
  }

  public String getExternalOrder() {
    return externalOrder;
  }

  public void setExternalOrder(String externalOrder) {
    this.externalOrder = externalOrder;
  }

  public String getAppKey() {
    return appKey;
  }

  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  public String getIdempotentId() {
    return idempotentId;
  }

  public void setIdempotentId(String idempotentId) {
    this.idempotentId = idempotentId;
  }
}
