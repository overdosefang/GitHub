package com.qilinxx.amqp;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 自动配置
 * AmqpAdmin : rabbitmq系统管理功能组件（创建删除 Queue、Exchange、Binding）
 *
 * @EnableRabbit + @RabbitListener 监听消息队列的内容
 */
@EnableRabbit   //开启基于注解的rabbitMQ模式
@SpringBootApplication
public class Springboot02AmqpApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot02AmqpApplication.class, args);
    }

}

