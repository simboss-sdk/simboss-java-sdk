package com.simboss.sdk.test;

import com.simboss.sdk.SimbossClient;
import com.simboss.sdk.constant.CardStatusConstants;
import com.simboss.sdk.dto.DailyUsageDTO;
import com.simboss.sdk.dto.DashboardDTO;
import com.simboss.sdk.dto.DeviceDetailDTO;
import com.simboss.sdk.dto.DeviceGprsStatusDTO;
import com.simboss.sdk.dto.DeviceRunningStatusDTO;
import com.simboss.sdk.dto.DeviceUserStatusDTO;
import com.simboss.sdk.dto.OrderedPlansDTO;
import com.simboss.sdk.dto.RatePlanSummaryDTO;
import com.simboss.sdk.dto.RatePlansDTO;
import com.simboss.sdk.dto.RechargeRecordsDTO;
import com.simboss.sdk.request.DeviceCancelTestingRequest;
import com.simboss.sdk.request.DeviceDailyUsageRequest;
import com.simboss.sdk.request.DeviceDetailBatchRequest;
import com.simboss.sdk.request.DeviceDetailRequest;
import com.simboss.sdk.request.DeviceGprsStatusRequest;
import com.simboss.sdk.request.DeviceMemoBatchUpdateRequest;
import com.simboss.sdk.request.DeviceMemoUpdateRequest;
import com.simboss.sdk.request.DeviceModifyDeviceStatusRequest;
import com.simboss.sdk.request.DeviceOrderedPlansRequest;
import com.simboss.sdk.request.DeviceRatePlanSummaryRequest;
import com.simboss.sdk.request.DeviceRateplansRequest;
import com.simboss.sdk.request.DeviceRechargeRecordsRequest;
import com.simboss.sdk.request.DeviceRechargeRequest;
import com.simboss.sdk.request.DeviceRunningStatusRequest;
import com.simboss.sdk.request.DeviceUserStatusRequest;
import com.simboss.sdk.request.UserDashboardGetRequest;
import com.simboss.sdk.response.SimbossResponse;
import com.simboss.sdk.utils.DateTimeUtil;
import junit.framework.TestCase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.List;

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
