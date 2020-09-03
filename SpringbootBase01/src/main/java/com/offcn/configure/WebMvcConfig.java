package com.offcn.configure;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * ClassName:    WebMvcConfig
 * Package:    com.offcn.configure
 * Description:
 * Datetime:    2020/9/2   18:23
 * Author:  shoushaopan
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //将E:\temp\的访问映射到/pic/**路径
        registry.addResourceHandler("/pic/**").addResourceLocations("file:E:\\temp\\");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

}