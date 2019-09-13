package com.qilinxx.template3.service.serviceImpl;

import com.qilinxx.template3.domain.mapper.UserMapper;
import com.qilinxx.template3.domain.model.User;
import com.qilinxx.template3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserByName(String username) {
        return userMapper.getUserByName(username);
    }
}
