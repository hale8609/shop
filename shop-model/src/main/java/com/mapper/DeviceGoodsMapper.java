package com.mapper;

import com.model.DeviceGoods;

public interface DeviceGoodsMapper {
    /**
     *
     * @mbggenerated 2018-03-22
     */
    int deleteByPrimaryKey(Integer 主键);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int insert(DeviceGoods record);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int insertSelective(DeviceGoods record);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    DeviceGoods selectByPrimaryKey(Integer 主键);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int updateByPrimaryKeySelective(DeviceGoods record);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int updateByPrimaryKeyWithBLOBs(DeviceGoods record);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int updateByPrimaryKey(DeviceGoods record);
}