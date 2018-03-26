package com.mapper;

import com.model.Orders;
import com.model.OrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdersMapper {
    /**
     *
     * @mbg.generated 2018-03-26
     */
    long countByExample(OrdersExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int deleteByExample(OrdersExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int insert(Orders record);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int insertSelective(Orders record);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    List<Orders> selectByExample(OrdersExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    Orders selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByPrimaryKeySelective(Orders record);

    /**
     *
     * @mbg.generated 2018-03-26
     */
    int updateByPrimaryKey(Orders record);
}