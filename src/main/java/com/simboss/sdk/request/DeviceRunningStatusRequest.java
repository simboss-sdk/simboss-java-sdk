package com.simboss.sdk.request;

import com.google.gson.reflect.TypeToken;
import com.simboss.sdk.constant.UriConstants;
import com.simboss.sdk.dto.DeviceGprsStatusDTO;
import com.simboss.sdk.dto.DeviceRunningStatusDTO;
import com.simboss.sdk.dto.ThreeIdCombineDTO;
import com.simboss.sdk.response.SimbossResponse;

import java.lang.reflect.Type;
import java.util.TreeMap;

/**
 * 基础类
 * Created by Abel 2018-06-20.
 **/
public class DeviceRunningStatusRequest extends ThreeIdCombineDTO implements SimbossRequest{

  @Override
  public String getUri() {
    return UriConstants.URI_DEVICE_RUNNING_STATUS;
  }

  @Override
  public TreeMap<String, String> getParam() {
    TreeMap<String, String> map = super.getParam();
    return map;
  }

  @Override
  public Type getResponseType() {
    return new TypeToken<SimbossResponse<DeviceRunningStatusDTO>>() {}.getType();
  }
}
