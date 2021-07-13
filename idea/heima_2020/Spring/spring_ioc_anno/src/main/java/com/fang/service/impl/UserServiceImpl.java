package com.fang.service.impl;

import com.fang.dao.UserDao;
import com.fang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void save() {
        userDao.save();
    }
}
