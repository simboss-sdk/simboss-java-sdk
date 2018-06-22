package com.simboss.sdk.request;

import com.google.gson.reflect.TypeToken;
import com.simboss.sdk.constant.UriConstants;
import com.simboss.sdk.dto.DeviceDetailDTO;
import com.simboss.sdk.dto.ThreeIdsCombineDTO;
import com.simboss.sdk.response.SimbossResponse;

import java.lang.reflect.Type;
import java.util.List;
import java.util.TreeMap;

/**
 * 基础类
 * Created by Abel 2018-06-20.
 **/
public class DeviceDetailBatchRequest extends ThreeIdsCombineDTO implements SimbossRequest{

  @Override
  public String getUri() {
    return UriConstants.URI_DEVICE_DETAIL_BATCH;
  }

  @Override
  public TreeMap<String, String> getParam() {
    TreeMap<String, String> map = super.getParam();
    return map;
  }

  @Override
  public Type getResponseType() {
    return new TypeToken<SimbossResponse<List<DeviceDetailDTO>>>() {}.getType();
  }
}
