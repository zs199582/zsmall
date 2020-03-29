package com.zsmall.service;


import com.zsmall.Error.ServiceException;
import com.zsmall.dataobject.UserDO;
import com.zsmall.service.model.UserModel;

public interface UserService {
    UserModel loginValidate(String username, String password) throws ServiceException;
}
