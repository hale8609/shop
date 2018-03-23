package com.mapper;

import com.model.Orders;
import com.model.OrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdersMapper {
    /**
     *
     * @mbggenerated 2018-03-23
     */
    int countByExample(OrdersExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int deleteByExample(OrdersExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int insert(Orders record);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int insertSelective(Orders record);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    List<Orders> selectByExample(OrdersExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    Orders selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByPrimaryKeySelective(Orders record);

    /**
     *
     * @mbggenerated 2018-03-23
     */
    int updateByPrimaryKey(Orders record);
}