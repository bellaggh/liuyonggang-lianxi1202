package com.ribbon02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableFeignClients
public class TestRibbonServer {
    public static void main(String[] args) {
        SpringApplication.run(TestRibbonServer.class);
    }

    @RequestMapping("testHealth")
    public String test(){
        System.out.println("----------ribbon--------");
        return "OK";
    }
}
