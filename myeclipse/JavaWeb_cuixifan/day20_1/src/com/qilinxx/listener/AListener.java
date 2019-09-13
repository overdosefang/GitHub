package com.qilinxx.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class AListener implements ServletContextListener {
	//HttpSessionListener 与 ServletRequestListener 与它同理
	
	//两种生命周期监听的方法      （需要在xml中注册）
	@Override
	public void contextInitialized(ServletContextEvent sce) {//application对象生成
		
		ServletContext application=sce.getServletContext();//事件源得到ServletContext的对象application
		
		System.out.println("application对象生成!");
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {//application对象消亡
			System.out.println("application对象消亡!");
	}


}
