package com.mitsui.spring.ribbon.controller;

import com.mitsui.spring.ribbon.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mitsui on 2019/1/8.
 */
@RestController
public class HelloControler {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "/feign")
    public String hi() {
        return schedualServiceHi.sayHiFromClientOne();
    }
}
