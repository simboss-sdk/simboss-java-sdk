package com.simboss.sdk.constant;

/**
 * 设备类型
 */
public interface CardStatusConstants {

  /**
   * 达量断网状态
   */
  enum CarrierStatus {

    ACTIVATED_NAME("ACTIVATED_NAME", "开启"),
    DEACTIVATED_NAME("DEACTIVATED_NAME", "关闭");

    private String val;
    private String desc;

    CarrierStatus(String val, String desc) {
      this.val = val;
      this.desc = desc;
    }

    public String getVal() {
      return val;
    }

    public String getDesc() {
      return desc;
    }

    public static CarrierStatus normalize(String val) {
      for (CarrierStatus status : CarrierStatus.values()) {
        if (status.getVal().equals(val)) {
          return status;
        }
      }
      return null;
    }

  }


}
