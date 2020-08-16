package com.zsmall;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.serializer.BeforeFilter;
import com.google.common.collect.Lists;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
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
@EnableConfigurationProperties
@RestController
@MapperScan("com.zsmall.dao")
public class Start {

    public static void main(String[] args) {
        SpringApplication.run(Start.class,args);
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
