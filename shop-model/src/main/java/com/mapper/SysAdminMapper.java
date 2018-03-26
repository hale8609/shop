package com.mapper;

import com.model.SysAdmin;
import com.model.SysAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAdminMapper {
    /**
     *
     * @mbg.generated 2018-03-26
     */
    long countByExample(SysAdminExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int deleteByExample(SysAdminExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int insert(SysAdmin record);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int insertSelective(SysAdmin record);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    List<SysAdmin> selectByExample(SysAdminExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    SysAdmin selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByExampleSelective(@Param("record") SysAdmin record, @Param("example") SysAdminExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByExample(@Param("record") SysAdmin record, @Param("example") SysAdminExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByPrimaryKeySelective(SysAdmin record);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByPrimaryKey(SysAdmin record);
}