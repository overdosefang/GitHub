package com.qilinxx.template.service;

import com.qilinxx.template.domain.model.User;

public interface UserService {
    User selectUserByid(String id);
}
