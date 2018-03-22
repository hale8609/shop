package com.model;

import java.io.Serializable;

public class DeviceWithBLOBs extends Device implements Serializable {
    /**
     * 设备描述
     */
    private String deviceDescribe;

    /**
     * 备注
     */
    private String remarks;

    /**
     * device
     */
    private static final long serialVersionUID = 1L;

    /**
     * 设备描述
     * @return device_describe 设备描述
     */
    public String getDeviceDescribe() {
        return deviceDescribe;
    }

    /**
     * 设备描述
     * @param deviceDescribe 设备描述
     */
    public void setDeviceDescribe(String deviceDescribe) {
        this.deviceDescribe = deviceDescribe == null ? null : deviceDescribe.trim();
    }

    /**
     * 备注
     * @return remarks 备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 备注
     * @param remarks 备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}