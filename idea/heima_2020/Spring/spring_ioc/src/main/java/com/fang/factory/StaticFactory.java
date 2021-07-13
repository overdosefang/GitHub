package com.fang.factory;

import com.fang.dao.UserDao;
import com.fang.dao.impl.UserDaoImpl;

public class StaticFactory {
    public static UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
