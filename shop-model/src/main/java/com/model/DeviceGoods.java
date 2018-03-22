package com.model;

import java.io.Serializable;

public class DeviceGoods implements Serializable {
    /**
     * id
     */
    private Integer 主键;

    /**
     * device_id
     */
    private Integer 设备id;

    /**
     * goods_name
     */
    private String 商品名称;

    /**
     * stock
     */
    private Integer 库存;

    /**
     * sales_volume
     */
    private Integer 销量;

    /**
     * price
     */
    private Double 价格;

    /**
     * goods_describe
     */
    private String 商品描述;

    /**
     * device_goods
     */
    private static final long serialVersionUID = 1L;

    /**
     * id
     * @return 主键 id
     */
    public Integer get主键() {
        return 主键;
    }

    /**
     * id
     * @param 主键 id
     */
    public void set主键(Integer 主键) {
        this.主键 = 主键;
    }

    /**
     * device_id
     * @return 设备id device_id
     */
    public Integer get设备id() {
        return 设备id;
    }

    /**
     * device_id
     * @param 设备id device_id
     */
    public void set设备id(Integer 设备id) {
        this.设备id = 设备id;
    }

    /**
     * goods_name
     * @return 商品名称 goods_name
     */
    public String get商品名称() {
        return 商品名称;
    }

    /**
     * goods_name
     * @param 商品名称 goods_name
     */
    public void set商品名称(String 商品名称) {
        this.商品名称 = 商品名称 == null ? null : 商品名称.trim();
    }

    /**
     * stock
     * @return 库存 stock
     */
    public Integer get库存() {
        return 库存;
    }

    /**
     * stock
     * @param 库存 stock
     */
    public void set库存(Integer 库存) {
        this.库存 = 库存;
    }

    /**
     * sales_volume
     * @return 销量 sales_volume
     */
    public Integer get销量() {
        return 销量;
    }

    /**
     * sales_volume
     * @param 销量 sales_volume
     */
    public void set销量(Integer 销量) {
        this.销量 = 销量;
    }

    /**
     * price
     * @return 价格 price
     */
    public Double get价格() {
        return 价格;
    }

    /**
     * price
     * @param 价格 price
     */
    public void set价格(Double 价格) {
        this.价格 = 价格;
    }

    /**
     * goods_describe
     * @return 商品描述 goods_describe
     */
    public String get商品描述() {
        return 商品描述;
    }

    /**
     * goods_describe
     * @param 商品描述 goods_describe
     */
    public void set商品描述(String 商品描述) {
        this.商品描述 = 商品描述 == null ? null : 商品描述.trim();
    }
}