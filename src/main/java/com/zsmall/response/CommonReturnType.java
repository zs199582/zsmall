package com.zsmall.response;

public class CommonReturnType {
    //返回的状态
    private String status;
    //返回的数据
    private Object data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    public static CommonReturnType create(Object data){
       return create(data,"success");
    }
    public static CommonReturnType create(Object data, String status){
        CommonReturnType commonReturnType = new CommonReturnType();
        commonReturnType.setData(data);
        commonReturnType.setStatus(status);
        return commonReturnType;
    }
}
