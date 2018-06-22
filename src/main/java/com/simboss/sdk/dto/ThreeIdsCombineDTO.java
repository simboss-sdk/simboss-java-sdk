package com.simboss.sdk.dto;

import com.simboss.sdk.exception.SimbossException;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * ICCID, MSISDN, IMSI三字段
 * Created by Abel 2018-06-20.
 **/
public class ThreeIdsCombineDTO {

  private List<String> iccids;

  private List<String> msisdns;

  private List<String> imsis;

  public List<String> getIccids() {
    return iccids;
  }

  public void setIccids(List<String> iccids) {
    this.iccids = iccids;
  }

  public void addIccid(String iccid) {
    if (iccids == null) {
      iccids = new ArrayList<>();
    }
    iccids.add(iccid);
  }

  public List<String> getMsisdns() {
    return msisdns;
  }

  public void setMsisdns(List<String> msisdns) {
    this.msisdns = msisdns;
  }

  public void addMsisdn(String msisdn) {
    if (msisdns == null) {
      msisdns = new ArrayList<>();
    }
    msisdns.add(msisdn);
  }

  public List<String> getImsis() {
    return imsis;
  }

  public void setImsis(List<String> imsis) {
    this.imsis = imsis;
  }

  public void addImsi(String imsi) {
    if (imsis == null) {
      imsis = new ArrayList<>();
    }
    imsis.add(imsi);
  }

  public TreeMap<String, String> getParam() {
    TreeMap<String, String> map = new TreeMap<>();
    String separator = ",";
    if (iccids != null) {
      map.put("iccids", StringUtils.join(iccids, separator));
    }
    if (msisdns != null) {
      map.put("msisdns", StringUtils.join(msisdns, separator));
    }
    if (imsis != null) {
      map.put("imsis", StringUtils.join(imsis, separator));
    }
    if (map.size() < 1) {
      throw new SimbossException("param iccids, msisdns, imsis at least one can't be null");
    }
    return map;
  }

}
