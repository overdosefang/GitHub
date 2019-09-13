package com.qilinxx.listener;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class User  implements HttpSessionBindingListener{
	//感知监听  （不需要再xml中注册）
	
	
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public void valueBound(HttpSessionBindingEvent arg0) {  //绑定时调用   （User添加到Session中） 
		System.out.println("session添加的了User的对象！");
		
	}
	@Override
	public void valueUnbound(HttpSessionBindingEvent arg0) { //解绑时调用 （User从Session中移除）
		System.out.println("session去除了User的对象！");
		
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
	
}
