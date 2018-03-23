package com.mapper;

import com.model.SysRoleMenuRelation;
import com.model.SysRoleMenuRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleMenuRelationMapper {
    /**
     *
     * @mbggenerated 2018-03-23
     */
    int countByExample(SysRoleMenuRelationExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int deleteByExample(SysRoleMenuRelationExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int insert(SysRoleMenuRelation record);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int insertSelective(SysRoleMenuRelation record);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    List<SysRoleMenuRelation> selectByExample(SysRoleMenuRelationExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    SysRoleMenuRelation selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByExampleSelective(@Param("record") SysRoleMenuRelation record, @Param("example") SysRoleMenuRelationExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByExample(@Param("record") SysRoleMenuRelation record, @Param("example") SysRoleMenuRelationExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByPrimaryKeySelective(SysRoleMenuRelation record);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByPrimaryKey(SysRoleMenuRelation record);
}