/**
 * @(#)ActReportPlaySkuVO.java, 2019年1月3日.
 *
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.zsmall;

import java.util.Map;

/**
 * 页面视图对象
 *
 * @author hzzhangxuehao
 */
public class ActReportPlaySkuTO {

    /**
     * 玩法sku Id
     */
    private long id;

    /**
     * TB_IC_ACT_REPORT_PLAY主键
     */
    private long actReportPlayId;

    /**
     * SkuId
     */
    private long skuId;

    /**
     * SKU规格
     */
    private String skuSpec;
    
    /**
     * 商品id
     */
    private long itemId;

    /**
     * 状态：0-草稿，1-生效中 2-已失效 {@see ActReportPlaySkuStatus}
     */
    private int status;

    /**
     * 商品审批状态：1-审批通过 2-审批驳回 3-放弃工单 4-不参加活动 5-超时未审批 {@see ActReportPlayAuditStatus}
     */
    private int auditStatus;

    /**
     * 运营审批状态：1-审批通过 2-审批驳回 3-放弃工单 4-不参加活动 5-超时未审批 {@see ActReportPlayAuditStatus}
     */
    private int opsAuditStatus;

    /**
     * 选品活动配置状态：0-未配置，1-已配置 {@see ActReportPlaySelectStatus}
     */
    private int selectStatus;

    /**
     * 创建来源：0-运营工作台，1-商品中心 {@see ActReportPlaySource}
     */
    private int source;

    /**
     * 更新来源：0-运营工作台，1-商品中心 {@see ActReportPlaySource}
     */
    private int updateSource;

    /**
     * 商品中心最后审批人
     */
    private String auditor;

    /**
     * 运营最后审批人
     */
    private String opsAuditor;
    
    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建时间
     */
    private long createTime;

    /**
     * 更新人
     */
    private String updator;

    /**
     * 更新时间
     */
    private long updateTime;

    /**
     * 玩法sku属性名-属性值映射
     */
    private Map<String, String> attrMap;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getActReportPlayId() {
        return actReportPlayId;
    }

    public void setActReportPlayId(long actReportPlayId) {
        this.actReportPlayId = actReportPlayId;
    }

    public long getSkuId() {
        return skuId;
    }

    public void setSkuId(long skuId) {
        this.skuId = skuId;
    }

    public String getSkuSpec() {
        return skuSpec;
    }

    public void setSkuSpec(String skuSpec) {
        this.skuSpec = skuSpec;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(int auditStatus) {
        this.auditStatus = auditStatus;
    }

    public int getOpsAuditStatus() {
        return opsAuditStatus;
    }

    public void setOpsAuditStatus(int opsAuditStatus) {
        this.opsAuditStatus = opsAuditStatus;
    }

    public int getSelectStatus() {
        return selectStatus;
    }

    public void setSelectStatus(int selectStatus) {
        this.selectStatus = selectStatus;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public int getUpdateSource() {
        return updateSource;
    }

    public void setUpdateSource(int updateSource) {
        this.updateSource = updateSource;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public String getOpsAuditor() {
        return opsAuditor;
    }

    public void setOpsAuditor(String opsAuditor) {
        this.opsAuditor = opsAuditor;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    public Map<String, String> getAttrMap() {
        return attrMap;
    }

    public void setAttrMap(Map<String, String> attrMap) {
        this.attrMap = attrMap;
    }

}
