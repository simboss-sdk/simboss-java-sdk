package com.simboss.sdk.request;

import java.lang.reflect.Type;
import java.util.TreeMap;

/**
 * 基础类
 * Created by Abel 2018-06-20.
 **/
public interface SimbossRequest {

  String getUri();

  TreeMap<String, String> getParam();

  Type getResponseType();
}
