package com.simboss.sdk.dto;


/**
 * Created by Abel on 2018/6/21.
 */


public class CardNumDetailDTO {

  /**
   * 集成电路卡识别码 即SIM卡卡号 IC卡的唯一识别号码，共有20位字符组成
   */
  private String iccid;

  /**
   * 国际移动用户识别码 一张SIM具有唯一固定的IMSI，而MSISDN有时会改变
   */
  private String imsi;

  /**
   * 移动台国际用户识别码
   */
  private String msisdn;

  /**
   * 设备IMEI号,国际移动设备识别码
   */
  private String imei;

  public String getIccid() {
    return iccid;
  }

  public void setIccid(String iccid) {
    this.iccid = iccid;
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

  public String getImei() {
    return imei;
  }

  public void setImei(String imei) {
    this.imei = imei;
  }
}
