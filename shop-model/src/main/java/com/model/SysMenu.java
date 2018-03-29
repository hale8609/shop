package com.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class SysMenu implements Serializable {

    /**
     * 子菜单
     */
    private  List<SysMenu> subMenus;

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
     * 图标
     */
    private String icon;

    /**
     * 上级菜单id,0为根目录
     */
    private Integer parentId;

    /**
     * 排序号
     */
    private Integer sortNum;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
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
     * 图标
     * @return icon 图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 图标
     * @param icon 图标
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
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
     * 排序号
     * @return sort_num 排序号
     */
    public Integer getSortNum() {
        return sortNum;
    }

    /**
     * 排序号
     * @param sortNum 排序号
     */
    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
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
}