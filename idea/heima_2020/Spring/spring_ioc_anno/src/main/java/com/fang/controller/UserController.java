package com.fang.controller;

import com.fang.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = app.getBean(UserService.class);
        userService.save();

    }
}
