package com.mapper;

import com.model.Device;
import com.model.DeviceExample;
import com.model.DeviceWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceMapper {
    /**
     *
     * @mbg.generated 2018-03-26
     */
    long countByExample(DeviceExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int deleteByExample(DeviceExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int insert(DeviceWithBLOBs record);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int insertSelective(DeviceWithBLOBs record);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    List<DeviceWithBLOBs> selectByExampleWithBLOBs(DeviceExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    List<Device> selectByExample(DeviceExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    DeviceWithBLOBs selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByExampleSelective(@Param("record") DeviceWithBLOBs record, @Param("example") DeviceExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByExampleWithBLOBs(@Param("record") DeviceWithBLOBs record, @Param("example") DeviceExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByExample(@Param("record") Device record, @Param("example") DeviceExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByPrimaryKeySelective(DeviceWithBLOBs record);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByPrimaryKeyWithBLOBs(DeviceWithBLOBs record);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByPrimaryKey(Device record);
}