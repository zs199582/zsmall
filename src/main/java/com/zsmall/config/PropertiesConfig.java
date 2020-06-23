package com.zsmall.config;

import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;

/**
 * @author zhangshuo7@corp.netease.com
 * @date 2020/6/20
 */
public class PropertiesConfig {
    public static String getValue(String filename,String key){
        String value = null;
        try {
            value = PropertiesLoaderUtils.loadAllProperties(filename).getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return value;
    }
}
