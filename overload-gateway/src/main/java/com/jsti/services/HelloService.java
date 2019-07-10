package com.jsti.services;

import com.jsti.services.impl.HelloServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "eureka-provider", fallback = HelloServiceImpl.class)
public interface HelloService {
    @RequestMapping("/hello/{name}")
    String hello(@PathVariable("name") String name);


}
