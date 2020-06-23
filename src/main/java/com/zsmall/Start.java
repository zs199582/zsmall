package com.zsmall;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.serializer.BeforeFilter;
import com.google.common.collect.Lists;
import com.zsmall.util.RedisUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@SpringBootApplication(scanBasePackages = "com.zsmall")
@RestController
@MapperScan("com.zsmall.dao")
public class Start {

    public static void main(String[] args) {
        SpringApplication.run(Start.class,args);
        RedisUtil redisUtil = new RedisUtil();
        redisUtil.set("test","target",1);
        String result = (String)redisUtil.get("test",1);
        System.out.println(result);
        List<Long> target = new ArrayList<>();
        target.add(0L);
        target.add(1L);
        testc testc1 = new testc();
        testc testc2 = new testc();
        testc testc3 = new testc();
        testc testc4 = new testc();
        testc1.setId(0L);
        testc2.setId(1L);
        testc3.setId(2L);
        testc4.setId(3L);
        List<testc> list = Lists.newArrayList(testc1,testc2,testc3,testc4);
        for(int i = 0; i< target.size(); i++){
            for(testc item:list){
                if(item.getId() == target.get(i)){
                    list.remove(item);
                    list.add(0,item);
                    break;
                }
            }
        }
        System.out.println(JSON.toJSONString(list));
        String jsonSource = "[{\"id\":1,\"sex\":1},{\"id\":0,\"sex\":2},{\"id\":2},{\"id\":3}]";
        List<testc> list1 = JSON.parseArray(jsonSource,testc.class);
        System.out.println(list1);
    }
    private static class testc{
        private long id;
        private String name;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
