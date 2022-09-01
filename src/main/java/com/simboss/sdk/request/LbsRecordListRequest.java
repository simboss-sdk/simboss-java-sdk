package com.simboss.sdk.request;

import com.google.gson.reflect.TypeToken;
import com.simboss.sdk.constant.UriConstants;
import com.simboss.sdk.dto.CardPoolDTO;
import com.simboss.sdk.dto.ThreeIdCombineDTO;
import com.simboss.sdk.dto.ThreeIdsCombineDTO;
import com.simboss.sdk.response.SimbossResponse;

import java.lang.reflect.Type;
import java.util.List;
import java.util.TreeMap;

/**
 * 基础类
 * Created by Abel 2018-06-20.
 **/
public class LbsRecordListRequest extends ThreeIdCombineDTO implements SimbossRequest {

  @Override
  public String getUri() {
    return UriConstants.URI_LBS_RECORD_LIST;
  }

  @Override
  public TreeMap<String, String> getParam() {
    TreeMap map=new TreeMap<>();
    if (pageNo!=null){
      map.put("pageNo",pageNo);
    }
    return map;
  }

  @Override
  public Type getResponseType() {
    return new TypeToken<SimbossResponse<List<CardPoolDTO>>>() {}.getType();
  }

  private Integer pageNo;

  public Integer getPageNo() {
    return pageNo;
  }

  public void setPageNo(Integer pageNo) {
    this.pageNo = pageNo;
  }
}
