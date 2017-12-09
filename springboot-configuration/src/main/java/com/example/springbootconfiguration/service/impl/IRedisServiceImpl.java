package com.example.springbootconfiguration.service.impl;

import com.alibaba.fastjson.JSON;
import com.example.springbootconfiguration.service.IRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class IRedisServiceImpl implements IRedisService {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;


    @Override
    public void set(String key, String value) {
        stringRedisTemplate.opsForValue().set(key, value);
    }

    @Override
    public String get(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }

    @Override
    public boolean expire(String key, long expire) {
        return redisTemplate.expire(key, expire, TimeUnit.SECONDS);
    }

    @Override
    public <T> void setList(String key, List<T> list) {
        set(key, JSON.toJSONString(list));
    }

    @Override
    public <T> List<T> getList(String key, Class<T> clz) {
        String json = get(key);
        if (json != null) {
            List<T> list = JSON.parseArray(json, clz);
            return list;
        }
        return null;
    }

    @Override
    public long lpush(String key, Object obj) {
        return redisTemplate.opsForList().leftPush(key, obj);
    }

    @Override
    public long rpush(String key, Object obj) {
        return redisTemplate.opsForList().rightPush(key, obj);
    }

    @Override
    public Object lpop(String key) {
        return redisTemplate.opsForList().leftPop(key);
    }

    @Override
    public Object rpop(String key) {
        return redisTemplate.opsForList().rightPop(key);
    }
}
