package com.zsmall.index;

import com.zsmall.response.CommonReturnType;
import com.zsmall.service.ItemService;
import com.zsmall.service.model.ItemModel;
import org.springframework.beans.factory.annotation.Autowired;

import java.awt.event.ComponentEvent;

/**
 * @author zhangshuo7@corp.netease.com
 * @date 2020/6/27
 */
public class IndexItemsHandler extends BaseIndexModuleHandler implements IndexModuleHandler {

    @Autowired
    private ItemService itemService;

    @Override
    public String getModuleKey() {
        return getKey(Component.INDEX_ITEMS_COMPONENT);
    }

    @Override
    public Object getData() {
        ItemModel[] items = itemService.getItems();
        return CommonReturnType.create(items);
    }
}
