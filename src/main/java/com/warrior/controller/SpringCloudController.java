package com.warrior.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author: lqh
 * @description: controller
 * @program: SpringCloudDemo
 * @create: 2018-06-05 14:44
 **/
@RestController
@RequestMapping("sc")
public class SpringCloudController {
    @GetMapping("hello")
    public String hello() {
        return "helloWorld!!!!";
    }
}
