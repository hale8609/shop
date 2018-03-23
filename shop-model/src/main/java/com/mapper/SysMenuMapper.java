package com.mapper;

import com.model.SysMenu;

import java.util.List;

public interface SysMenuMapper {
    /**
     *
     * @mbggenerated 2018-03-22
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int insert(SysMenu record);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int insertSelective(SysMenu record);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    SysMenu selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int updateByPrimaryKeySelective(SysMenu record);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int updateByPrimaryKey(SysMenu record);

    List<SysMenu> selectMenusByAdminId(int adminId);
}