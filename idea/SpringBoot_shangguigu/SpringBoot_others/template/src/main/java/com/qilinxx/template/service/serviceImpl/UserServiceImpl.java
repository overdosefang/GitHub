package com.qilinxx.template.service.serviceImpl;

import com.qilinxx.template.domain.mapper.UserMapper;
import com.qilinxx.template.domain.model.User;
import com.qilinxx.template.domain.model.UserExample;
import com.qilinxx.template.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User selectUserByid(String id) {
        UserExample userExample=new UserExample();
        userExample.createCriteria().andIdEqualTo("123456");
        return userMapper.selectByExample(userExample).get(0);
    }
}
