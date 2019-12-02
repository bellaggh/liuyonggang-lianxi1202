package com.ribbon02.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "ribbon02")
public interface TestApi {
    @RequestMapping("test002")
    public String test002(@RequestParam("name")String name);
}
