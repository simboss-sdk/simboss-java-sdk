package com.simboss.sdk.request;

import com.google.gson.reflect.TypeToken;
import com.simboss.sdk.constant.CardStatusConstants;
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
public class SmsSendRequest extends ThreeIdCombineDTO implements SimbossRequest {

  @Override
  public String getUri() {
    return UriConstants.URI_SMS_SEND;
  }

  @Override
  public TreeMap<String, String> getParam() {
    TreeMap<String, String> map = super.getParam();
    if (text == null) {
      throw new SimbossException("param text is required");
    }
    map.put("text", text);
    if (msgId != null) {
      map.put("msgId", msgId);
    }
    return map;
  }

  @Override
  public Type getResponseType() {
    return new TypeToken<SimbossResponse>() {}.getType();
  }

  private String text;

  private String msgId;

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getMsgId() {
    return msgId;
  }

  public void setMsgId(String msgId) {
    this.msgId = msgId;
  }
}
