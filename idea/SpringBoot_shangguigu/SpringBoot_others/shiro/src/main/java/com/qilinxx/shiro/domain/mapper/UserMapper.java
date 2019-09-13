package com.qilinxx.shiro.domain.mapper;

import com.qilinxx.shiro.domain.model.User;

public interface UserMapper {
    User findByName(String name);

    User findById(Integer id);
}
