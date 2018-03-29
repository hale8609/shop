package com.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;

public class SysAdmin implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 登录名
     */
    private String adminName;

    /**
     * 密码
     */
    @JsonIgnore
    private String adminPwd;

    /**
     * 昵称
     */
    private String nick;

    /**
     * 手机号
     */
    private Integer phone;

    /**
     * 是否禁用(0-启用，1-禁用)
     */
    @JsonIgnore
    private Integer ifDisable;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 状态：1离线 2在线
     */
    private Integer state;

    /**
     * sys_admin
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
     * 登录名
     * @return admin_name 登录名
     */
    public String getAdminName() {
        return adminName;
    }

    /**
     * 登录名
     * @param adminName 登录名
     */
    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    /**
     * 密码
     * @return admin_pwd 密码
     */
    public String getAdminPwd() {
        return adminPwd;
    }

    /**
     * 密码
     * @param adminPwd 密码
     */
    public void setAdminPwd(String adminPwd) {
        this.adminPwd = adminPwd == null ? null : adminPwd.trim();
    }

    /**
     * 昵称
     * @return nick 昵称
     */
    public String getNick() {
        return nick;
    }

    /**
     * 昵称
     * @param nick 昵称
     */
    public void setNick(String nick) {
        this.nick = nick == null ? null : nick.trim();
    }

    /**
     * 手机号
     * @return phone 手机号
     */
    public Integer getPhone() {
        return phone;
    }

    /**
     * 手机号
     * @param phone 手机号
     */
    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    /**
     * 是否禁用(0-启用，1-禁用)
     * @return if_disable 是否禁用(0-启用，1-禁用)
     */
    public Integer getIfDisable() {
        return ifDisable;
    }

    /**
     * 是否禁用(0-启用，1-禁用)
     * @param ifDisable 是否禁用(0-启用，1-禁用)
     */
    public void setIfDisable(Integer ifDisable) {
        this.ifDisable = ifDisable;
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 状态：1离线 2在线
     * @return state 状态：1离线 2在线
     */
    public Integer getState() {
        return state;
    }

    /**
     * 状态：1离线 2在线
     * @param state 状态：1离线 2在线
     */
    public void setState(Integer state) {
        this.state = state;
    }
}