package com.simboss.sdk.dto;

import java.io.Serializable;
import java.util.Date;

public class RechargeRecordsDTO implements Serializable {

  private String iccid;

  private String externalOrder;

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

  private String type;

  private Double aclPolicyWhitePrice;


  private Double networkFee;

  public Double getNetworkFee() {
    return networkFee;
  }

  public void setNetworkFee(Double networkFee) {
    this.networkFee = networkFee;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Double getAclPolicyWhitePrice() {
    return aclPolicyWhitePrice;
  }

  public void setAclPolicyWhitePrice(Double aclPolicyWhitePrice) {
    this.aclPolicyWhitePrice = aclPolicyWhitePrice;
  }

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

  public String getIccid() {
    return iccid;
  }

  public void setIccid(String iccid) {
    this.iccid = iccid;
  }

  public String getExternalOrder() {
    return externalOrder;
  }

  public void setExternalOrder(String externalOrder) {
    this.externalOrder = externalOrder;
  }
}
