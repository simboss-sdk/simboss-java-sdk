package com.simboss.sdk.test;

import com.simboss.sdk.SimbossClient;
import com.simboss.sdk.constant.LicenseType;
import com.simboss.sdk.request.RealnameSubmitRealnameRequest;
import com.simboss.sdk.request.SmsListRequest;
import com.simboss.sdk.request.SmsSendRequest;
import com.simboss.sdk.response.SimbossResponse;
import junit.framework.TestCase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 卡管理测试
 * Created by Abel 2018-06-20.
 **/
public class TestRealNameSystemMgt extends TestCase {

  private Logger logger = LoggerFactory.getLogger(TestRealNameSystemMgt.class);

  private static SimbossClient client = new SimbossClient("10242017520", "2aa9382a45d3092f24fe2a0325f28200").init();

  public void testRealnameSubmitRealname() throws IOException {
    RealnameSubmitRealnameRequest request = new RealnameSubmitRealnameRequest();
    request.setIccid("89860401101730528432");
    request.setName("张三");
    request.setLicenseType(LicenseType.IDCARD);
    request.setLicenseCode("49900023923");
    request.setPhone("13655445565");
    request.setExtenalUserName("ID:xiaomi");
    request.setPic1(new FileInputStream("/Users/Abel/logo.jpg"));
    request.setPic2(new FileInputStream("/Users/Abel/logo.jpg"));
    request.setPic3("");
    SimbossResponse response = client.excute(request);
    logger.info(response.toString());
  }

}
