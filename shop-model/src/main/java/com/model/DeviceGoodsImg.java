package com.model;

import java.io.Serializable;

public class DeviceGoodsImg implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 商品id
     */
    private Integer goodsId;

    /**
     * 类型
     */
    private String type;

    /**
     * 图片key
     */
    private String imgKey;

    /**
     * 图片url
     */
    private String imgUrl;

    /**
     * device_goods_img
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
     * 商品id
     * @return goods_id 商品id
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * 商品id
     * @param goodsId 商品id
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 类型
     * @return type 类型
     */
    public String getType() {
        return type;
    }

    /**
     * 类型
     * @param type 类型
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 图片key
     * @return img_key 图片key
     */
    public String getImgKey() {
        return imgKey;
    }

    /**
     * 图片key
     * @param imgKey 图片key
     */
    public void setImgKey(String imgKey) {
        this.imgKey = imgKey == null ? null : imgKey.trim();
    }

    /**
     * 图片url
     * @return img_url 图片url
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * 图片url
     * @param imgUrl 图片url
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }
}