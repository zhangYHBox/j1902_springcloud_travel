package com.qf.j1902.service.impl;

import com.qf.j1902.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;
/**
 *@author Mac
 *@date 2019/7/10
 */
@Service
public class RedisServiceImpl implements RedisService {

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public String put(String key, Object value, long seconds) {
        redisTemplate.opsForValue().set(key,value,seconds, TimeUnit.SECONDS);
        return "ok";
    }

    @Override
    public String get(String key) {
        Object o = redisTemplate.opsForValue().get(key);
        if (o != null){
            String json = String.valueOf(o);
            return json;
        }
        return null;
    }
}
