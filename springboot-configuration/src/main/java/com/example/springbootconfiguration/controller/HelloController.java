package com.example.springbootconfiguration.controller;

import com.example.springbootconfiguration.config.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class HelloController {
    @Autowired
    private MyConfig myConfig;

    @RequestMapping("/config")
    public Object getConfig() {
        return myConfig.getServers();
    }
}