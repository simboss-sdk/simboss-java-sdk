package com.simboss.sdk.dto;

import java.io.Serializable;

public class OrderedPlansDTO implements Serializable {

  private String status;

  private Integer ratePlanId;

  private Double price;

  private Integer timeLength;

  private String timeUnit;

  private Double dataVolume;

  private String name;

  private String type;

  private String description;

  private String effectiveDate;

  private String expirationDate;

  private Boolean unlimitedVolume;

  private Boolean useCountAsVolume;


  private Long offerId;

  private String sequence;

  public Long getOfferId() {
    return offerId;
  }

  public void setOfferId(Long offerId) {
    this.offerId = offerId;
  }

  public String getSequence() {
    return sequence;
  }

  public void setSequence(String sequence) {
    this.sequence = sequence;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
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

  public String getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public String getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }

  public Boolean getUnlimitedVolume() {
    return unlimitedVolume;
  }

  public void setUnlimitedVolume(Boolean unlimitedVolume) {
    this.unlimitedVolume = unlimitedVolume;
  }
}
