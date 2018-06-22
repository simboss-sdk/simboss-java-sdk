package com.simboss.sdk.dto;

import com.simboss.sdk.exception.SimbossException;
import org.apache.commons.lang.StringUtils;

import java.util.TreeMap;

/**
 * ICCID, MSISDN, IMSI三字段
 * Created by Abel 2018-06-20.
 **/
public class ThreeIdCombineDTO {

  private String iccid;

  private String msisdn;

  private String imsi;

  public String getIccid() {
    return iccid;
  }

  public void setIccid(String iccid) {
    this.iccid = iccid;
  }

  public String getMsisdn() {
    return msisdn;
  }

  public void setMsisdn(String msisdn) {
    this.msisdn = msisdn;
  }

  public String getImsi() {
    return imsi;
  }

  public void setImsi(String imsi) {
    this.imsi = imsi;
  }

  public TreeMap<String, String> getParam() {
    TreeMap<String, String> map = new TreeMap<>();
    if (iccid != null) {
      map.put("iccid", iccid);
    }
    if (msisdn != null) {
      map.put("msisdn", msisdn);
    }
    if (imsi != null) {
      map.put("imsi", imsi);
    }
    if (map.size() < 1) {
      throw new SimbossException("param iccid, msisdn, imsi at least one can't be null");
    }
    return map;
  }
}
