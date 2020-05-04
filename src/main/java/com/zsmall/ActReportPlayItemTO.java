/**
 * @(#)ActReportPlayItemTO.java, 2019年1月3日.
 *
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.zsmall;

//import com.netease.mail.yanxuan.itemcenter.core.meta.to.ActReportBuOrgTO;
//import com.netease.yanxuan.icbasis.common.dal.enums.ItemStatus;

import java.util.List;

/**
 * 页面视图对象
 *
 * @author hzzhangxuehao
 */
public class ActReportPlayItemTO {

    /**
     * 商品id
     */
    private long itemId;

    /**
     * 商品名称
     */
    private String itemName;

    /**
     * 主站商品状态 0-未上架 1-未上架，2-已上架，4-预上架 {@link ItemStatus}
     */
    private int itemStatus;

    /**
     * 商品负责人邮箱
     */
    private String itemManager;

    /**
     * 商品负责人姓名
     */
    private String itemManagerName;

    /**
     * BU负责人邮箱
     */
    private String buManager;

    /**
     * BU负责人姓名
     */
    private String buManagerName;

    /**
     * BU类目运营邮箱
     */
    private String buOperator;

    /**
     * BU类目运营姓名
     */
    private String buOperatorName;
    
    /**
     * 商品的BU组
     */
    private ActReportBuOrgTO bu;

    /**
     * 销售类目列
     */
    private String category;

    /**
     * 物理类目
     */
    private String phyCategory;

    /**
     * sku列表
     */
    private List<ActReportPlaySkuTO> skuList;

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(int itemStatus) {
        this.itemStatus = itemStatus;
    }

    public String getItemManager() {
        return itemManager;
    }

    public void setItemManager(String itemManager) {
        this.itemManager = itemManager;
    }

    public String getItemManagerName() {
        return itemManagerName;
    }

    public void setItemManagerName(String itemManagerName) {
        this.itemManagerName = itemManagerName;
    }

    public String getBuManager() {
        return buManager;
    }

    public void setBuManager(String buManager) {
        this.buManager = buManager;
    }

    public String getBuManagerName() {
        return buManagerName;
    }

    public void setBuManagerName(String buManagerName) {
        this.buManagerName = buManagerName;
    }

    public String getBuOperator() {
        return buOperator;
    }

    public void setBuOperator(String buOperator) {
        this.buOperator = buOperator;
    }

    public String getBuOperatorName() {
        return buOperatorName;
    }

    public void setBuOperatorName(String buOperatorName) {
        this.buOperatorName = buOperatorName;
    }

    public ActReportBuOrgTO getBu() {
        return bu;
    }

    public void setBu(ActReportBuOrgTO bu) {
        this.bu = bu;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPhyCategory() {
        return phyCategory;
    }

    public void setPhyCategory(String phyCategory) {
        this.phyCategory = phyCategory;
    }

    public List<ActReportPlaySkuTO> getSkuList() {
        return skuList;
    }

    public void setSkuList(List<ActReportPlaySkuTO> skuList) {
        this.skuList = skuList;
    }

}
