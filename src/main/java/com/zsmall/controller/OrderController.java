package com.zsmall.controller;

import com.zsmall.Error.EmServiceError;
import com.zsmall.Error.ServiceException;
import com.zsmall.response.CommonReturnType;
import com.zsmall.service.ItemService;
import com.zsmall.service.OrderService;
import com.zsmall.service.model.CartModel;
import com.zsmall.service.model.ItemModel;
import com.zsmall.service.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller
public class OrderController {
    @Autowired
    private ItemService itemService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private HttpServletRequest httpServletRequest;

    @RequestMapping("/createOrder")
    @ResponseBody
    public CommonReturnType createOrder() throws ServiceException {
        //验证是否登录
//        Boolean isLogin = (Boolean)httpServletRequest.getSession().getAttribute("IS_LOGIN");
//        if(!isLogin||isLogin==null){
//            throw new ServiceException(EmServiceError.USER_NOT_EXIST);
//        }
//        UserModel user = (UserModel) httpServletRequest.getSession().getAttribute("USER_INFO");
//        //判断登录用户是否为seller
//        if(user.getName().equals("seller")){
//            throw new ServiceException(EmServiceError.ORDER_SELLER_FORBID);
//        }

        //测试用
//        Map<Integer, CartModel> cartMap = new HashMap<>();
//        ItemModel item = itemService.getItemFromId("1");
//        CartModel cartModel = new CartModel();
//        cartModel.setAmount(1);
//        cartModel.setItemModel(item);
//        cartMap.put(1,cartModel);
//        httpServletRequest.getSession().setAttribute("cartMap",cartMap);

        //从session中取出购物车
        Map<Integer, CartModel> carMap = (Map<Integer, CartModel>)httpServletRequest.getSession().getAttribute("cartMap");
        List<String> itemId = new ArrayList<>();
        List<Integer> amount = new ArrayList<>();
        for (Integer id:carMap.keySet()
             ) {
            CartModel cartItem = carMap.get(id);
            itemId.add(cartItem.getItemModel().getId().toString());
            amount.add(cartItem.getAmount());
        }
        //购物车中的商品统一下单
        orderService.createOrder("1",itemId.toArray(new String[itemId.size()]),amount.toArray(new Integer[amount.size()]));
        //修改商品信息，改为已购买
        for(String id:itemId){
            itemService.updateBoughtItem(Integer.valueOf(id));
        }
        System.out.println("下单成功");
        return CommonReturnType.create(null);
    }

    @RequestMapping("/listOrder")
    @ResponseBody
    public CommonReturnType listOrder(){
       return CommonReturnType.create(orderService.listOrder());
    }

    @RequestMapping("/getOldPrice")
    @ResponseBody
    public CommonReturnType getOldPrice(@RequestParam(value = "id") Integer id){
       Double price = orderService.getOldPrice(id);
       return CommonReturnType.create(price);
    }
}
