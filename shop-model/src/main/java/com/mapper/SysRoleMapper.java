package com.mapper;

import com.model.SysRole;
import com.model.SysRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleMapper {
    /**
     *
     * @mbggenerated 2018-03-23
     */
    int countByExample(SysRoleExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int deleteByExample(SysRoleExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int insert(SysRole record);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int insertSelective(SysRole record);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    List<SysRole> selectByExampleWithBLOBs(SysRoleExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    List<SysRole> selectByExample(SysRoleExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    SysRole selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByExampleSelective(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByExampleWithBLOBs(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByExample(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByPrimaryKeySelective(SysRole record);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByPrimaryKeyWithBLOBs(SysRole record);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByPrimaryKey(SysRole record);
}