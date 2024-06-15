package com.example.demoistio2.controller;

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
    private String demo1Url;

    @GetMapping("/service-2")
    public String getValues() {
        return "Getting Called by Service 2";
    }

    @GetMapping("/service-2-1")
    public String callService1() {
        String val = restTemplate.getForObject(demo1Url + "/service-1", String.class);
        return "Service call from service 2 to service 1 --- " + val;
    }

}
