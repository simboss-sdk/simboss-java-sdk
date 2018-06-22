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
