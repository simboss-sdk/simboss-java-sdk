simboss-java-sdk
---
[SIMBOSS API](https://www.simboss.com/www/api-doc/index.html) SDK

## 快速开始

- Maven构建的工程

```xml
<dependency>
    <groupId>com.simboss.sdk</groupId>
    <artifactId>simboss-java-sdk</artifactId>
    <version>1.0.0</version>
</dependency>
```

- Gradle构建的项目

```json
dependencies {
   compile('com.simboss.sdk:simboss-java-sdk:1.1.0')
}
```


- 使用SimbossClient

```java
//初始化client,所有请求使用一个client，使用单例模式
SimbossClient client = new SimbossClient("appId", "appSecret").init();

//查询卡详情
DeviceDetailRequest request = new DeviceDetailRequest();
request.setIccid("89860401101730511111");
SimbossResponse<DeviceDetailDTO> response = client.excute(request); 

//返回结果说明
//1、接口请求的是否成功
Boolean success = response.getSuccess();
//2、返回码, 见https://www.simboss.com/www/api-doc/index.html, 返回码规范章节。
String code = response.getCode();
//3、返回的成功或者错误消息
String message = response.getMessage();
//4、返回的成功或者错误详细消息
String detail = response.getDetail();
//5、返回的数据，不同请求返回值不同，根据request.getResponseType()确定.
DeviceDetailDTO data = response.getData();

//所有API使用同一个client, 不要轻易释放资源除非确定不再用了.
client.close() 

```

## 配置说明

- 默认配置文件 src/main/resources/simboss.properties
- 自定义配置方式

```java
InputStream confIn = new FileInputStream("config file path");
SimbossClient client1 = new SimbossClient(confIn).init();
```

## API 清单

| API 名称               |           请求参                 |  返回值                                  |
| --------------------- | :-----------------------------: | :--------------------------------------: |
|1.1 账户总览接口         | UserDashboardGetRequest         | SimbossResponse\<DashboardDTO\>          |
|2.1 批量卡详情			 | DeviceDetailBatchRequest        | SimbossResponse\<List\<DeviceDetailDTO\>\>   |
|2.2 单卡详情				 | DeviceDetailRequest             | SimbossResponse\<DeviceDetailDTO\>         |
|2.3 单卡已订购套餐列表	 | DeviceOrderedPlansRequest       | SimbossResponse\<List\<OrderedPlansDTO\>\>   |
|2.4 单卡可续费套餐信息	 | DeviceRateplansRequest          | SimbossResponse\<List\<RatePlansDTO\>\>      |
|2.5 单卡续费				 | DeviceRechargeRequest           | SimbossResponse\<String\>                  |
|2.6 单卡续费记录			 | DeviceRechargeRecordsRequest    | SimbossResponse\<List\<RechargeRecordsDTO\>\>      |
|2.7 实时连接状态查询		 | DeviceGprsStatusRequest         | SimbossResponse\<DeviceGprsStatusDTO\>     |
|2.8 实时用户状态查询		 | DeviceUserStatusRequest         | SimbossResponse\<DeviceUserStatusDTO\>     |
|2.9 设备实时开关机状态查询 | DeviceRunningStatusRequest      | SimbossResponse\<DeviceRunningStatusDTO\>  |
|2.10 查询设备套餐概要     | DeviceRatePlanSummaryRequest    | SimbossResponse\<RatePlanSummaryDTO\>      |
|2.11 流量池卡开关网络     | DeviceModifyDeviceStatusRequest | SimbossResponse                          |
|2.12 日用量查询          | DeviceDailyUsageRequest         | SimbossResponse\<DailyUsageDTO\>           |
|2.13 取消测试期          | DeviceCancelTestingRequest      | SimbossResponse                          |
|2.14 更新备注            | DeviceMemoUpdateRequest         | SimbossResponse                          |
|2.15 批量更新备注         | DeviceMemoBatchUpdateRequest    | SimbossResponse                         |
|3.1 流量池详情			 | CardPoolDetailRequest           | SimbossResponse\<CardPoolDTO\>             |
|3.2 用户下所有流量池信息   | CardPoolListRequest             | SimbossResponse\<List\<CardPoolDTO\>\>       |
|4.1 提交实名认证信息		 | RealnameSubmitRealnameRequest   | SimbossResponse                          |
|5.1 短信下发接口			 | SmsSendRequest                  | SimbossResponse                          |
|5.2 短信查询             | SmsListRequest                  | SimbossResponse\<SmsListDTO\>              |

## 源码说明 
- 仅支持jdk1.7 或更高
- 单元测试类：src/test/java/com/simboss/sdk/test



