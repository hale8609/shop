package com.mapper;

import com.model.SysRoleAdminRelation;

public interface SysRoleAdminRelationMapper {
    /**
     *
     * @mbggenerated 2018-03-22
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int insert(SysRoleAdminRelation record);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int insertSelective(SysRoleAdminRelation record);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    SysRoleAdminRelation selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int updateByPrimaryKeySelective(SysRoleAdminRelation record);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int updateByPrimaryKey(SysRoleAdminRelation record);
}