package com.zsmall.service;

import com.zsmall.service.model.ItemModel;

public interface ItemService {
    public abstract ItemModel[] getItems();
    public abstract ItemModel getItemFromId(String id);
    public abstract Boolean createItem(ItemModel itemModel);
    public abstract Boolean editItem(ItemModel itemModel);
    public abstract void updateBoughtItem(Integer id);
    public abstract void deleteItem(Integer id);
}
