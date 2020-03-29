package com.zsmall.service;

import com.zsmall.service.model.FinacialModel;

import java.util.List;

public interface OrderService {
    public int createOrder(String userId, String[] itemId, Integer[] amount);
    public List<FinacialModel> listOrder();
    public Double getOldPrice(Integer id);
}
