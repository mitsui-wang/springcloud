package com.mitsui.spring.ribbon.controller;

import com.mitsui.spring.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mitsui on 2019/1/8.
 */
@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/ribbon")
    public String hi() {
        return helloService.hiService();
    }
}
