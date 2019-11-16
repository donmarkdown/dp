package com.demo.dp.oauth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qupengcheng
 * @description
 * @date 20:48 2019/11/15
 */
@RestController
@RequestMapping
public class ApiLoginController {

    @GetMapping("hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("api/hello")
    public String apiHello() {
        return "Hello World";
    }
}
