package com.model;

import java.io.Serializable;
import java.util.Date;

public class SysRole implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 角色名
     */
    private String roleName;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 角色描述
     */
    private String description;

    /**
     * sys_role
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
     * 角色名
     * @return role_name 角色名
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 角色名
     * @param roleName 角色名
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
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
     * 角色描述
     * @return description 角色描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 角色描述
     * @param description 角色描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}