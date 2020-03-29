package com.zsmall.service.model;

//账务模型
public class FinacialModel {
    /**
     * 商品图片
     */
    private String imgUrl;
    /**
     * 商品标题
     */
    private String title;
    /**
     * 购买时间
     */
    private String time;
    /**
     * 购买数量
     */
    private Integer amount;
    /**
     * 购买时价格
     */
    private Double price;

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
