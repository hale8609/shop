package com.mapper;

import com.model.Orders;

public interface OrdersMapper {
    /**
     *
     * @mbggenerated 2018-03-22
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int insert(Orders record);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int insertSelective(Orders record);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    Orders selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int updateByPrimaryKeySelective(Orders record);

    /**
     *
     * @mbggenerated 2018-03-22
     */
    int updateByPrimaryKey(Orders record);
}