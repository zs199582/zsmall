package com.zsmall.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.sound.midi.Soundbank;

/**
 * @author zhangshuo7@corp.netease.com
 * @date 2020/6/13
 */
@Slf4j
@Component
public class RedisUtil {

    @Autowired
    private JedisPool jedisPool;

    public Object get(String key, int indexDB){
        Jedis jedis = null;
        String value = null;
        try{
//            jedis = new Jedis("127.0.0.1",6379);
            if(jedisPool == null){
                System.out.println("jedisPool null");
            }
            jedis = jedisPool.getResource();
//            jedis.select(indexDB);
            value = jedis.get(key);
        }catch (Exception e){
            log.error("[op:get] redis get key error,key={}",key,e);
        }finally {
            returnResource(jedis);
        }
        return value;
    }

    /**
     * <p>
     * 通过key获取储存在redis中的value
     * </p>
     * <p>
     * 并释放连接
     * </p>
     *
     * @param key
     * @param indexdb 选择redis库 0-15
     * @return 成功返回value 失败返回null
     */
    public byte[] get(byte[] key,int indexdb) {
        Jedis jedis = null;
        byte[] value = null;
        try {
            jedis = jedisPool.getResource();
            jedis.select(indexdb);
            value = jedis.get(key);
        } catch (Exception e) {
            log.error(e.getMessage());
        } finally {
            returnResource(jedis);
        }
        return value;
    }

    public boolean set(String key,String value,int indexDB){
        Jedis jedis = null;
        try{
            jedis = jedisPool.getResource();
            jedis.select(indexDB);
            jedis.set(key,value);
            return true;
        }catch (Exception e){
            log.error("[op:set] redis set value error,key={},value={}",key,value);
            return false;
        }finally {
            returnResource(jedis);
        }
    }

    public Long del(String... keys){
        Jedis jedis = null;
        try{
            jedis = jedisPool.getResource();
            return jedis.del(keys);
        }catch(Exception e){
            log.error("[op:del] redis del error,keys={}",keys);
            return null;
        }
    }

    public static void returnResource(Jedis jedis){
        if(jedis != null){
            jedis.close();
        }
    }
}
