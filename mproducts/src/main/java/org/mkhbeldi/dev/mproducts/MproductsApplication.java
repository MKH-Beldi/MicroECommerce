package org.mkhbeldi.dev.mproducts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MproductsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MproductsApplication.class, args);
    }

}
