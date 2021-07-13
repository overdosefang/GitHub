package com.fang.dao.impl;

import com.fang.dao.UserDao;

public class UserDaoImpl implements UserDao {

    public UserDaoImpl() {
        System.out.println("UserDaoImpl初始化。。。");
    }

    public void save() {
        System.out.println("保存数据。。。");
    }
}
