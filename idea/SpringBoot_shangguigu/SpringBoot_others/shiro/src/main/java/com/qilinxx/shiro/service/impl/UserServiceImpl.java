package com.qilinxx.shiro.service.impl;

import com.qilinxx.shiro.domain.mapper.UserMapper;
import com.qilinxx.shiro.domain.model.User;
import com.qilinxx.shiro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User findByName(String name) {
        return userMapper.findByName(name);
    }

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }
}
