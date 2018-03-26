package com.mapper;

import com.model.SysLog;
import com.model.SysLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysLogMapper {
    /**
     *
     * @mbg.generated 2018-03-26
     */
    long countByExample(SysLogExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int deleteByExample(SysLogExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int insert(SysLog record);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int insertSelective(SysLog record);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    List<SysLog> selectByExample(SysLogExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    SysLog selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByExampleSelective(@Param("record") SysLog record, @Param("example") SysLogExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByExample(@Param("record") SysLog record, @Param("example") SysLogExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByPrimaryKeySelective(SysLog record);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByPrimaryKey(SysLog record);
}