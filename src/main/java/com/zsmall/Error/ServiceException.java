package com.zsmall.Error;

public class ServiceException extends Exception implements CommonError{

    private CommonError commonError;

    public ServiceException(CommonError commonError){
        this.commonError = commonError;
    }
    public ServiceException(CommonError error, String errMsg){
        super();
        this.commonError = error;
        this.commonError.setErrMsg(errMsg);
    }
    @Override
    public int getErrorCode() {
        return commonError.getErrorCode();
    }

    @Override
    public String getErrMsg() {
        return commonError.getErrMsg();
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
       return this.commonError.setErrMsg(errMsg);
    }
}
