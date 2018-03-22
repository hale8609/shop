package com.mapper;

import com.model.Device;
import com.model.DeviceWithBLOBs;

public interface DeviceMapper {
    /**
     *
     * @mbggenerated 2018-03-22
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int insert(DeviceWithBLOBs record);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int insertSelective(DeviceWithBLOBs record);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    DeviceWithBLOBs selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int updateByPrimaryKeySelective(DeviceWithBLOBs record);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int updateByPrimaryKeyWithBLOBs(DeviceWithBLOBs record);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int updateByPrimaryKey(Device record);
}