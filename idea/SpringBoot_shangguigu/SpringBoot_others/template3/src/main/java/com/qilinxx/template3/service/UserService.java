package com.qilinxx.template3.service;

import com.qilinxx.template3.domain.model.User;

public interface UserService {
    /**通过名字查询用户*/
    User getUserByName(String username);
}
