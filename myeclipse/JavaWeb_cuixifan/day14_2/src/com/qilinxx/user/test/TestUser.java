package com.qilinxx.user.test;

import org.junit.Test;

import com.qilinxx.user.dao.UserDao;
import com.qilinxx.user.domain.User;

public class TestUser {
@Test
public void addTest(){
	UserDao userDao=new UserDao();
	User user=new User();
	user.setUsername("男刀");
	user.setPassword("456");

	userDao.addUser(user);
}
@Test
public void findTest(){
	UserDao userDao	=new UserDao();
	User user=userDao.findByUsername("男刀");
	System.out.println(user);
}

}
