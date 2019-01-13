package com.mitsui.spring.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by mitsui on 2019/1/8.
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService() {
//        return restTemplate.getForObject("http://localhost:8762/hi",String.class);
        return restTemplate.getForObject("http://eureka-provider/hi",String.class);
    }

    public String hiError() {
        return "error!";
    }
}
