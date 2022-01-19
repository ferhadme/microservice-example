package com.ferhad.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ferhad.gateway.config.filters.PreFilter;
import com.ferhad.gateway.config.filters.PostFilter;
import com.ferhad.gateway.config.filters.RouteFilter;
import com.ferhad.gateway.config.filters.ErrorFilter;


@Configuration
public class ZuulConfig {

    @Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }

    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }

    @Bean
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }

    @Bean
    public RouteFilter routeFilter() {
        return new RouteFilter();
    }
}
