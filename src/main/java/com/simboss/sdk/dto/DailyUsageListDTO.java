package com.simboss.sdk.dto;

import java.util.List;

public class DailyUsageListDTO {

    private List<DailyUsageBatchDTO> dailyUsageList;

    private String date;

    public List<DailyUsageBatchDTO> getDailyUsageList() {
        return dailyUsageList;
    }

    public void setDailyUsageList(List<DailyUsageBatchDTO> dailyUsageList) {
        this.dailyUsageList = dailyUsageList;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
