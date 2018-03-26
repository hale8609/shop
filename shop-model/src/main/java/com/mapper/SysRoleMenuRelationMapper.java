package com.mapper;

import com.model.SysRoleMenuRelation;
import com.model.SysRoleMenuRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleMenuRelationMapper {
    /**
     *
     * @mbg.generated 2018-03-26
     */
    long countByExample(SysRoleMenuRelationExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int deleteByExample(SysRoleMenuRelationExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int insert(SysRoleMenuRelation record);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int insertSelective(SysRoleMenuRelation record);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    List<SysRoleMenuRelation> selectByExample(SysRoleMenuRelationExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    SysRoleMenuRelation selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByExampleSelective(@Param("record") SysRoleMenuRelation record, @Param("example") SysRoleMenuRelationExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByExample(@Param("record") SysRoleMenuRelation record, @Param("example") SysRoleMenuRelationExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByPrimaryKeySelective(SysRoleMenuRelation record);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByPrimaryKey(SysRoleMenuRelation record);
}