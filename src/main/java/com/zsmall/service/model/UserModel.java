package com.zsmall.service.model;

/**
 * 用户模型
 */
public class UserModel {
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 用户名
     */
    private String name;
    /**
     * 密码
     */
    private String password;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
