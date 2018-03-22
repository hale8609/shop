package com.mapper;

import com.model.SysAdmin;

public interface SysAdminMapper {
    /**
     *
     * @mbggenerated 2018-03-22
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int insert(SysAdmin record);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int insertSelective(SysAdmin record);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    SysAdmin selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int updateByPrimaryKeySelective(SysAdmin record);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int updateByPrimaryKey(SysAdmin record);
}