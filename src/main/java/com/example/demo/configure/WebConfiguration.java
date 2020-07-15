package com.example.demo.configure;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

//        registry.addResourceHandler("/app/**")
//                .addResourceLocations("classpath:/static/index.html");
        registry.addResourceHandler("/*.ico")
                .addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/*.json")
                .addResourceLocations("classpath:/static/");

    }
}

