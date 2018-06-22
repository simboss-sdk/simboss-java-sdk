package com.simboss.sdk.dto;

import java.io.Serializable;
import java.util.List;

/**
 * 仪表盘数据对象.
 * Created by jiacheo on 2017/4/25.
 */
public class SmsListDTO implements Serializable {

  private List<SmsDTO> list;

  private PageDTO page;

  public List<SmsDTO> getList() {
    return list;
  }

  public void setList(List<SmsDTO> list) {
    this.list = list;
  }

  public PageDTO getPage() {
    return page;
  }

  public void setPage(PageDTO page) {
    this.page = page;
  }
}
