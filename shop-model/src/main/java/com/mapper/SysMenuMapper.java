package com.mapper;

import com.model.SysMenu;
import com.model.SysMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysMenuMapper {
    /**
     *
     * @mbg.generated 2018-04-01
     */
    long countByExample(SysMenuExample example);

    /**
     *
     * @mbg.generated 2018-04-01
     */
    int deleteByExample(SysMenuExample example);

    /**
     *
     * @mbg.generated 2018-04-01
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-04-01
     */
    int insert(SysMenu record);

    /**
     *
     * @mbg.generated 2018-04-01
     */
    int insertSelective(SysMenu record);

    /**
     *
     * @mbg.generated 2018-04-01
     */
    List<SysMenu> selectByExample(SysMenuExample example);

    /**
     *
     * @mbg.generated 2018-04-01
     */
    SysMenu selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-04-01
     */
    int updateByExampleSelective(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    /**
     *
     * @mbg.generated 2018-04-01
     */
    int updateByExample(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    /**
     *
     * @mbg.generated 2018-04-01
     */
    int updateByPrimaryKeySelective(SysMenu record);

    /**
     *
     * @mbg.generated 2018-04-01
     */
    int updateByPrimaryKey(SysMenu record);

    List<SysMenu> selectMenusByAdminId(@Param("adminId") int adminId,@Param("parentId") int parentId);
}