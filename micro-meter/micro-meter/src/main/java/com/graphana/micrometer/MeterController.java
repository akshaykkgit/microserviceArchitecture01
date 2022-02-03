package com.graphana.micrometer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeterController {

    @GetMapping
    public String test(){
        return "working";
    }
}
