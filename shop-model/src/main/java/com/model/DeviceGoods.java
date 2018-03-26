package com.model;

import java.io.Serializable;

public class DeviceGoods implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * device_id
     */
    private Integer deviceId;

    /**
     * goods_name
     */
    private String goodsName;

    /**
     * stock
     */
    private Integer stock;

    /**
     * sales_volume
     */
    private Integer salesVolume;

    /**
     * price
     */
    private Double price;

    /**
     * goods_describe
     */
    private String goodsDescribe;

    /**
     * device_goods
     */
    private static final long serialVersionUID = 1L;

    /**
     * id
     * @return id id
     */
    public Integer getId() {
        return id;
    }

    /**
     * id
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * device_id
     * @return device_id device_id
     */
    public Integer getDeviceId() {
        return deviceId;
    }

    /**
     * device_id
     * @param deviceId device_id
     */
    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * goods_name
     * @return goods_name goods_name
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * goods_name
     * @param goodsName goods_name
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    /**
     * stock
     * @return stock stock
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * stock
     * @param stock stock
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * sales_volume
     * @return sales_volume sales_volume
     */
    public Integer getSalesVolume() {
        return salesVolume;
    }

    /**
     * sales_volume
     * @param salesVolume sales_volume
     */
    public void setSalesVolume(Integer salesVolume) {
        this.salesVolume = salesVolume;
    }

    /**
     * price
     * @return price price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * price
     * @param price price
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * goods_describe
     * @return goods_describe goods_describe
     */
    public String getGoodsDescribe() {
        return goodsDescribe;
    }

    /**
     * goods_describe
     * @param goodsDescribe goods_describe
     */
    public void setGoodsDescribe(String goodsDescribe) {
        this.goodsDescribe = goodsDescribe == null ? null : goodsDescribe.trim();
    }
}