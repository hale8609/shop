package com.mapper;

import com.model.DeviceGoodsImg;
import com.model.DeviceGoodsImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceGoodsImgMapper {
    /**
     *
     * @mbg.generated 2018-03-26
     */
    long countByExample(DeviceGoodsImgExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int deleteByExample(DeviceGoodsImgExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int insert(DeviceGoodsImg record);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int insertSelective(DeviceGoodsImg record);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    List<DeviceGoodsImg> selectByExample(DeviceGoodsImgExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    DeviceGoodsImg selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByExampleSelective(@Param("record") DeviceGoodsImg record, @Param("example") DeviceGoodsImgExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByExample(@Param("record") DeviceGoodsImg record, @Param("example") DeviceGoodsImgExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByPrimaryKeySelective(DeviceGoodsImg record);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByPrimaryKey(DeviceGoodsImg record);
}