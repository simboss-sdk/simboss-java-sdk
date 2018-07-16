package com.simboss.sdk.test;

import com.simboss.sdk.SimbossClient;
import com.simboss.sdk.constant.CardStatusConstants;
import com.simboss.sdk.dto.DailyUsageDTO;
import com.simboss.sdk.dto.DeviceDetailDTO;
import com.simboss.sdk.dto.DeviceGprsStatusDTO;
import com.simboss.sdk.dto.DeviceRunningStatusDTO;
import com.simboss.sdk.dto.DeviceUserStatusDTO;
import com.simboss.sdk.dto.OrderedPlansDTO;
import com.simboss.sdk.dto.RatePlansDTO;
import com.simboss.sdk.dto.RatePlanSummaryDTO;
import com.simboss.sdk.dto.RechargeRecordsDTO;
import com.simboss.sdk.request.DeviceCancelTestingRequest;
import com.simboss.sdk.request.DeviceDailyUsageByDateRangeRequest;
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
public class TestCardMgt extends TestCase {

  private Logger logger = LoggerFactory.getLogger(TestCardMgt.class);

  private static SimbossClient client = new SimbossClient("http://localhost:8089/", "10242014246", "583484b1622ed3eac209da8656ed057d").init();

  public void testDeviceDetail() {
    DeviceDetailRequest request = new DeviceDetailRequest();
    request.setIccid("89860401101730528432");
    SimbossResponse<DeviceDetailDTO> response = client.excute(request);
    logger.info(response.toString());
  }

  public void testDeviceDetailBatch() {
    DeviceDetailBatchRequest request = new DeviceDetailBatchRequest();
    request.addIccid("89860401101730528432");
    request.addIccid("8986031740205777418");
    SimbossResponse<List<DeviceDetailDTO>> response = client.excute(request);
    logger.info(response.toString());
  }

  public void testDeviceOrderedRatePlans() {
    DeviceOrderedPlansRequest request = new DeviceOrderedPlansRequest();
    request.setIccid("89860401101730528432");
    SimbossResponse<List<OrderedPlansDTO>> response = client.excute(request);
    logger.info(response.toString());
  }

  public void testDeviceRateplans() {
    DeviceRateplansRequest request = new DeviceRateplansRequest();
    request.setIccid("89860401101730528432");
    SimbossResponse<List<RatePlansDTO>> response = client.excute(request);
    logger.info(response.toString());
  }

  public void testDeviceRecharge() {
    DeviceRechargeRequest request = new DeviceRechargeRequest();
    request.setIccid("89860401101730528432");
    request.setRatePlanId(672);
    SimbossResponse<String> response = client.excute(request);
    logger.info(response.toString());
  }

  public void testDeviceRechargeRecords() {
    DeviceRechargeRecordsRequest request = new DeviceRechargeRecordsRequest();
    request.setIccid("89860401101730528432");
    SimbossResponse<List<RechargeRecordsDTO>> response = client.excute(request);
    logger.info(response.toString());
  }

  public void testDeviceGprsStatus() {
    DeviceGprsStatusRequest request = new DeviceGprsStatusRequest();
    request.setIccid("89860401101730528432");
    SimbossResponse<DeviceGprsStatusDTO> response = client.excute(request);
    logger.info(response.toString());
  }

  public void testDeviceUserStatus() {
    DeviceUserStatusRequest request = new DeviceUserStatusRequest();
    request.setIccid("89860401101730528432");
    SimbossResponse<DeviceUserStatusDTO> response = client.excute(request);
    logger.info(response.toString());
  }

  public void testDeviceRunningStatus() {
    DeviceRunningStatusRequest request = new DeviceRunningStatusRequest();
    request.setIccid("89860401101730528432");
    SimbossResponse<DeviceRunningStatusDTO> response = client.excute(request);
    logger.info(response.toString());
  }

  public void testDeviceRatePlanSummary() {
    DeviceRatePlanSummaryRequest request = new DeviceRatePlanSummaryRequest();
    request.setIccid("89860401101730528432");
    SimbossResponse<RatePlanSummaryDTO> response = client.excute(request);
    logger.info(response.toString());
  }

  public void testDeviceModifyDeviceStatus() {
    DeviceModifyDeviceStatusRequest request = new DeviceModifyDeviceStatusRequest();
    request.setIccid("89860401101730528432");
    request.setStatus(CardStatusConstants.CarrierStatus.ACTIVATED_NAME);
    SimbossResponse response = client.excute(request);
    logger.info(response.toString());
  }

  public void testDeviceDailyUsage() {
    DeviceDailyUsageRequest request = new DeviceDailyUsageRequest();
    request.setIccid("89860401101730528432");
    request.setDate(DateTimeUtil.addDate(new Date(), -1));
    SimbossResponse<DailyUsageDTO> response = client.excute(request);
    logger.info(response.toString());
  }

  public void testDeviceDailyUsageByDateRange() {
    DeviceDailyUsageByDateRangeRequest request = new DeviceDailyUsageByDateRangeRequest();
    request.setIccid("898607B8101700342325");
    request.setStartDate(DateTimeUtil.addDate(new Date(), -10));
    request.setEndDate(new Date());
    SimbossResponse<DailyUsageDTO> response = client.excute(request);
    logger.info(response.toString());
  }

  public void testDeviceCancelTesting() {
    DeviceCancelTestingRequest request = new DeviceCancelTestingRequest();
    request.setIccid("89860401101730528432");
    SimbossResponse response = client.excute(request);
    logger.info(response.toString());
  }

  public void testDeviceMemoUpdate() {
    DeviceMemoUpdateRequest request = new DeviceMemoUpdateRequest();
    request.setIccid("89860401101730528432");
    request.setMemo("我的单个备注");
    SimbossResponse response = client.excute(request);
    logger.info(response.toString());
  }

  public void testDeviceMemoBatchUpdate() {
    DeviceMemoBatchUpdateRequest request = new DeviceMemoBatchUpdateRequest();
    request.addIccid("89860401101730528432");
    request.addIccid("8986031740205777418");
    request.setMemo("我的批量配置");
    SimbossResponse response = client.excute(request);
    logger.info(response.toString());
  }
}
