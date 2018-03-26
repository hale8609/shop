package com.mapper;

import com.model.DeviceGoods;
import com.model.DeviceGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceGoodsMapper {
    /**
     *
     * @mbg.generated 2018-03-26
     */
    long countByExample(DeviceGoodsExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int deleteByExample(DeviceGoodsExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int insert(DeviceGoods record);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int insertSelective(DeviceGoods record);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    List<DeviceGoods> selectByExampleWithBLOBs(DeviceGoodsExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    List<DeviceGoods> selectByExample(DeviceGoodsExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    DeviceGoods selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByExampleSelective(@Param("record") DeviceGoods record, @Param("example") DeviceGoodsExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByExampleWithBLOBs(@Param("record") DeviceGoods record, @Param("example") DeviceGoodsExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByExample(@Param("record") DeviceGoods record, @Param("example") DeviceGoodsExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByPrimaryKeySelective(DeviceGoods record);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByPrimaryKeyWithBLOBs(DeviceGoods record);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByPrimaryKey(DeviceGoods record);
}