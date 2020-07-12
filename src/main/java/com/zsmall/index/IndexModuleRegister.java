package com.zsmall.index;

import org.apache.commons.lang3.StringUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhangshuo7@corp.netease.com
 * @date 2020/6/27
 */
public class IndexModuleRegister {

    private Map<String,IndexModuleHandler> handlerMap = new ConcurrentHashMap<>();

    /**
     * map中注册模块hanler
     * @param handler
     */
    public void register(IndexModuleHandler handler){
        if(handler == null){
            return;
        }
        String key = handler.getModuleKey();
        if(!handlerMap.containsKey(key)) {
            handlerMap.put(handler.getModuleKey(), handler);
        }
    }
    public Map<String, IndexModuleHandler> getHandlerMap(){
        return this.handlerMap;
    }
}
