package com.mapper;

import com.model.SysRoleAdminRelation;
import com.model.SysRoleAdminRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleAdminRelationMapper {
    /**
     *
     * @mbggenerated 2018-03-23
     */
    int countByExample(SysRoleAdminRelationExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int deleteByExample(SysRoleAdminRelationExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int insert(SysRoleAdminRelation record);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int insertSelective(SysRoleAdminRelation record);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    List<SysRoleAdminRelation> selectByExample(SysRoleAdminRelationExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    SysRoleAdminRelation selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByExampleSelective(@Param("record") SysRoleAdminRelation record, @Param("example") SysRoleAdminRelationExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByExample(@Param("record") SysRoleAdminRelation record, @Param("example") SysRoleAdminRelationExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByPrimaryKeySelective(SysRoleAdminRelation record);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByPrimaryKey(SysRoleAdminRelation record);
}