package com.akshay.cloudgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {
    @GetMapping("/userServiceFallback")
    public String userServiceFallback(){

        return "user service taking time larger than expected.";
    }
    @GetMapping("/departmentServiceFallback")
    public String departmentServiceFallback(){

        return "department service taking time larger than expected.";
    }

}

