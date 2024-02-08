package com.springrest.springrest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springrest.springrest.entity.Product;

@Configuration
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, JdbcTemplateAutoConfiguration.class})
public class MyConfig {

    @Bean
    public Product productService() {
        return new Product();
    }
}
