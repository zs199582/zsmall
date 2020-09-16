package com.zsmall.service.serviceImpl;

import com.zsmall.dao.ItemDOMapper;
import com.zsmall.dataobject.ItemDO;
import com.zsmall.service.ItemService;
import com.zsmall.service.model.ItemModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemDOMapper itemDOMapper;

    //获取所有商品
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public ItemModel[] getItems() {
        List<ItemDO> items = itemDOMapper.selectAllItems();
        if(items==null) return null;
        //把itemDO转为itemModel
        List<ItemModel> itemModels = new ArrayList<>();
        ItemModel itemModel;
        for(ItemDO itemDO:items){
            itemModel = convertFromItemDO(itemDO);

            itemModel.setPrice(new BigDecimal(itemDO.getPrice()));
            itemModels.add(itemModel);
        }
        ItemModel[] itemModels1 = new ItemModel[itemModels.size()];
        itemModels.toArray(itemModels1);
        return itemModels1;
    }

    //根据id获取商品信息
    @Override
    @Transactional
    public ItemModel getItemFromId(String id) {
        ItemDO itemDO = itemDOMapper.selectByPrimaryKey(Integer.valueOf(id));
        //查不到商品，返回null
        if(itemDO==null) return null;
        ItemModel itemModel =  convertFromItemDO(itemDO);
        itemModel.setPrice(new BigDecimal(itemDO.getPrice()));
        return itemModel;
    }
    //创建商品
    @Override
    @Transactional
    public Boolean createItem(ItemModel itemModel) {
        ItemDO itemDO = convertFromItemModel(itemModel);
        itemDO.setPrice(itemModel.getPrice().doubleValue());
        //新商品未被购买
        itemDO.setIsBought(0);
        int result = itemDOMapper.insert(itemDO);
        return result>0;
    }
    //编辑商品
    @Override
    @Transactional
    public Boolean editItem(ItemModel itemModel) {
        ItemDO itemDO = convertFromItemModel(itemModel);
        itemDO.setPrice(itemModel.getPrice().doubleValue());
        int result = itemDOMapper.updateByPrimaryKey(itemDO);
        return result==1;
    }
    //设置商品为已购买
    @Override
    @Transactional
    public void updateBoughtItem(Integer id) {
        itemDOMapper.updateIsBoughtByPrimaryKey(id);
    }
    //删除商品
    @Override
    @Transactional
    public void deleteItem(Integer id) {
        itemDOMapper.deleteByPrimaryKey(id);
    }

    private ItemModel convertFromItemDO(ItemDO itemDO){
        ItemModel itemModel = new ItemModel();
        BeanUtils.copyProperties(itemDO,itemModel);
        return itemModel;
    }
    private ItemDO convertFromItemModel(ItemModel itemModel){
        ItemDO itemDO = new ItemDO();
        BeanUtils.copyProperties(itemModel,itemDO);
        return itemDO;
    }
}
