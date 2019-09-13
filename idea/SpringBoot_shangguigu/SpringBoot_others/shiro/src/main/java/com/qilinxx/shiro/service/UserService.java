package com.qilinxx.shiro.service;

import com.qilinxx.shiro.domain.model.User;

public interface UserService {
    User findByName(String name);

    User findById(Integer id);
}
