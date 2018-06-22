package com.simboss.sdk.constant;

/**
 * 实名认证证件类型
 */
public enum LicenseType {

  IDCARD("idcard", "身份证"),
  PASSPORT("passport", "护照"),
  MOBILE("mobile", "手机");

  private String val;
  private String desc;

  LicenseType(String val, String desc) {
    this.val = val;
    this.desc = desc;
  }

  public String getVal() {
    return val;
  }

  public String getDesc() {
    return desc;
  }

  public static LicenseType normalize(String val) {
    for (LicenseType licenseType : LicenseType.values()) {
      if (licenseType.getVal().equals(val)) {
        return licenseType;
      }
    }
    return null;
  }



}
