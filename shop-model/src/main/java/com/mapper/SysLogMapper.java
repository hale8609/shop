package com.mapper;

import com.model.SysLog;
import com.model.SysLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysLogMapper {
    /**
     *
     * @mbggenerated 2018-03-23
     */
    int countByExample(SysLogExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int deleteByExample(SysLogExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int insert(SysLog record);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int insertSelective(SysLog record);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    List<SysLog> selectByExample(SysLogExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    SysLog selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByExampleSelective(@Param("record") SysLog record, @Param("example") SysLogExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByExample(@Param("record") SysLog record, @Param("example") SysLogExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByPrimaryKeySelective(SysLog record);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByPrimaryKey(SysLog record);
}