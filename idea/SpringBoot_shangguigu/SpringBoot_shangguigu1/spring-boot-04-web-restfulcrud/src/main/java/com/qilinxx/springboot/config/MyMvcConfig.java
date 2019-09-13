package com.qilinxx.springboot.config;

import com.qilinxx.springboot.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    private String[] addPathPatterns = {"/**"};
    private String[] excludePathPatterns = {"/login.html", "/", "/login", "/user/login", "/hello",
            "/**/*.css", "/**/*.js", "/**/img/**"};
    //图片必须在img文件下

    @Override       //添加视图控制器   将url转到相应的视图
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("success");
        registry.addViewController("/main").setViewName("dashboard");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns(addPathPatterns).excludePathPatterns(excludePathPatterns);
    }
}
