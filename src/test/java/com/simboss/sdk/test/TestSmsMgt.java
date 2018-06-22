package com.simboss.sdk.test;

import com.simboss.sdk.SimbossClient;
import com.simboss.sdk.dto.SmsListDTO;
import com.simboss.sdk.request.SmsListRequest;
import com.simboss.sdk.request.SmsSendRequest;
import com.simboss.sdk.request.UserDashboardGetRequest;
import com.simboss.sdk.response.SimbossResponse;
import junit.framework.TestCase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 卡管理测试
 * Created by Abel 2018-06-20.
 **/
public class TestSmsMgt extends TestCase {

  private Logger logger = LoggerFactory.getLogger(TestSmsMgt.class);

  private static SimbossClient client = new SimbossClient("10242017520", "2aa9382a45d3092f24fe2a0325f28200").init();

  public void testSmsSend() {
    SmsSendRequest request = new SmsSendRequest();
    request.setIccid("89860401101730528432");
    request.setText("API发送短信");
    SimbossResponse response = client.excute(request);
    logger.info(response.toString());
  }

  public void testSmsList() {
    SmsListRequest request = new SmsListRequest();
    request.setIccid("89860401101730528432");
    request.setPageNo(1);
    SimbossResponse<SmsListDTO> response = client.excute(request);
    logger.info(response.toString());
  }
}
