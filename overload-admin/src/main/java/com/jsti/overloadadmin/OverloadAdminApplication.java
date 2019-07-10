package com.jsti.overloadadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableDiscoveryClient
//@EnableCircuitBreaker
@EnableTurbine
@EnableHystrixDashboard
@SpringBootApplication //(exclude = {DataSourceAutoConfiguration.class})
@EnableAdminServer
//@EnableFeignClients
//@EnableWebSecurity
public class OverloadAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run( OverloadAdminApplication.class, args );
    }

}
