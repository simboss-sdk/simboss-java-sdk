package com.simboss.sdk.dto;



import java.util.List;

/**
 * Created by Abel on 2018/6/21.
 */
public class LbsRecordMapDTO {

  private PageDTO page;

  private List<LbsRecordDetailDTO> list;

  public PageDTO getPage() {
    return page;
  }

  public void setPage(PageDTO page) {
    this.page = page;
  }

  public List<LbsRecordDetailDTO> getList() {
    return list;
  }

  public void setList(List<LbsRecordDetailDTO> list) {
    this.list = list;
  }
}
