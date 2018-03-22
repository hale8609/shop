package com.mapper;

import com.model.DeviceGoodsImg;

public interface DeviceGoodsImgMapper {
    /**
     *
     * @mbggenerated 2018-03-22
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int insert(DeviceGoodsImg record);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int insertSelective(DeviceGoodsImg record);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    DeviceGoodsImg selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int updateByPrimaryKeySelective(DeviceGoodsImg record);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int updateByPrimaryKey(DeviceGoodsImg record);
}