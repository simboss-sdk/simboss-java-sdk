package com.simboss.sdk.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * 仪表盘数据对象.
 * Created by jiacheo on 2017/4/25.
 */
public class SmsDTO implements Serializable {

  private Long id;

  private String iccid;

  private String carrier;

  private String text;

  private Date sendTime;

  private String type;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getIccid() {
    return iccid;
  }

  public void setIccid(String iccid) {
    this.iccid = iccid;
  }

  public String getCarrier() {
    return carrier;
  }

  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Date getSendTime() {
    return sendTime;
  }

  public void setSendTime(Date sendTime) {
    this.sendTime = sendTime;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
