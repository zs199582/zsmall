package com.zsmall.config;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

import java.lang.annotation.Target;
import java.lang.reflect.Method;

/**
 * @author zhangshuo7@corp.netease.com
 */
@Configuration
public class RedisConfig extends CachingConfigurerSupport {

    //自定义缓存key生成策略
    @Bean
    public KeyGenerator keyGenerator(){
        return new KeyGenerator() {
            @Override
            public Object generate(Object o, Method method, Object... objects) {
                StringBuffer sb = new StringBuffer();
                sb.append(o.getClass());
                sb.append(method.getName());
                for(Object object:objects){
                    sb.append(object.toString());
                }
                return sb.toString();
            }
        };
    }
    //缓存管理器
    @Bean
    public CacheManager cacheManager(@SuppressWarnings("rawtypes")RedisTemplate redisTemplate){
        RedisCacheManager cacheManager = new RedisCacheManager(redisTemplate);
        cacheManager.setDefaultExpiration(3600);
        return cacheManager;
    }
    @Bean
    public RedisTemplate<String,String> redisTemplate(RedisConnectionFactory factory){
        StringRedisTemplate template = new StringRedisTemplate(factory);
        //设置序列化工具
        setSerializer(template);
        template.afterPropertiesSet();
        return template;
    }

    private void setSerializer(StringRedisTemplate template){
        @SuppressWarnings({"rawtypes","unchecked"})
        Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
        ObjectMapper om = new ObjectMapper();
        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        jackson2JsonRedisSerializer.setObjectMapper(om);
        template.setValueSerializer(jackson2JsonRedisSerializer);
    }
}
