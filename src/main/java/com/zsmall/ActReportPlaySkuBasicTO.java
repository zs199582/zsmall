/**
 * @(#)ActReportPlaySkuUpsertTO.java, 2019年01月03日.
 *
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.zsmall;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Map;

/**
 * @author hzzhangxuehao
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ActReportPlaySkuBasicTO {

    /**
     * SkuId
     */
    private long skuId;

    /**
     * 玩法sku属性名-属性值映射, 没有时为空
     */
    private Map<String, String> attrMap;

    public long getSkuId() {
        return skuId;
    }

    public void setSkuId(long skuId) {
        this.skuId = skuId;
    }

    public Map<String, String> getAttrMap() {
        return attrMap;
    }

    public void setAttrMap(Map<String, String> attrMap) {
        this.attrMap = attrMap;
    }

}
