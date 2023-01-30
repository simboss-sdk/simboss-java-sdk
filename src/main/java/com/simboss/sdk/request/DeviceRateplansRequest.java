package com.simboss.sdk.request;

import com.google.gson.reflect.TypeToken;
import com.simboss.sdk.constant.UriConstants;
import com.simboss.sdk.dto.RatePlansDTO;
import com.simboss.sdk.dto.ThreeIdCombineDTO;
import com.simboss.sdk.response.SimbossResponse;
import java.lang.reflect.Type;
import java.util.List;
import java.util.TreeMap;

/**
 * 基础类 Created by Abel 2018-06-20.
 **/
public class  DeviceRateplansRequest extends ThreeIdCombineDTO implements SimbossRequest {

  @Override
  public String getUri() {
    return UriConstants.URI_DEVICE_RATEPLANS;
  }

  @Override
  public TreeMap<String, String> getParam() {
    TreeMap<String, String> map = super.getParam();
    if (getWithRechargeUnit()!=null){
      map.put("withRechargeUnit",getWithRechargeUnit().toString());
    }
    return map;
  }


  @Override
  public Type getResponseType() {
    return new TypeToken<SimbossResponse<List<RatePlansDTO>>>() {
    }.getType();
  }

  private Boolean withRechargeUnit;

  public Boolean getWithRechargeUnit() {
    return withRechargeUnit;
  }

  public void setWithRechargeUnit(Boolean withRechargeUnit) {
    this.withRechargeUnit = withRechargeUnit;
  }
}
