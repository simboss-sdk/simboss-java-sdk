package com.simboss.sdk.dto;

/**
 * 分页
 * Created by Abel 2018-06-21.
 **/
public class PageDTO {

  private Integer pageNo;

  private Integer pageSize;

  private Integer total;

  public Integer getPageNo() {
    return pageNo;
  }

  public void setPageNo(Integer pageNo) {
    this.pageNo = pageNo;
  }

  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }
}
