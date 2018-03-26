package com.mapper;

import com.model.SysRoleAdminRelation;
import com.model.SysRoleAdminRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleAdminRelationMapper {
    /**
     *
     * @mbg.generated 2018-03-26
     */
    long countByExample(SysRoleAdminRelationExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int deleteByExample(SysRoleAdminRelationExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int insert(SysRoleAdminRelation record);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int insertSelective(SysRoleAdminRelation record);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    List<SysRoleAdminRelation> selectByExample(SysRoleAdminRelationExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    SysRoleAdminRelation selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByExampleSelective(@Param("record") SysRoleAdminRelation record, @Param("example") SysRoleAdminRelationExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByExample(@Param("record") SysRoleAdminRelation record, @Param("example") SysRoleAdminRelationExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByPrimaryKeySelective(SysRoleAdminRelation record);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByPrimaryKey(SysRoleAdminRelation record);
}