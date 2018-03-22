package com.mapper;

import com.model.SysRole;

public interface SysRoleMapper {
    /**
     *
     * @mbggenerated 2018-03-22
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int insert(SysRole record);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int insertSelective(SysRole record);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    SysRole selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int updateByPrimaryKeySelective(SysRole record);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int updateByPrimaryKeyWithBLOBs(SysRole record);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int updateByPrimaryKey(SysRole record);
}