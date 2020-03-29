package com.zsmall.service.serviceImpl;

import com.zsmall.dao.ItemDOMapper;
import com.zsmall.dao.OrderDOMapper;
import com.zsmall.dataobject.ItemDO;
import com.zsmall.dataobject.OrderDO;
import com.zsmall.service.OrderService;
import com.zsmall.service.model.FinacialModel;
import com.zsmall.service.model.ItemModel;
import com.zsmall.service.model.OrderModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    public OrderDOMapper orderDOMapper;

    @Autowired
    public ItemDOMapper itemDOMapper;

    @Override
    @Transactional
    public int createOrder(String userId, String[] itemId, Integer[] amount) {
        //商品数量
        int itemCount = itemId.length;
        ItemModel itemModel;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for(int i = 0;i<itemCount;i++){
            OrderModel order = new OrderModel();
            ItemDO item = itemDOMapper.selectByPrimaryKey(Integer.valueOf(itemId[i]));
            //创建订单OrderModel
            order.setUserId(Integer.valueOf(userId));//userid
            order.setItemId(Integer.valueOf(itemId[i])); //itemId
            order.setAmount(amount[i]); // amount
            order.setTime(sdf.format(new Date())); // time
            order.setItemPrice(item.getPrice());   //price
            order.setTotalPrice(new BigDecimal(item.getPrice()*amount[i])); //totalprice
            //插入数据库
            orderDOMapper.insert(convertFromModel(order));
            //修改商品销量
            itemDOMapper.updateSales(amount[i],Integer.valueOf(itemId[i]));
        }
        //返回商品数量
        return itemCount;
    }

    @Override
    public List<FinacialModel> listOrder() {
       List<OrderDO> orderDOList = orderDOMapper.listOrder();
       List<FinacialModel> finacialModels = new ArrayList<>();
       for(OrderDO order:orderDOList){
           FinacialModel finacialModel = new FinacialModel();
           //读出每一笔订单对应的商品
           ItemDO item = itemDOMapper.selectByPrimaryKey(order.getItemId());
           if(item == null){
               continue;
           }

           //设置finacialmodel的参数
           finacialModel.setImgUrl(item.getImgUrl());
           finacialModel.setTitle(item.getTitle());
           finacialModel.setTime(order.getTime());
           finacialModel.setAmount(order.getAmount());
           finacialModel.setPrice(order.getPrice());
           finacialModels.add(finacialModel);
       }
       return finacialModels;
    }

    //获取原来交易时的价格
    @Override
    public Double getOldPrice(Integer id) {
        return orderDOMapper.selectPrice(id);
    }

    public OrderDO convertFromModel(OrderModel orderModel){
        if(orderModel == null) return null;
        else{
            OrderDO orderDO = new OrderDO();
            BeanUtils.copyProperties(orderModel,orderDO);
            orderDO.setPrice(orderModel.getItemPrice());
            orderDO.setTotalPrice(orderModel.getTotalPrice().doubleValue());
            return orderDO;
        }
    }
}
