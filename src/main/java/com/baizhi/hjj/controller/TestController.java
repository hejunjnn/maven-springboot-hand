package com.baizhi.hjj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Test")
public class TestController {


    @RequestMapping("/test")
    public String Test() {
        System.out.println("hehe");
        System.out.println("哈哈哈哈");

        return "hello springboot";
    }
}
