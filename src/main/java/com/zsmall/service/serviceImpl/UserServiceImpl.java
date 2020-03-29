package com.zsmall.service.serviceImpl;

import com.zsmall.Error.EmServiceError;
import com.zsmall.Error.ServiceException;
import com.zsmall.dao.UserDOMapper;
import com.zsmall.dataobject.UserDO;
import com.zsmall.service.UserService;
import com.zsmall.service.model.UserModel;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.rmi.server.ServerCloneException;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDOMapper userDOMapper;
    //登录验证
    @Override
    public UserModel loginValidate(String username, String password)  throws ServiceException {
        //先从数据库中读取用户
        UserDO user =  userDOMapper.selectByUserName(username);
        //判断用户是否存在
        if(user==null){
            throw new ServiceException(EmServiceError.USER_NOT_EXIST,"用户不存在");
        }
//        判断密码是否正确
        if(!StringUtils.equals(password,user.getPassword())){
            throw new ServiceException(EmServiceError.USER_LOGIN_FAILED,"密码错误");
        }
        UserModel userModel = convertFromDO(user);
        return userModel;
    }
    private UserModel convertFromDO(UserDO userDO){
        UserModel userModel = new UserModel();
        userModel.setName(userDO.getUserName());
        userModel.setUserId(userDO.getUserid());
        BeanUtils.copyProperties(userDO,userModel);
        return userModel;
    }
}
