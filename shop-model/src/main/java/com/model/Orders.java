package com.model;

import java.io.Serializable;
import java.util.Date;

public class Orders implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 订单号
     */
    private String orderNum;

    /**
     * 订单金额
     */
    private Double orderAmount;

    /**
     * 商品数量
     */
    private Integer goodsNum;

    /**
     * 订单名称
     */
    private String orderName;

    /**
     * 订单状态
     */
    private Integer state;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * orders
     */
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * @return id 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 订单号
     * @return order_num 订单号
     */
    public String getOrderNum() {
        return orderNum;
    }

    /**
     * 订单号
     * @param orderNum 订单号
     */
    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum == null ? null : orderNum.trim();
    }

    /**
     * 订单金额
     * @return order_amount 订单金额
     */
    public Double getOrderAmount() {
        return orderAmount;
    }

    /**
     * 订单金额
     * @param orderAmount 订单金额
     */
    public void setOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     * 商品数量
     * @return goods_num 商品数量
     */
    public Integer getGoodsNum() {
        return goodsNum;
    }

    /**
     * 商品数量
     * @param goodsNum 商品数量
     */
    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    /**
     * 订单名称
     * @return order_name 订单名称
     */
    public String getOrderName() {
        return orderName;
    }

    /**
     * 订单名称
     * @param orderName 订单名称
     */
    public void setOrderName(String orderName) {
        this.orderName = orderName == null ? null : orderName.trim();
    }

    /**
     * 订单状态
     * @return state 订单状态
     */
    public Integer getState() {
        return state;
    }

    /**
     * 订单状态
     * @param state 订单状态
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}