package com.model;

import java.io.Serializable;

public class SysRoleMenuRelation implements Serializable {
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
    private Integer menuId;

    /**
     * sys_role_menu_relation
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
     * @return menu_id 
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * 
     * @param menuId 
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }
}