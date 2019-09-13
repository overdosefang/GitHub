package com.qilinxx.template3.domain.mapper;

import com.qilinxx.template3.domain.model.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
@Repository
public interface UserMapper extends Mapper<User> {
    User getUserByName(String username);
}