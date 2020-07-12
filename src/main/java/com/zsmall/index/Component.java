package com.zsmall.index;

public enum Component {

    INDEX_ITEMS_COMPONENT("1","首页items列表"),
    INDEX_FIX_COMPONENT("2","首页轮播图"),
    ;

    private String key;

    private String desc;

    private Component(String key,String desc){
      this.key = key;
      this.desc = desc;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
