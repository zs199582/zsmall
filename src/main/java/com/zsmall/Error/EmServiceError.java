package com.zsmall.Error;

public enum EmServiceError implements CommonError{
    //用户error
    USER_NOT_EXIST(10001,"用户不存在"),
    USER_LOGIN_FAILED(10002,"登录失败"),
    //商品error
    ITEM_CREATE_FAIL(20001,"商品创建失败"),
    ITEM_EDIT_FAIL(20001,"商品修改失败"),
    ITEM_NOT_EXIST(20002,"商品不存在"),
    //下单error
    ORDER_SELLER_FORBID(30001,"卖家不能下单"),
    ;

    //错误码
    private int errCode;
    //错误信息
    private String errMsg;
    private EmServiceError(int errCode,String errMsg){
        this.errMsg = errMsg;
        this.errCode = errCode;
    }
    @Override
    public int getErrorCode() {
        return this.errCode;
    }

    @Override
    public String getErrMsg() {
        return this.errMsg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
}
