package com.qilinxx.springboot.config;

import com.qilinxx.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//指明当前是一个配置类（用来取代之前spring的配置文件   **.xml）
public class MyAppConfig {
    /**
     * <bean id="" class=""></bean>
     * 将方法的返回值注入容器，容器中这个组件的默认id就是方法名
     */
    @Bean
    public HelloService helloService() {
        System.out.println("将此类装入容器中");
        return new HelloService();
    }
}
