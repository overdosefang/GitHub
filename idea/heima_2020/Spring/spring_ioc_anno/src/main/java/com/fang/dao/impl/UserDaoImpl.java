package com.fang.dao.impl;


import com.fang.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    public void init() {
        System.out.println("UserDaoImpl初始化。。。");
    }

    public void save() {
        System.out.println("保存数据。。。");
    }
}
