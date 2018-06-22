package com.simboss.sdk.request;

import com.google.gson.reflect.TypeToken;
import com.simboss.sdk.constant.UriConstants;
import com.simboss.sdk.dto.DashboardDTO;
import com.simboss.sdk.response.SimbossResponse;

import java.lang.reflect.Type;
import java.util.TreeMap;

/**
 * 基础类
 * Created by Abel 2018-06-20.
 **/
public class UserDashboardGetRequest implements SimbossRequest {

  @Override
  public String getUri() {
    return UriConstants.URI_USER_DASHBOARD_GET;
  }

  @Override
  public TreeMap<String, String> getParam() {
    return new TreeMap<>();
  }

  @Override
  public Type getResponseType() {
    return new TypeToken<SimbossResponse<DashboardDTO>>() {}.getType();
  }
}
