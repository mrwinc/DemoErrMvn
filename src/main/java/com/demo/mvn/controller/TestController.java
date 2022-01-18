package com.demo.mvn.controller;

import com.demo.mvn.service.ServiceA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    public ServiceA serviceA;

    @GetMapping("/test")
    public String test() {
        return serviceA.getName();
    }
}
