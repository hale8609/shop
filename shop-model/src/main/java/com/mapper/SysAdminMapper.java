package com.mapper;

import com.model.SysAdmin;
import com.model.SysAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAdminMapper {
    /**
     *
     * @mbggenerated 2018-03-23
     */
    int countByExample(SysAdminExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int deleteByExample(SysAdminExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int insert(SysAdmin record);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int insertSelective(SysAdmin record);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    List<SysAdmin> selectByExample(SysAdminExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    SysAdmin selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByExampleSelective(@Param("record") SysAdmin record, @Param("example") SysAdminExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByExample(@Param("record") SysAdmin record, @Param("example") SysAdminExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByPrimaryKeySelective(SysAdmin record);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByPrimaryKey(SysAdmin record);
}