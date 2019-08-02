package com.qf.j1902.utils;

import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * Created by Administrator on 2019/7/28.
 */
public class RedisUtils {
    private static JedisPool pool;
    static {
        pool=new JedisPool("10.12.159.32",6379);

    }
    public static void set(String key,String value,int time){
        Jedis jedis=pool.getResource();
        jedis.auth("1714");
        jedis.set(key,value);
        jedis.expire(key,time);
        jedis.close();
    }
    public  static void setTime(String key,int time){
        Jedis jedis=pool.getResource();
        jedis.auth("1714");
        jedis.expire(key,time);
        jedis.close();
    }
    public static String get(String key){
        Jedis jedis=pool.getResource();
        jedis.auth("1714");
        String r=jedis.get(key);
        jedis.close();
        return  r;
    }
}
