package com.example.springbootconfiguration.service;

import java.util.List;

/**
 * redis接口
 * Created by alibeibei on 2017/12/7.
 */
public interface IRedisService {

    public void set(String key, String value);

    public String get(String key);

    public boolean expire(String key, long expire);

    public <T> void setList(String key, List<T> list);

    public <T> List<T> getList(String key, Class<T> clz);

    public long lpush(String key, Object obj);

    public long rpush(String key, Object obj);

    public Object lpop(String key);

    public Object rpop(String key);

}
