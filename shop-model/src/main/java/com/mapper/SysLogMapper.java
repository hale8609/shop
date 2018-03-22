package com.mapper;

import com.model.SysLog;

public interface SysLogMapper {
    /**
     *
     * @mbggenerated 2018-03-22
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int insert(SysLog record);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int insertSelective(SysLog record);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    SysLog selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int updateByPrimaryKeySelective(SysLog record);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int updateByPrimaryKey(SysLog record);
}