package com.simboss.sdk.test;

import com.simboss.sdk.SimbossClient;
import com.simboss.sdk.dto.*;
import com.simboss.sdk.request.CombineDeviceOrderedPlansRequest;
import com.simboss.sdk.request.UserDashboardGetRequest;
import com.simboss.sdk.response.SimbossResponse;
import junit.framework.TestCase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 卡管理测试
 * Created by Abel 2018-06-20.
 **/
public class TestAccountInfo extends TestCase {

  private Logger logger = LoggerFactory.getLogger(TestAccountInfo.class);

  private static SimbossClient client = new SimbossClient("10242017520", "2aa9382a45d3092f24fe2a0325f28200").init();

  public void testUserDashboardGet() {
    UserDashboardGetRequest request = new UserDashboardGetRequest();
    SimbossResponse<DashboardDTO> response = client.excute(request);
    logger.info(response.toString());
  }

}
