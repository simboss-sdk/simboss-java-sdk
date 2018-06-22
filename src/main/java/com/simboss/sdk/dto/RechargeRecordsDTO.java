package com.simboss.sdk.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RechargeRecordsDTO implements Serializable {

  private String sequence;

  private String orderName;

  private String orderType;

  private Double price;

  private Date createTime;

  private Boolean unlimitedVolume;

  private Integer period;

  private Double dataVolume;

  private String volumePlanType;

  private String volumePlanName;

  public String getSequence() {
    return sequence;
  }

  public void setSequence(String sequence) {
    this.sequence = sequence;
  }

  public String getOrderName() {
    return orderName;
  }

  public void setOrderName(String orderName) {
    this.orderName = orderName;
  }

  public String getOrderType() {
    return orderType;
  }

  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public Boolean getUnlimitedVolume() {
    return unlimitedVolume;
  }

  public void setUnlimitedVolume(Boolean unlimitedVolume) {
    this.unlimitedVolume = unlimitedVolume;
  }

  public Integer getPeriod() {
    return period;
  }

  public void setPeriod(Integer period) {
    this.period = period;
  }

  public Double getDataVolume() {
    return dataVolume;
  }

  public void setDataVolume(Double dataVolume) {
    this.dataVolume = dataVolume;
  }

  public String getVolumePlanType() {
    return volumePlanType;
  }

  public void setVolumePlanType(String volumePlanType) {
    this.volumePlanType = volumePlanType;
  }

  public String getVolumePlanName() {
    return volumePlanName;
  }

  public void setVolumePlanName(String volumePlanName) {
    this.volumePlanName = volumePlanName;
  }
}
