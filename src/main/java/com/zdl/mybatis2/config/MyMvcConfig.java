package com.zdl.mybatis2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


//使用WebMvcConfigurerAdapter可以来扩展SpringMVC的功能
//@EnableWebMvc
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // super.addViewControllers(registry);
        //浏览器发送 /atguigu 请求来到 success
        registry.addViewController("/acbd").setViewName("success");
        registry.addViewController("").setViewName("success");

    }

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
////        super.addResourceHandlers(registry);
//        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
//
//    }
}
