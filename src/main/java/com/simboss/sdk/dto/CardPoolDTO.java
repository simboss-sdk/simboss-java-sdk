package com.simboss.sdk.dto;

import java.io.Serializable;

/**
 * Created by Abel on 2018/6/21.
 */
public class CardPoolDTO implements Serializable{

  /**
   * 流量池ID
   */
  private Long id;

  /**
   * 流量池规格
   */
  private Integer poolSpecification;
  /**
   * 运营商
   */
  private String carrier;

  /**
   * 总容量
   */
  private Double totalVolume;

  /**
   * 使用量
   */
  private Double useVolume;

  /**
   * 剩余流量
   */
  private Double leftVolume;

  /**
   * 叠加流量
   */
  private Double packageVolume;

  /**
   * 流量使用率
   */
  private Double useRate;


  /**
   * 卡总数
   */
  private Integer totalCount;

  /**
   * 当前激活卡量
   */
  private Integer currentActivationCount;

  /**
   * 当前停卡量
   */
  private Integer currentDeactivationCount;

  /**
   * 当前库存量
   */
  private Integer currentInventoryCount;

  /**
   * 当前测试期卡量
   */
  private Integer currentTestingCount;

  /**
   * 当前销卡的卡量
   */
  private Integer currentRetiredCount;

  /**
   * 待激活数
   */
  private Integer activationReadyCount;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Integer getPoolSpecification() {
    return poolSpecification;
  }

  public void setPoolSpecification(Integer poolSpecification) {
    this.poolSpecification = poolSpecification;
  }

  public String getCarrier() {
    return carrier;
  }

  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  public Double getTotalVolume() {
    return totalVolume;
  }

  public void setTotalVolume(Double totalVolume) {
    this.totalVolume = totalVolume;
  }

  public Double getUseVolume() {
    return useVolume;
  }

  public void setUseVolume(Double useVolume) {
    this.useVolume = useVolume;
  }

  public Double getLeftVolume() {
    return leftVolume;
  }

  public void setLeftVolume(Double leftVolume) {
    this.leftVolume = leftVolume;
  }

  public Double getPackageVolume() {
    return packageVolume;
  }

  public void setPackageVolume(Double packageVolume) {
    this.packageVolume = packageVolume;
  }

  public Double getUseRate() {
    return useRate;
  }

  public void setUseRate(Double useRate) {
    this.useRate = useRate;
  }

  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public Integer getCurrentActivationCount() {
    return currentActivationCount;
  }

  public void setCurrentActivationCount(Integer currentActivationCount) {
    this.currentActivationCount = currentActivationCount;
  }

  public Integer getCurrentDeactivationCount() {
    return currentDeactivationCount;
  }

  public void setCurrentDeactivationCount(Integer currentDeactivationCount) {
    this.currentDeactivationCount = currentDeactivationCount;
  }

  public Integer getCurrentInventoryCount() {
    return currentInventoryCount;
  }

  public void setCurrentInventoryCount(Integer currentInventoryCount) {
    this.currentInventoryCount = currentInventoryCount;
  }

  public Integer getCurrentTestingCount() {
    return currentTestingCount;
  }

  public void setCurrentTestingCount(Integer currentTestingCount) {
    this.currentTestingCount = currentTestingCount;
  }

  public Integer getCurrentRetiredCount() {
    return currentRetiredCount;
  }

  public void setCurrentRetiredCount(Integer currentRetiredCount) {
    this.currentRetiredCount = currentRetiredCount;
  }

  public Integer getActivationReadyCount() {
    return activationReadyCount;
  }

  public void setActivationReadyCount(Integer activationReadyCount) {
    this.activationReadyCount = activationReadyCount;
  }
}
