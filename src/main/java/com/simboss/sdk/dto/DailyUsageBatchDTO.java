package com.simboss.sdk.dto;


import java.io.Serializable;
import java.util.Date;

/**
 * Created by Abel on 2017/6/12.
 */
public class DailyUsageBatchDTO implements Serializable {

  /**
   * ID自增长
   */
  private Long id;

  /**
   * 卡ICCID码
   */
  private String iccid;


  private String imsi;

  /**
   * msisdn
   */
  private String msisdn;

  /**
   * 日用量（单位KB)
   */
  private Double usage;

  /**
   * 使用时长（单位秒）
   */
  private Long duration;

  /**
   * 日用量的日期（yyyy-MM-dd)
   */
  private Date day;

  /**
   * 数据修改时间
   */
  private Date gmtModify;

  private String carrier;

  public String getCarrier() {
    return carrier;
  }

  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  public Date getDay() {
    return day;
  }

  public void setDay(Date day) {
    this.day = day;
  }

  public Long getDuration() {
    return duration;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
  }

  public Date getGmtModify() {
    return gmtModify;
  }

  public void setGmtModify(Date gmtModify) {
    this.gmtModify = gmtModify;
  }

  public String getIccid() {
    return iccid;
  }

  public void setIccid(String iccid) {
    this.iccid = iccid;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Double getUsage() {
    return usage;
  }

  public void setUsage(Double usage) {
    this.usage = usage;
  }

  public String getImsi() {
    return imsi;
  }

  public void setImsi(String imsi) {
    this.imsi = imsi;
  }

  public String getMsisdn() {
    return msisdn;
  }

  public void setMsisdn(String msisdn) {
    this.msisdn = msisdn;
  }
}
