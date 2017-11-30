package com.example.demo.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.domain.City;
import com.example.demo.dubbo.CityDubboService;

/**
 * Created by alibeibei on 2017/11/30.
 */
// 注册为 Dubbo 服务
@Service(version = "1.0.0")
public class CityDubboServiceImpl implements CityDubboService {

    public City findCityByName(String cityName) {
        return new City(1L, 2L, "温岭", "是我的故乡");
    }
}
