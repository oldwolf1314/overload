package com.jsti.controller;

import com.jsti.services.HelloService;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Configuration
public class InvokerController {
    @Resource
    private HelloService helloService;

    @RequestMapping("/invoker-hello/{name}")
    public String hello(@PathVariable("name") String name){
        return helloService.hello( name );

    }

}
