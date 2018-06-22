package com.simboss.sdk.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeviceDetailDTO implements Serializable {

  /**
   * iccid
   *
   * @ref https://baike.baidu.com/item/iccid/5181544
   */
  private String iccid;

  /**
   * imsi
   *
   * @ref https://baike.baidu.com/item/imsi/307249
   */
  private String imsi;

  /**
   * msisdn
   */
  private String msisdn;

  /**
   * 运营商
   *
   */
  private String carrier;

  /**
   * 卡片类型：单卡: SINGLE，流量池: POOL
   */
  private String type;

  /**
   * 状态
   *
   */
  private String status;

  /**
   * 设备状态
   *
   */
  private String deviceStatus;

  /**
   * 出库时间
   */
  private Date openDate;

  /**
   * 激活时间
   */
  private Date startDate;

  /**
   * 过期时间
   */
  private Date expireDate;

  /**
   * 套餐流量最后更新时间
   */
  private Date lastSyncDate;

  /**
   * 激活宽限期(天）
   */
  private Integer activeDuration;

  /**
   * 卡备注
   */
  private String memo;

  /**
   * 是否需要实名认证
   */
  private Boolean realnameRequired;

  /**
   * 实名认证用户姓名
   */
  private String realName;

  /**
   * 卡实名审核状态，审核通过：pass、未提交：not-submit、审核不通过：not-pass、待审核：not-audit
   */
  private String realNameCertifystatus;

  /**
   * 流量池ID
   */
  private Long cardPoolId;

  /**
   * 测试期结束时间
   */
  private Date testingExpireDate;

  /**
   * 套餐id
   */
  private Long ratePlanId;

  /**
   * 套餐名称
   */
  private String iratePlanName;

  /**
   * 套使用量(MB)
   */
  private Double usedDataVolume;

  /**
   * 当前套餐总流量(MB)
   */
  private Double totalDataVolume;

  /**
   * 当前套餐生效时间
   */
  private Date ratePlanEffetiveDate;

  /**
   * 当前套餐失效时间
   */
  private Date ratePlanExpirationDate;

  /**
   * 套餐当月用量
   */
  private Double dataUsage;

  /**
   *
   */
  private List<String> functions;

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

  public String getCarrier() {
    return carrier;
  }

  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getDeviceStatus() {
    return deviceStatus;
  }

  public void setDeviceStatus(String deviceStatus) {
    this.deviceStatus = deviceStatus;
  }

  public Date getOpenDate() {
    return openDate;
  }

  public void setOpenDate(Date openDate) {
    this.openDate = openDate;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Date getExpireDate() {
    return expireDate;
  }

  public void setExpireDate(Date expireDate) {
    this.expireDate = expireDate;
  }

  public Date getLastSyncDate() {
    return lastSyncDate;
  }

  public void setLastSyncDate(Date lastSyncDate) {
    this.lastSyncDate = lastSyncDate;
  }

  public Integer getActiveDuration() {
    return activeDuration;
  }

  public void setActiveDuration(Integer activeDuration) {
    this.activeDuration = activeDuration;
  }

  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }

  public Boolean getRealnameRequired() {
    return realnameRequired;
  }

  public void setRealnameRequired(Boolean realnameRequired) {
    this.realnameRequired = realnameRequired;
  }

  public String getRealName() {
    return realName;
  }

  public void setRealName(String realName) {
    this.realName = realName;
  }

  public String getRealNameCertifystatus() {
    return realNameCertifystatus;
  }

  public void setRealNameCertifystatus(String realNameCertifystatus) {
    this.realNameCertifystatus = realNameCertifystatus;
  }

  public Long getCardPoolId() {
    return cardPoolId;
  }

  public void setCardPoolId(Long cardPoolId) {
    this.cardPoolId = cardPoolId;
  }

  public Date getTestingExpireDate() {
    return testingExpireDate;
  }

  public void setTestingExpireDate(Date testingExpireDate) {
    this.testingExpireDate = testingExpireDate;
  }

  public Long getRatePlanId() {
    return ratePlanId;
  }

  public void setRatePlanId(Long ratePlanId) {
    this.ratePlanId = ratePlanId;
  }

  public String getIratePlanName() {
    return iratePlanName;
  }

  public void setIratePlanName(String iratePlanName) {
    this.iratePlanName = iratePlanName;
  }

  public Double getUsedDataVolume() {
    return usedDataVolume;
  }

  public void setUsedDataVolume(Double usedDataVolume) {
    this.usedDataVolume = usedDataVolume;
  }

  public Double getTotalDataVolume() {
    return totalDataVolume;
  }

  public void setTotalDataVolume(Double totalDataVolume) {
    this.totalDataVolume = totalDataVolume;
  }

  public Date getRatePlanEffetiveDate() {
    return ratePlanEffetiveDate;
  }

  public void setRatePlanEffetiveDate(Date ratePlanEffetiveDate) {
    this.ratePlanEffetiveDate = ratePlanEffetiveDate;
  }

  public Date getRatePlanExpirationDate() {
    return ratePlanExpirationDate;
  }

  public void setRatePlanExpirationDate(Date ratePlanExpirationDate) {
    this.ratePlanExpirationDate = ratePlanExpirationDate;
  }

  public Double getDataUsage() {
    return dataUsage;
  }

  public void setDataUsage(Double dataUsage) {
    this.dataUsage = dataUsage;
  }

  public List<String> getFunctions() {
    return functions;
  }

  public void setFunctions(List<String> functions) {
    this.functions = functions;
  }

  public void addFunctions(String functionName) {
    if (this.functions == null) {
      this.functions = new ArrayList<>();
    }
    this.functions.add(functionName);
  }
}
