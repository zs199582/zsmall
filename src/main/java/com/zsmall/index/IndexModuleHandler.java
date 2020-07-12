package com.zsmall.index;

public interface IndexModuleHandler {
    /**
     * 获取模块key
     * @return
     */
    String getModuleKey();

    /**
     * 获取模块数据
     * @return
     */
    public Object getData();
}
