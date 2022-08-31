package com.simboss.sdk.request;

import com.google.gson.reflect.TypeToken;
import com.simboss.sdk.constant.UriConstants;
import com.simboss.sdk.dto.IccidAndPageDTO;
import com.simboss.sdk.dto.SmsListDTO;
import com.simboss.sdk.dto.ThreeIdCombineDTO;
import com.simboss.sdk.exception.SimbossException;
import com.simboss.sdk.response.SimbossResponse;

import java.lang.reflect.Type;
import java.util.TreeMap;

/**
 * 基础类
 * Created by Abel 2018-06-20.
 **/
public class IccidListRequest extends ThreeIdCombineDTO implements SimbossRequest {

  @Override
  public String getUri() {
    return UriConstants.URI_ICCID_LIST;
  }

  @Override
  public TreeMap<String, String> getParam() {
    TreeMap<String, String> map = super.getParam();
    if (pageNo == null) {
      throw new SimbossException("param pageNo is required");
    }
    map.put("pageNo", pageNo.toString());
    return map;
  }

  @Override
  public Type getResponseType() {
    return new TypeToken<SimbossResponse<IccidAndPageDTO>>() {}.getType();
  }

  private Integer pageNo;

  public Integer getPageNo() {
    return pageNo;
  }

  public void setPageNo(Integer pageNo) {
    this.pageNo = pageNo;
  }
}
