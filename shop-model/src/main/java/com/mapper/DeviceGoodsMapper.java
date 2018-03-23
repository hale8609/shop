package com.mapper;

import com.model.DeviceGoods;
import com.model.DeviceGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceGoodsMapper {
    /**
     *
     * @mbggenerated 2018-03-23
     */
    int countByExample(DeviceGoodsExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int deleteByExample(DeviceGoodsExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int deleteByPrimaryKey(Integer 主键);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int insert(DeviceGoods record);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int insertSelective(DeviceGoods record);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    List<DeviceGoods> selectByExampleWithBLOBs(DeviceGoodsExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    List<DeviceGoods> selectByExample(DeviceGoodsExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    DeviceGoods selectByPrimaryKey(Integer 主键);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByExampleSelective(@Param("record") DeviceGoods record, @Param("example") DeviceGoodsExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByExampleWithBLOBs(@Param("record") DeviceGoods record, @Param("example") DeviceGoodsExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByExample(@Param("record") DeviceGoods record, @Param("example") DeviceGoodsExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByPrimaryKeySelective(DeviceGoods record);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByPrimaryKeyWithBLOBs(DeviceGoods record);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByPrimaryKey(DeviceGoods record);
}