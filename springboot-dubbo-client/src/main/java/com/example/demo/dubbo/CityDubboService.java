package com.example.demo.dubbo;

/**
 * Created by alibeibei on 2017/11/30.
 */

import com.example.demo.domain.City;

/**
 * 城市业务 Dubbo 服务层
 * <p>
 * Created by bysocket on 28/02/2017.
 */
public interface CityDubboService {

    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName
     */
    City findCityByName(String cityName);
}
