package com.zsmall.service.model;

import java.math.BigDecimal;

//订单模型
public class OrderModel {
    /**
     * 订单id
     */
    private String id;
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 商品id
     */
    private Integer itemId;
    /**
     * 商品价格
     */
    private Double itemPrice;
    /**
     * 购买数量
     */
    private Integer amount;
    /**
     * 总价
     */
    private BigDecimal totalPrice;
    /**
     * 购买时间
     */
    private String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
}
