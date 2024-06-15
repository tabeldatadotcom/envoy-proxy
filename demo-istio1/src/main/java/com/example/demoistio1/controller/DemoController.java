package com.example.demoistio1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${demo1.url}")
    private String demo2Url;

    @GetMapping("/service-1")
    public String getValues() {
        return "Getting Called by Service 1";
    }

    @GetMapping("/service-1-2")
    public String getValueFromService2() {
        String val = restTemplate.getForObject(demo2Url + "/service-2", String.class);
        return "Service call from service 1 to service 2 --- " + val;
    }

}
