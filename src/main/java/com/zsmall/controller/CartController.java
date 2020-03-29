package com.zsmall.controller;

import com.zsmall.response.CommonReturnType;
import com.zsmall.service.ItemService;
import com.zsmall.service.model.CartModel;
import com.zsmall.service.model.ItemModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import java.util.HashMap;
import java.util.Map;

@Controller
public class CartController {
    @Autowired
    private ItemService itemService;
    @Autowired
    private HttpServletRequest httpServletRequest;

    //查看购物车
    @RequestMapping("/getCart")
    @ResponseBody
    public CommonReturnType getCart(){
        //从session中获取map
        Map<Integer, CartModel> cartMap = (Map<Integer, CartModel>) httpServletRequest.getSession().getAttribute("cartMap");
        return CommonReturnType.create(cartMap);
    }

    //添加到购物车
    @RequestMapping(value = "addCart",method = RequestMethod.POST)
    @ResponseBody
    public CommonReturnType addCart(@RequestParam(value = "itemId")Integer itemId, @RequestParam(value = "amount") Integer amount){
        //根据商品id获得商品
        ItemModel item = itemService.getItemFromId(itemId.toString());
        //从session中获取map
        Map<Integer, CartModel> cartMap = (Map<Integer, CartModel>) httpServletRequest.getSession().getAttribute("cartMap");
        if(cartMap == null){
            cartMap = new HashMap<>();
            httpServletRequest.getSession().setAttribute("cartMap",cartMap);
        }
        //查询session的map中是否有商品
        // 如果有，就数量增加
        if(cartMap.containsKey(itemId)){
            int originAmount = cartMap.get(itemId).getAmount();
            cartMap.get(itemId).setAmount(originAmount+amount);
        }
        // 如果没有，向map中新增
        else {
            CartModel cartModel = new CartModel();
            cartModel.setItemModel(item);
            cartModel.setAmount(amount);
            cartMap.put(itemId,cartModel);
        }
        HttpSession session  = httpServletRequest.getSession();
        session.setAttribute("cartMap",cartMap);
        //查看当前购物车中的商品
        Map<Integer,CartModel> cart = (Map<Integer, CartModel>) session.getAttribute("cartMap");
        for(Integer i:cart.keySet()){
            System.out.println(cart.get(i).getItemModel().getTitle());
        }
        return CommonReturnType.create(null);
    }
}
