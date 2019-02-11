package com.mitsui.spring.eurekaserver;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mitsui on 2019/2/9.
 */
@RestController
@RequestMapping(path = "/")
public class Healthz {
    @GetMapping(path = "/healthz",produces = MediaType.TEXT_PLAIN_VALUE)
    public String healthz(){
        return "ok";
    }
}
