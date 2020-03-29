package com.zsmall.Error;

public interface CommonError {
    public int getErrorCode();
    public String getErrMsg();
    public CommonError setErrMsg(String errMsg);
}
