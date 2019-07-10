package com.jsti.overloadzipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin2.server.internal.EnableZipkinServer;

@EnableDiscoveryClient
@SpringBootApplication
@EnableZipkinServer
public class OverloadZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run( OverloadZipkinApplication.class, args );
    }

}
