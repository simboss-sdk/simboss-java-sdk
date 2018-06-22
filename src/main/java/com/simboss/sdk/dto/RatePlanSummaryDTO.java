package com.simboss.sdk.dto;

import java.io.Serializable;
import java.util.Date;

public class RatePlanSummaryDTO implements Serializable {

  private String iccid;

  private Double volumeSummary;

  private Date expirationDate;

  public String getIccid() {
    return iccid;
  }

  public void setIccid(String iccid) {
    this.iccid = iccid;
  }

  public Double getVolumeSummary() {
    return volumeSummary;
  }

  public void setVolumeSummary(Double volumeSummary) {
    this.volumeSummary = volumeSummary;
  }

  public Date getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(Date expirationDate) {
    this.expirationDate = expirationDate;
  }
}
