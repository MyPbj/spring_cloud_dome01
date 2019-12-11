package com.zking.eurekaconsumer.controller;

import com.zking.eurekaconsumer.Service.IFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private IFeignService feignService;
    @RequestMapping("/test")
    public String test(String name){
        return feignService.test(name);
    }
}
