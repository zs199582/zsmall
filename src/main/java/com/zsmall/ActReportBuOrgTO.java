/**
 * @(#)ActReportBuTO.java, 2019年01月03日.
 *
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.zsmall;

/**
 * 活动提报BU组
 * 
 * @author hzzhangxuehao
 */
public class ActReportBuOrgTO {

    /**
     * BU组ID
     */
    private long orgPosId;

    /**
     * BU组名称
     */
    private String orgPosName;

    public long getOrgPosId() {
        return orgPosId;
    }

    public void setOrgPosId(long orgPosId) {
        this.orgPosId = orgPosId;
    }

    public String getOrgPosName() {
        return orgPosName;
    }

    public void setOrgPosName(String orgPosName) {
        this.orgPosName = orgPosName;
    }

}
