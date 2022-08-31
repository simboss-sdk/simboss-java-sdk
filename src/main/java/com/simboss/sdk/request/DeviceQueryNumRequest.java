package com.simboss.sdk.request;

import com.google.gson.reflect.TypeToken;
import com.simboss.sdk.constant.UriConstants;
import com.simboss.sdk.dto.CardNumDetailDTO;
import com.simboss.sdk.dto.ThreeIdsCombineDTO;
import com.simboss.sdk.exception.SimbossException;
import com.simboss.sdk.response.SimbossResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * 基础类
 * Created by Abel 2018-06-20.
 **/
public class DeviceQueryNumRequest extends ThreeIdsCombineDTO implements SimbossRequest {

  @Override
  public String getUri() {
    return UriConstants.URI_DEVICE_QUERYNUM;
  }

  @Override
  public TreeMap<String, String> getParam() {
    TreeMap<String, String> map = super.getParam();
    return map;
  }

  @Override
  public Type getResponseType() {
    return new TypeToken<SimbossResponse<List<CardNumDetailDTO>>>() {}.getType();
  }


  private List<String> imeis;

  public List<String> getImeis() {
    return imeis;
  }

  public void setImeis(List<String> imeis) {
    this.imeis = imeis;
  }

  public void addImeis(String imei) {
    if (imeis == null) {
      imeis = new ArrayList<>();
    }
    imeis.add(imei);
  }
}
