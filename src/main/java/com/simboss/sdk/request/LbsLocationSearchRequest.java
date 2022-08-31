package com.simboss.sdk.request;

import com.google.gson.reflect.TypeToken;
import com.simboss.sdk.constant.UriConstants;
import com.simboss.sdk.dto.DeviceDetailDTO;
import com.simboss.sdk.dto.LocationDTO;
import com.simboss.sdk.dto.ThreeIdCombineDTO;
import com.simboss.sdk.dto.ThreeIdsCombineDTO;
import com.simboss.sdk.response.SimbossResponse;

import java.lang.reflect.Type;
import java.util.List;
import java.util.TreeMap;

/**
 * 基础类
 * Created by Abel 2018-06-20.
 **/
public class LbsLocationSearchRequest extends ThreeIdCombineDTO implements SimbossRequest{

  @Override
  public String getUri() {
    return UriConstants.URI_LBS_LOCAL_SEARCH;
  }

  @Override
  public TreeMap<String, String> getParam() {
    TreeMap<String, String> map = super.getParam();
    return map;
  }

  @Override
  public Type getResponseType() {
    return new TypeToken<SimbossResponse<LocationDTO>>() {}.getType();
  }
}
