package com.mapper;

import com.model.SysRoleMenuRelation;

public interface SysRoleMenuRelationMapper {
    /**
     *
     * @mbggenerated 2018-03-22
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int insert(SysRoleMenuRelation record);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int insertSelective(SysRoleMenuRelation record);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    SysRoleMenuRelation selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int updateByPrimaryKeySelective(SysRoleMenuRelation record);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int updateByPrimaryKey(SysRoleMenuRelation record);
}