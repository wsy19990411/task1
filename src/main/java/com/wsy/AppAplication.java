package com.wsy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: task1
 * @description:
 * @author: wsy
 * @create: 2020-05-18 15:31
 **/
@SpringBootApplication
public class AppAplication   implements WebMvcConfigurer {
    public static void main(String[] args) {
        SpringApplication.run(AppAplication.class, args);
    }
    //添加静态资源访问的映射
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");

    }
}
