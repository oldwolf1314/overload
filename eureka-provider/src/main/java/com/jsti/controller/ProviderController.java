package com.jsti.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name){
        return "hello," + name;
    }
}
