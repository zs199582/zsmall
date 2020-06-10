package com.zsmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication(scanBasePackages = "com.zsmall")
@RestController
@MapperScan("com.zsmall.dao")
public class Start {

    public static void main(String[] args) {
        SpringApplication.run(Start.class,args);
//        int a = Math.abs(String.valueOf(300204464).hashCode()%1009);
//        System.out.println(a);
//        long couponId = Long.parseLong("21992707");
//        System.out.println(couponId);
//        String methodName = Thread.currentThread().getStackTrace()[0].getMethodName();
//        Map<String,Boolean> testMap = new HashMap<>();
//        testMap.put("1",true);
//        testMap.put("2",false);
//        testMap.put("3",false);
//        boolean result = true;
//        for (String couponCode : testMap.keySet()) {
//            result = result && testMap.get(couponCode);
//        }
        System.out.println(Integer.parseInt(null));
    }
}
