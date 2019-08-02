package com.qf.j1902.service;
/**
 *@author Mac
 *@date 2019/7/10
 */
public interface RedisService {
    public String put(String key, Object value, long seconds);
    public String get(String key);
}
