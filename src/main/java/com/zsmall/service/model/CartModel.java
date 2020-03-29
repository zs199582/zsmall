package com.zsmall.service.model;
//购物车模型
public class CartModel {
    //商品
    private ItemModel itemModel;
    //购买数量
    private Integer amount;

    public ItemModel getItemModel() {
        return itemModel;
    }

    public void setItemModel(ItemModel itemModel) {
        this.itemModel = itemModel;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
