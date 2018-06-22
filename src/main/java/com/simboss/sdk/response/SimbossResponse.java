package com.simboss.sdk.response;

import com.google.gson.GsonBuilder;

import java.io.Serializable;

/**
 * 基础类
 * Created by Abel 2018-06-20.
 **/
public class SimbossResponse<T> implements Serializable {

  private String message;

  private String detail;

  private String code;

  private Boolean success;

  private T data;

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  @Override
  public String toString() {
return new GsonBuilder().disableHtmlEscaping().setDateFormat("yyyy-MM-dd HH:mm:ss").create().toJson(this);
  }
}
