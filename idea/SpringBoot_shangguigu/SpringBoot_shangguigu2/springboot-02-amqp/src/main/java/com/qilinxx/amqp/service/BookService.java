package com.qilinxx.amqp.service;

import com.qilinxx.amqp.bean.Book;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @RabbitListener(queues = "atguigu.news")
    public void receive(Book book) {
        System.out.println("以下是atguigu.news监听内容：");
        System.out.println("收到消息！" + book);
    }

    @RabbitListener(queues = "atguigu")
    public void receiver2(Message message) {
        System.out.println("以下是atguigu监听内容：");
        System.out.println(message);
        System.out.println(message.getBody());
        System.out.println(message.getMessageProperties());
    }
}
