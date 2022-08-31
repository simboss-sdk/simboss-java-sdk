package com.simboss.sdk.dto;

import java.util.List;

/**
 * Created by Zbin on 2019-02-25
 */

public class IccidAndPageDTO {

  private PageDTO page;

  private List<String> list;

  public PageDTO getPage() {
    return page;
  }

  public void setPage(PageDTO page) {
    this.page = page;
  }

  public List<String> getList() {
    return list;
  }

  public void setList(List<String> list) {
    this.list = list;
  }
}
