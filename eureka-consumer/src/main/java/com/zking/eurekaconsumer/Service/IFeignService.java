package com.zking.eurekaconsumer.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(value = "eureka-provider")
public interface IFeignService {
    @RequestMapping("/test")
    public String test(@RequestParam("name")String name);
}
