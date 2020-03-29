package com.zsmall.service.model;

import java.math.BigDecimal;

//商品模型
public class ItemModel {

    /**
     * 商品id
     */
    private Integer id;
    /**
     * 商品名
     */
    private String title;
    /**
     * 商品价格
     */
    private BigDecimal price;
    /**
     * 商品图片
     */
    private String imgUrl;
    /**
     * 商品简要描述
     */
    private String briefDescription;
    /**
     * 商品详细描述
     */
    private String totalDescription;
    /**
     * 商品销量
     */
    private Integer sales;
    /**
     * 是否已购买
     */
    private Integer isBought;

    public Integer getIsBought() {
        return isBought;
    }

    public void setIsBought(Integer isBought) {
        this.isBought = isBought;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getBriefDescription() {
        return briefDescription;
    }

    public void setBriefDescription(String briefDescription) {
        this.briefDescription = briefDescription;
    }

    public String getTotalDescription() {
        return totalDescription;
    }

    public void setTotalDescription(String totalDescription) {
        this.totalDescription = totalDescription;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }
}
