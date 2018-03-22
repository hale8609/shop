package com.model;

import java.io.Serializable;
import java.util.Date;

public class SysLog implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 管理员名称
     */
    private String adminNick;

    /**
     * 管理员主键
     */
    private Integer adminId;

    /**
     * 类型
     */
    private String type;

    /**
     * 标签
     */
    private String tag;

    /**
     * 登录ip
     */
    private String ip;

    /**
     * 创建时间
     */
    private Date loginTime;

    /**
     * sys_log
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
     * 管理员名称
     * @return admin_nick 管理员名称
     */
    public String getAdminNick() {
        return adminNick;
    }

    /**
     * 管理员名称
     * @param adminNick 管理员名称
     */
    public void setAdminNick(String adminNick) {
        this.adminNick = adminNick == null ? null : adminNick.trim();
    }

    /**
     * 管理员主键
     * @return admin_id 管理员主键
     */
    public Integer getAdminId() {
        return adminId;
    }

    /**
     * 管理员主键
     * @param adminId 管理员主键
     */
    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    /**
     * 类型
     * @return type 类型
     */
    public String getType() {
        return type;
    }

    /**
     * 类型
     * @param type 类型
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 标签
     * @return tag 标签
     */
    public String getTag() {
        return tag;
    }

    /**
     * 标签
     * @param tag 标签
     */
    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    /**
     * 登录ip
     * @return ip 登录ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * 登录ip
     * @param ip 登录ip
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * 创建时间
     * @return login_time 创建时间
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * 创建时间
     * @param loginTime 创建时间
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }
}