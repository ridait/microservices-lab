package com.ridait.itbookcatalogservice.models;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CatalogBeansConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
