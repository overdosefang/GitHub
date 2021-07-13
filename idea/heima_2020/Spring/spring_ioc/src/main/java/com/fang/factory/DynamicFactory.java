package com.fang.factory;

import com.fang.dao.UserDao;
import com.fang.dao.impl.UserDaoImpl;

public class DynamicFactory {
    public  UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
