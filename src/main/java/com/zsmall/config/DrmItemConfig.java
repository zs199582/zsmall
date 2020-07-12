package com.zsmall.config;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.beans.factory.annotation.Value;

import java.util.Map;

/**
 * @author zhangshuo7@corp.netease.com
 * @date 2020/6/12
 */
@EnableApolloConfig
public class DrmItemConfig {
    @Value("${indexModuleSwitch}")
    private Map<String,Boolean> indexModuleSwitch;

    public Map<String, Boolean> getIndexModuleSwitch() {
        return indexModuleSwitch;
    }
}
