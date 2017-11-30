package com.example.demo.dubbo;

import com.example.demo.domain.City;

/**
 * Created by alibeibei on 2017/11/30.
 */
public interface CityDubboService {
    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName
     */
    City findCityByName(String cityName);
}
