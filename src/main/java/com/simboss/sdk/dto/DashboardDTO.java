package com.simboss.sdk.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * 仪表盘数据对象.
 * Created by jiacheo on 2017/4/25.
 */
public class DashboardDTO implements Serializable {

  private String userAccount;

  private String company;

  private String mobile;

  private String name;

  private Date registerTime;

  private Double balance;

  private CardSummary cardSummary;

  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public CardSummary getCardSummary() {
    return cardSummary;
  }

  public void setCardSummary(CardSummary cardSummary) {
    this.cardSummary = cardSummary;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getRegisterTime() {
    return registerTime;
  }

  public void setRegisterTime(Date registerTime) {
    this.registerTime = registerTime;
  }

  public String getUserAccount() {
    return userAccount;
  }

  public void setUserAccount(String userAccount) {
    this.userAccount = userAccount;
  }

  public static class CardSummary {
    private Integer cmcc;

    private Integer unicom;

    private Integer telcom;

    public Integer getCmcc() {
      return cmcc;
    }

    public void setCmcc(Integer cmcc) {
      this.cmcc = cmcc;
    }

    public Integer getTelcom() {
      return telcom;
    }

    public void setTelcom(Integer telcom) {
      this.telcom = telcom;
    }

    public Integer getUnicom() {
      return unicom;
    }

    public void setUnicom(Integer unicom) {
      this.unicom = unicom;
    }
  }

}
