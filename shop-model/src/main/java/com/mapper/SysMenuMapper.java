package com.mapper;

import com.model.SysMenu;
import com.model.SysMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysMenuMapper {
    /**
     *
     * @mbg.generated 2018-03-26
     */
    long countByExample(SysMenuExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int deleteByExample(SysMenuExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int insert(SysMenu record);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int insertSelective(SysMenu record);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    List<SysMenu> selectByExample(SysMenuExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    SysMenu selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByExampleSelective(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByExample(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByPrimaryKeySelective(SysMenu record);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByPrimaryKey(SysMenu record);

    List<SysMenu> selectMenusByAdminId(int adminId);
}