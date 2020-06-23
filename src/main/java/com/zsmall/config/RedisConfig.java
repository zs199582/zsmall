package com.zsmall.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author zhangshuo7@corp.netease.com
 * @date 2020/6/12
 */
@Configuration
@PropertySource("classpath:redis.properties")
public class RedisConfig{

    private static final Logger LOGGER
            = LoggerFactory.getLogger(RedisConfig.class);

    @Value("${spring.redis.host}")
    private String host;

    @Value("${spring.redis.port}")
    private int port;

    @Value("${spring.redis.timeout}")
    private int timeout;

    @Value("${spring.redis.jedis.pool.max-idle}")
    private int maxIdle;

    @Value("${spring.redis.jedis.pool.max-wait}")
    private long maxWaitMillis;

    @Value("${spring.redis.password}")
    private String password;

    @Value("${spring.redis.block-when-exhausted}")
    private boolean blockWhenExhausted;

    @Bean
    public JedisPool redisPoolFactory() throws Exception{
        LOGGER.info("开始注入jedisPool");
        try {
            JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
            jedisPoolConfig.setMaxIdle(maxIdle);
            jedisPoolConfig.setMaxWaitMillis(maxWaitMillis);

            //jedisPoolConfig.setBlockWhenExhausted(blockWhenExhausted);
            //jedisPoolConfig.setJmxEnabled(true);
            jedisPoolConfig.setTestOnBorrow(true);
//            构建连接池
//            JedisPool jedisPool = new JedisPool(jedisPoolConfig, host, port);
//            LOGGER.info("连接池构建成功,jedisPool={}", JSON.toJSONString(jedisPool));
            JedisPool jedisPool = new JedisPool(jedisPoolConfig ,"127.0.0.1",6379);
            if(jedisPool ==null){
                System.out.println("jedisPool null");
            }
            return jedisPool;
        }
        catch (Exception ex){
            LOGGER.error("redis连接池初始化失败 e=",ex);
            return null;
        }
    }




}
