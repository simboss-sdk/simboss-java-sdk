package com.simboss.sdk.dto;

import java.io.Serializable;

public class RatePlansDTO implements Serializable {

  private Integer ratePlanId;

  private Double price;

  private Integer timeLength;

  private String timeUnit;

  private Double dataVolume;

  private String name;

  private String type;

  private String description;

  private Boolean unlimitedVolume;

  private Integer rechargeUnit;

  private Double aclPolicyWhitePrice;

  private Boolean useCountAsVolume;

  /**
   * 最大可续费份数
   */
  private Integer maxRechargePeriod;

  /**
   * 网络功能费用
   */
  private Double networkFee;

  public Integer getMaxRechargePeriod() {
    return maxRechargePeriod;
  }

  public void setMaxRechargePeriod(Integer maxRechargePeriod) {
    this.maxRechargePeriod = maxRechargePeriod;
  }

  public Double getNetworkFee() {
    return networkFee;
  }

  public void setNetworkFee(Double networkFee) {
    this.networkFee = networkFee;
  }

  public Integer getRechargeUnit() {
    return rechargeUnit;
  }

  public void setRechargeUnit(Integer rechargeUnit) {
    this.rechargeUnit = rechargeUnit;
  }

  public Double getAclPolicyWhitePrice() {
    return aclPolicyWhitePrice;
  }

  public void setAclPolicyWhitePrice(Double aclPolicyWhitePrice) {
    this.aclPolicyWhitePrice = aclPolicyWhitePrice;
  }

  public Boolean getUseCountAsVolume() {
    return useCountAsVolume;
  }

  public void setUseCountAsVolume(Boolean useCountAsVolume) {
    this.useCountAsVolume = useCountAsVolume;
  }

  public Integer getRatePlanId() {
    return ratePlanId;
  }

  public void setRatePlanId(Integer ratePlanId) {
    this.ratePlanId = ratePlanId;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Integer getTimeLength() {
    return timeLength;
  }

  public void setTimeLength(Integer timeLength) {
    this.timeLength = timeLength;
  }

  public String getTimeUnit() {
    return timeUnit;
  }

  public void setTimeUnit(String timeUnit) {
    this.timeUnit = timeUnit;
  }

  public Double getDataVolume() {
    return dataVolume;
  }

  public void setDataVolume(Double dataVolume) {
    this.dataVolume = dataVolume;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Boolean getUnlimitedVolume() {
    return unlimitedVolume;
  }

  public void setUnlimitedVolume(Boolean unlimitedVolume) {
    this.unlimitedVolume = unlimitedVolume;
  }
}
