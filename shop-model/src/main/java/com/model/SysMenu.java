package com.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class SysMenu implements Serializable {

    /**
     * 子菜单集合
     */
    private List<SysMenu> subMenus;

    /**
     * 图标
     */
    private String icon;

    /**
     * 主键
     */
    private Integer id;

    /**
     * 菜单名称
     */
    private String menuName;

    /**
     * 对应功能的链接（点击跳转,根目录为null）
     */
    private String url;

    /**
     * 上级菜单id,0为根目录
     */
    private Integer parentId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * sys_menu
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
     * 菜单名称
     * @return menu_name 菜单名称
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * 菜单名称
     * @param menuName 菜单名称
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    /**
     * 对应功能的链接（点击跳转,根目录为null）
     * @return url 对应功能的链接（点击跳转,根目录为null）
     */
    public String getUrl() {
        return url;
    }

    /**
     * 对应功能的链接（点击跳转,根目录为null）
     * @param url 对应功能的链接（点击跳转,根目录为null）
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 上级菜单id,0为根目录
     * @return parent_id 上级菜单id,0为根目录
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 上级菜单id,0为根目录
     * @param parentId 上级菜单id,0为根目录
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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

    public List<SysMenu> getSubMenus() {
        return subMenus;
    }

    public void setSubMenus(List<SysMenu> subMenus) {
        this.subMenus = subMenus;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}