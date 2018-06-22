package com.simboss.sdk.dto;

import java.io.Serializable;

public class DeviceUserStatusDTO implements Serializable {

  private String iccid;

  private String status;

  public String getIccid() {
    return iccid;
  }

  public void setIccid(String iccid) {
    this.iccid = iccid;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
