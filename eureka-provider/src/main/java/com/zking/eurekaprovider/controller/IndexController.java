package com.zking.eurekaprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping("/test")
    public String test(@RequestParam("name")String name){
        return "你好"+name+"!!!";
    }
}
