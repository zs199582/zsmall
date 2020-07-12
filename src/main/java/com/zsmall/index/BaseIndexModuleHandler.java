package com.zsmall.index;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @author zhangshuo7@corp.netease.com
 * @date 2020/6/27
 */
public abstract class BaseIndexModuleHandler implements IndexModuleHandler {

    @Resource
    private IndexModuleRegister indexModuleRegister;

    @PostConstruct
    protected void register(){
        indexModuleRegister.register(this);
    }

    protected String getKey(Component component){
        return component.getKey();
    }

}
