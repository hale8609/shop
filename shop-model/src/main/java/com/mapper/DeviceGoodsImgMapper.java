package com.mapper;

import com.model.DeviceGoodsImg;
import com.model.DeviceGoodsImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceGoodsImgMapper {
    /**
     *
     * @mbggenerated 2018-03-23
     */
    int countByExample(DeviceGoodsImgExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int deleteByExample(DeviceGoodsImgExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int insert(DeviceGoodsImg record);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int insertSelective(DeviceGoodsImg record);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    List<DeviceGoodsImg> selectByExample(DeviceGoodsImgExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    DeviceGoodsImg selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByExampleSelective(@Param("record") DeviceGoodsImg record, @Param("example") DeviceGoodsImgExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByExample(@Param("record") DeviceGoodsImg record, @Param("example") DeviceGoodsImgExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByPrimaryKeySelective(DeviceGoodsImg record);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByPrimaryKey(DeviceGoodsImg record);
}