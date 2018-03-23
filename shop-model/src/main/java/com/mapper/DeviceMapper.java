package com.mapper;

import com.model.Device;
import com.model.DeviceExample;
import com.model.DeviceWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceMapper {
    /**
     *
     * @mbggenerated 2018-03-23
     */
    int countByExample(DeviceExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int deleteByExample(DeviceExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int insert(DeviceWithBLOBs record);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int insertSelective(DeviceWithBLOBs record);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    List<DeviceWithBLOBs> selectByExampleWithBLOBs(DeviceExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    List<Device> selectByExample(DeviceExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    DeviceWithBLOBs selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByExampleSelective(@Param("record") DeviceWithBLOBs record, @Param("example") DeviceExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByExampleWithBLOBs(@Param("record") DeviceWithBLOBs record, @Param("example") DeviceExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByExample(@Param("record") Device record, @Param("example") DeviceExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByPrimaryKeySelective(DeviceWithBLOBs record);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByPrimaryKeyWithBLOBs(DeviceWithBLOBs record);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByPrimaryKey(Device record);
}