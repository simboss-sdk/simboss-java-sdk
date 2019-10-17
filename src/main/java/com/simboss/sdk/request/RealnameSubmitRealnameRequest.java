package com.simboss.sdk.request;

import com.google.gson.reflect.TypeToken;
import com.simboss.sdk.constant.LicenseType;
import com.simboss.sdk.constant.UriConstants;
import com.simboss.sdk.dto.ThreeIdCombineDTO;
import com.simboss.sdk.exception.SimbossException;
import com.simboss.sdk.response.SimbossResponse;
import com.simboss.sdk.utils.FileUtil;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.TreeMap;

/**
 * 基础类 Created by Abel 2018-06-20.
 **/
public class RealnameSubmitRealnameRequest extends ThreeIdCombineDTO implements SimbossRequest {

  @Override
  public String getUri() {
    return UriConstants.URI_REALNAME_SUBMIT_REALNAME;
  }

  @Override
  public TreeMap<String, String> getParam() {
    TreeMap<String, String> map = super.getParam();
    if (name == null) {
      throw new SimbossException("param name is required");
    }
    map.put("name", name);
    if (licenseType == null) {
      throw new SimbossException("param licenseType is required");
    }
    map.put("licenseType", licenseType.getVal());
    if (licenseCode == null) {
      throw new SimbossException("param licenseCode is required");
    }
    map.put("licenseCode", licenseCode);
    if (phone == null) {
      throw new SimbossException("param phone is required");
    }
    map.put("phone", phone);
    if (extenalUserName != null) {
      map.put("extenalUserName", extenalUserName);
    }
    if (pic1 == null) {
      throw new SimbossException("param pic1 is required");
    }
    map.put("pic1", pic1);

    if (pic2 == null) {
      throw new SimbossException("param pic2 is required");
    }
    map.put("pic2", pic2);

    if (pic3 != null) {
      map.put("pic3", pic3);
    }
    return map;
  }

  @Override
  public Type getResponseType() {
    return new TypeToken<SimbossResponse>() {
    }.getType();
  }

  private String name;

  private LicenseType licenseType;

  private String licenseCode;

  private String phone;

  private String extenalUserName;

  private String pic1;

  private String pic2;

  private String pic3;

  private String deviceid;

  public String getDeviceid() {
    return deviceid;
  }

  public void setDeviceid(String deviceid) {
    this.deviceid = deviceid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LicenseType getLicenseType() {
    return licenseType;
  }

  public void setLicenseType(LicenseType licenseType) {
    this.licenseType = licenseType;
  }

  public String getLicenseCode() {
    return licenseCode;
  }

  public void setLicenseCode(String licenseCode) {
    this.licenseCode = licenseCode;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getExtenalUserName() {
    return extenalUserName;
  }

  public void setExtenalUserName(String extenalUserName) {
    this.extenalUserName = extenalUserName;
  }

  public String getPic1() {
    return pic1;
  }

  public void setPic1(String pic1Base64Str) {
    this.pic1 = pic1;
  }

  public void setPic1(InputStream pic1In) throws IOException {
    this.pic1 = FileUtil.convertFileToBase64(pic1In);
  }

  public String getPic2() {
    return pic2;
  }

  public void setPic2(String pic2Base64Str) {
    this.pic2 = pic2;
  }

  public void setPic2(InputStream pic2In) throws IOException {
    this.pic2 = FileUtil.convertFileToBase64(pic2In);
  }

  public String getPic3() {
    return pic3;
  }

  public void setPic3(String pic3Base64Str) {
    this.pic3 = pic3;
  }

  public void setPic3(InputStream pic3In) throws IOException {
    this.pic3 = FileUtil.convertFileToBase64(pic3In);
  }
}
