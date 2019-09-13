package com.qilinxx.user.service;

import com.qilinxx.user.dao.UserDao;
import com.qilinxx.user.domain.User;

public class UserService {//业务类
	//依赖数据类
	private UserDao userDao=new UserDao();
	 
	public void regist(User user) throws UserException {//注册方法
		User _user= userDao.findByUsername(user.getUsername());
		if(_user!=null)   throw  new UserException("该用户名为：“"+user.getUsername()+"”已被注册");//异常后面写上异常信息
		
		userDao.addUser(user);
	}
	
	public User login(User form) throws UserException{
		User user=userDao.findByUsername(form.getUsername());
		
		if(user==null){
			throw new UserException("用户不存在！");
		}
		
		if(!user.getPassword().equals(form.getPassword())){
			throw new UserException("密码错误！");
		}
		return user;
	}
	
	
}
