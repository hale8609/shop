package com.model;

import java.io.Serializable;
import java.util.Date;

public class Device implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 设备名称
     */
    private String deviceName;

    /**
     * 设备所在地址
     */
    private String deviceAddress;

    /**
     * 经度
     */
    private String deviceLng;

    /**
     * 纬度
     */
    private String deviceLat;

    /**
     * 生产日期
     */
    private Date produceDate;

    /**
     * 投放日期
     */
    private Date useDate;

    /**
     * 维护人
     */
    private String linkman;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 状态(1 启用 2 禁用 3运行正常 4.运行异常)
     */
    private Integer state;

    /**
     * 管理员id
     */
    private Integer adminId;

    /**
     * device
     */
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * @return id 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 设备名称
     * @return device_name 设备名称
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * 设备名称
     * @param deviceName 设备名称
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName == null ? null : deviceName.trim();
    }

    /**
     * 设备所在地址
     * @return device_address 设备所在地址
     */
    public String getDeviceAddress() {
        return deviceAddress;
    }

    /**
     * 设备所在地址
     * @param deviceAddress 设备所在地址
     */
    public void setDeviceAddress(String deviceAddress) {
        this.deviceAddress = deviceAddress == null ? null : deviceAddress.trim();
    }

    /**
     * 经度
     * @return device_lng 经度
     */
    public String getDeviceLng() {
        return deviceLng;
    }

    /**
     * 经度
     * @param deviceLng 经度
     */
    public void setDeviceLng(String deviceLng) {
        this.deviceLng = deviceLng == null ? null : deviceLng.trim();
    }

    /**
     * 纬度
     * @return device_lat 纬度
     */
    public String getDeviceLat() {
        return deviceLat;
    }

    /**
     * 纬度
     * @param deviceLat 纬度
     */
    public void setDeviceLat(String deviceLat) {
        this.deviceLat = deviceLat == null ? null : deviceLat.trim();
    }

    /**
     * 生产日期
     * @return produce_date 生产日期
     */
    public Date getProduceDate() {
        return produceDate;
    }

    /**
     * 生产日期
     * @param produceDate 生产日期
     */
    public void setProduceDate(Date produceDate) {
        this.produceDate = produceDate;
    }

    /**
     * 投放日期
     * @return use_date 投放日期
     */
    public Date getUseDate() {
        return useDate;
    }

    /**
     * 投放日期
     * @param useDate 投放日期
     */
    public void setUseDate(Date useDate) {
        this.useDate = useDate;
    }

    /**
     * 维护人
     * @return linkman 维护人
     */
    public String getLinkman() {
        return linkman;
    }

    /**
     * 维护人
     * @param linkman 维护人
     */
    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    /**
     * 联系电话
     * @return phone 联系电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 联系电话
     * @param phone 联系电话
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 状态(1 启用 2 禁用 3运行正常 4.运行异常)
     * @return state 状态(1 启用 2 禁用 3运行正常 4.运行异常)
     */
    public Integer getState() {
        return state;
    }

    /**
     * 状态(1 启用 2 禁用 3运行正常 4.运行异常)
     * @param state 状态(1 启用 2 禁用 3运行正常 4.运行异常)
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 管理员id
     * @return admin_id 管理员id
     */
    public Integer getAdminId() {
        return adminId;
    }

    /**
     * 管理员id
     * @param adminId 管理员id
     */
    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }
}