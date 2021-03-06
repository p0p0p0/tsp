package cn.spacewalker.tsp.ft.pojo.dto;

import cn.spacewalker.tsp.common.base.BaseDto;

/**
 * This file is part of tsp Project
 * Created by bzzz (bzzz@space-walker.cn) on 2017/8/17 16:00
 * Copyright (c) 2017 www.space-walker.cn
 */
public class VehRegionPercentDto extends BaseDto {

    private String region;

    private Integer drivingCount;

    private Integer chargingCount;

    private Integer offlineCount;

    private Integer totalCount;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getDrivingCount() {
        return drivingCount;
    }

    public void setDrivingCount(Integer drivingCount) {
        this.drivingCount = drivingCount;
    }

    public Integer getChargingCount() {
        return chargingCount;
    }

    public void setChargingCount(Integer chargingCount) {
        this.chargingCount = chargingCount;
    }

    public Integer getOfflineCount() {
        return offlineCount;
    }

    public void setOfflineCount(Integer offlineCount) {
        this.offlineCount = offlineCount;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
}
