package com.simboss.sdk.test;

import com.simboss.sdk.SimbossClient;
import com.simboss.sdk.dto.CardPoolDTO;
import com.simboss.sdk.request.CardPoolDetailRequest;
import com.simboss.sdk.request.CardPoolListRequest;
import com.simboss.sdk.request.UserDashboardGetRequest;
import com.simboss.sdk.response.SimbossResponse;
import junit.framework.TestCase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * 卡管理测试
 * Created by Abel 2018-06-20.
 **/
public class TestCardPoolMgt extends TestCase {

  private Logger logger = LoggerFactory.getLogger(TestCardPoolMgt.class);

  private static SimbossClient client = new SimbossClient("10242017520", "2aa9382a45d3092f24fe2a0325f28200").init();

  public void testCardPoolDetail() {
    CardPoolDetailRequest request = new CardPoolDetailRequest();
    request.setIccid("8986031740205777418");
    SimbossResponse<CardPoolDTO> response = client.excute(request);
    logger.info(response.toString());
  }

  public void testCardPoolList() {
    CardPoolListRequest request = new CardPoolListRequest();
    SimbossResponse<List<CardPoolDTO>> response = client.excute(request);
    logger.info(response.toString());
  }

}
