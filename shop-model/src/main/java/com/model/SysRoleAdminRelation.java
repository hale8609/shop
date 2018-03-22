package com.model;

import java.io.Serializable;

public class SysRoleAdminRelation implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer roleId;

    /**
     * 
     */
    private Integer adminId;

    /**
     * sys_role_admin_relation
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return role_id 
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 
     * @param roleId 
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 
     * @return admin_id 
     */
    public Integer getAdminId() {
        return adminId;
    }

    /**
     * 
     * @param adminId 
     */
    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }
}