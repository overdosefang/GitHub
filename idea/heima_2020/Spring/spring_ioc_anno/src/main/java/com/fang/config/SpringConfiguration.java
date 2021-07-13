package com.fang.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//此注解标志Spring的核心配置类
@Configuration
@ComponentScan("com.fang")
@Import({DataSourceConfiguration.class})
public class SpringConfiguration {


}
