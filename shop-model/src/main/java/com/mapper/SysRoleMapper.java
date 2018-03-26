package com.mapper;

import com.model.SysRole;
import com.model.SysRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleMapper {
    /**
     *
     * @mbg.generated 2018-03-26
     */
    long countByExample(SysRoleExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int deleteByExample(SysRoleExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int insert(SysRole record);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int insertSelective(SysRole record);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    List<SysRole> selectByExampleWithBLOBs(SysRoleExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    List<SysRole> selectByExample(SysRoleExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    SysRole selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByExampleSelective(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByExampleWithBLOBs(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByExample(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByPrimaryKeySelective(SysRole record);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByPrimaryKeyWithBLOBs(SysRole record);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByPrimaryKey(SysRole record);
}