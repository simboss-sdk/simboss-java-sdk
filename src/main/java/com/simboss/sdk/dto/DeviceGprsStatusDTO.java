package com.simboss.sdk.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeviceGprsStatusDTO implements Serializable {

  private String iccid;

  private String ipAddr;

  private String status;

  private String apn;

  public String getIccid() {
    return iccid;
  }

  public void setIccid(String iccid) {
    this.iccid = iccid;
  }

  public String getIpAddr() {
    return ipAddr;
  }

  public void setIpAddr(String ipAddr) {
    this.ipAddr = ipAddr;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getApn() {
    return apn;
  }

  public void setApn(String apn) {
    this.apn = apn;
  }
}
