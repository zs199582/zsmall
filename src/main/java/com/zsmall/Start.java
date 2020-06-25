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
