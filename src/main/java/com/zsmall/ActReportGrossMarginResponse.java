package com.zsmall;

import java.util.List;

/**
 * @author :zhangshuo7@corp.netease.com
 * @date :15:30 2020/4/17
 * 商品毛利率 post请求，返回数据模型
 */
public class ActReportGrossMarginResponse {

    private int code;

    private String msg;

    private List<ActReportDpsSkuGrossMarginData> data;

    private String requestId;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<ActReportDpsSkuGrossMarginData> getData() {
        return data;
    }

    public void setData(List<ActReportDpsSkuGrossMarginData> data) {
        this.data = data;
    }
}
