package com.simboss.sdk.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * 仪表盘数据对象.
 * Created by jiacheo on 2017/4/25.
 */
public class DailyUsageDTO implements Serializable {

  private Date date;

  private Double usage;

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Double getUsage() {
    return usage;
  }

  public void setUsage(Double usage) {
    this.usage = usage;
  }
}
