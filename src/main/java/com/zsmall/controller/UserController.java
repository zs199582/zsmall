package com.zsmall.controller;

import com.zsmall.Error.EmServiceError;
import com.zsmall.Error.ServiceException;
import com.zsmall.response.CommonReturnType;
import com.zsmall.service.UserService;
import com.zsmall.service.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private HttpServletRequest httpServletRequest;

    //登录
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    @ResponseBody
    public CommonReturnType login(@RequestParam (name = "username")String userName, @RequestParam(name="password")String password) throws ServiceException {
        //调用userservice ，验证用户名和密码
        UserModel user = userService.loginValidate(userName,password);
        //如果从数据库中取不到user
        if(user==null)
            return CommonReturnType.create(EmServiceError.USER_NOT_EXIST,"fail");
        //如果获取到对应的用户，加入到session中
        else{
            httpServletRequest.getSession().setAttribute("IS_LOGIN",true);
            httpServletRequest.getSession().setAttribute("USER_INFO",user);
            return CommonReturnType.create(user);
        }

    }
    //获取session中的用户
    @RequestMapping("/getUser")
    @ResponseBody
    public CommonReturnType getUser(){
       UserModel user = (UserModel) httpServletRequest.getSession().getAttribute("USER_INFO");
       return CommonReturnType.create(user);
    }
    //退出登录
    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    @ResponseBody
    public CommonReturnType logout(@RequestParam(value = "username") String userName){
        httpServletRequest.getSession().setAttribute("IS_LOGIN",false);
        httpServletRequest.getSession().setAttribute("USER_INFO",null);
        return CommonReturnType.create(null);
    }
}
