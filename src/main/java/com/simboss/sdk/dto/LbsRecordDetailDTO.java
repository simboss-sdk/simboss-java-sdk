package com.simboss.sdk.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Abel on 2018/6/21.
 */

public class LbsRecordDetailDTO implements Serializable {

  public String getTradeNo() {
    return tradeNo;
  }

  public void setTradeNo(String tradeNo) {
    this.tradeNo = tradeNo;
  }

  public Long getRecordId() {
    return recordId;
  }

  public void setRecordId(Long recordId) {
    this.recordId = recordId;
  }

  public String getIccid() {
    return iccid;
  }

  public void setIccid(String iccid) {
    this.iccid = iccid;
  }

  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public String getCoordinate() {
    return coordinate;
  }

  public void setCoordinate(String coordinate) {
    this.coordinate = coordinate;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getQueryType() {
    return queryType;
  }

  public void setQueryType(String queryType) {
    this.queryType = queryType;
  }

  public Double getFee() {
    return fee;
  }

  public void setFee(Double fee) {
    this.fee = fee;
  }

  public Date getQueryDate() {
    return queryDate;
  }

  public void setQueryDate(Date queryDate) {
    this.queryDate = queryDate;
  }

  public Date getLocationDate() {
    return locationDate;
  }

  public void setLocationDate(Date locationDate) {
    this.locationDate = locationDate;
  }

  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }

  /**
   * 交易编号
   */
  private String tradeNo;

  private Long recordId;

  /**
   * 卡号
   */
  private String iccid;

  /**
   * 经度
   */
  private String longitude;

  /**
   * 纬度
   */
  private String latitude;

  /**
   * 坐标系
   */
  private String coordinate;

  /**
   * 地理位置
   */
  private String location;

  /**
   * 查询方式（api/dashboard）
   */
  private String queryType;

  /**
   * 查询费用
   */
  private Double fee;

  /**
   * 查询时间
   */
  private Date queryDate;

  /**
   * 定位时间
   */
  private Date locationDate;

  /**
   * 备注
   */
  private String memo;


}