package com.mapper;

import com.model.SysMenu;
import com.model.SysMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysMenuMapper {
    /**
     *
     * @mbggenerated 2018-03-23
     */
    int countByExample(SysMenuExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int deleteByExample(SysMenuExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int insert(SysMenu record);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int insertSelective(SysMenu record);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    List<SysMenu> selectByExample(SysMenuExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    SysMenu selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByExampleSelective(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByExample(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByPrimaryKeySelective(SysMenu record);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByPrimaryKey(SysMenu record);
}