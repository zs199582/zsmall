package com.zsmall.controller;

import com.alibaba.fastjson.JSON;
import com.zsmall.Error.EmServiceError;
import com.zsmall.Error.ServiceException;
import com.zsmall.annotation.Log;
import com.zsmall.dataobject.ItemDO;
import com.zsmall.response.CommonReturnType;
import com.zsmall.service.ItemService;
import com.zsmall.service.model.CartModel;
import com.zsmall.service.model.ItemModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @Autowired
    private HttpServletRequest httpServletRequest;

    @Autowired
    private RedisTemplate redisTemplate;

//    @Resource
//    private RedisTemplate redisTemplate;

//    @Resource
//    private CommonCacheService commonCacheService;

    //获取所有商品
    @RequestMapping("/")
    @ResponseBody
    @Log
    public CommonReturnType getIndex(){
        ItemModel[] items = itemService.getItems();
        return CommonReturnType.create(items);
//        return items;
    }

    //获取所有商品
    @RequestMapping("/portal")
    @ResponseBody
    public CommonReturnType getItemList(){
        ItemModel[] items = itemService.getItems();
        return CommonReturnType.create(items);
//        return items;
    }

    //根据商品id 获取商品详细信息
    @RequestMapping("/show")
    @ResponseBody
    @Log
    public CommonReturnType getItemFromId(@RequestParam(value = "id")String id){
        ItemModel itemModel = (ItemModel) redisTemplate.opsForValue().get("item_"+id);
        if(itemModel == null){
             itemModel = itemService.getItemFromId(id);
             redisTemplate.opsForValue().set("item_"+id, itemModel);
        }
        if(itemModel == null){
            return CommonReturnType.create(EmServiceError.ITEM_EDIT_FAIL,"fail");
        }
        return CommonReturnType.create(itemModel);
    }

    //新增商品
    @RequestMapping("/public")
    @ResponseBody
    public CommonReturnType createItem(@RequestParam(name = "title") String title,
                                @RequestParam(name = "briefDescription") String briefDescription,
                                @RequestParam(name = "price") Double price,
                                @RequestParam(name = "imgUrl") String imgUrl,
                                @RequestParam(name = "totalDescription") String description) throws ServiceException {
        ItemModel item = new ItemModel();
        item.setTitle(title);
        item.setBriefDescription(briefDescription);
        item.setImgUrl(imgUrl);
        item.setPrice(new BigDecimal(price));
        item.setTotalDescription(description);
        item.setSales(0);
        item.setIsBought(0);
        if(itemService.createItem(item)){
            return CommonReturnType.create(item);
        }
        else return CommonReturnType.create(EmServiceError.ITEM_CREATE_FAIL,"fail");
    }
    //编辑商品
    @RequestMapping(value = "/edit",method = RequestMethod.POST)
    @ResponseBody
    public CommonReturnType editItem(@RequestParam(name = "id") Integer itemId,
                              @RequestParam(name = "title") String title,
                              @RequestParam(name = "briefDescription") String briefDescription,
                              @RequestParam(name = "price") Double price,
                              @RequestParam(name = "imgUrl") String imgUrl,
                              @RequestParam(name = "totalDescription") String description) throws ServiceException {
        //先从数据库中查询对应的商品
        ItemModel item = itemService.getItemFromId(itemId.toString());
        //
        item.setTitle(title);
        item.setBriefDescription(briefDescription);
        item.setPrice(new BigDecimal(price));
        item.setImgUrl(imgUrl);
        item.setTotalDescription(description);
        if(itemService.editItem(item)){
            return CommonReturnType.create(item);
        }
        else return CommonReturnType.create(EmServiceError.ITEM_EDIT_FAIL,"fail");
    }
    @RequestMapping("/deleteItem")
    @ResponseBody
    public CommonReturnType deleteItem(@RequestParam(name = "id") Integer itemId){
        itemService.deleteItem(itemId);
        return CommonReturnType.create(null);
    }
    @RequestMapping(value="/addImg",method={RequestMethod.POST})
    @ResponseBody
    public Map<String,Object> addImg(HttpServletRequest request, HttpServletResponse response){
        Map<String,Object> result= new HashMap<String, Object>();

        // 转型为MultipartHttpRequest：
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        // 获得文件：
        MultipartFile file= multipartRequest.getFile("file");
        try{
            if(!(file.getOriginalFilename() == null || "".equals(file.getOriginalFilename()))){
                String imgDir = "E:\\images";        // 图片上传地址
                // 对文件进行存储处理
                byte[] bytes = file.getBytes();
                Path path = Paths.get(imgDir,"\\"+file.getOriginalFilename());
                Files.write(path,bytes);

                result.put("msg","上传成功！");
                result.put("result",true);
            }
        }catch(IOException e){
            result.put("msg","出错了");
            result.put("result",false);
            e.printStackTrace();
        }catch (Exception e1){
            e1.printStackTrace();
        }
        return result;
    }


}
