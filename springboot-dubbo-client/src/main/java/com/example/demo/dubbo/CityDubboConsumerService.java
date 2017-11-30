package com.example.demo.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.domain.City;
import org.springframework.stereotype.Component;

/**
 * Created by alibeibei on 2017/11/30.
 */
@Component
public class CityDubboConsumerService {

    @Reference(version = "1.0.0")
    CityDubboService cityDubboService;

    public void printCity() {
        String cityName = "温岭";
        City city = cityDubboService.findCityByName(cityName);
        System.out.println(city.toString());
    }
}
