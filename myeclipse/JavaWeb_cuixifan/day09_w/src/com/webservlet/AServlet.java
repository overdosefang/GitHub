package com.webservlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AServlet implements Servlet {

	@Override  //消亡之后
	public void destroy() {
		System.out.println("destroy");
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig");

		return null;
	}

	@Override
	public String getServletInfo() {
		System.out.println("getServletInfo");

		return null;
	}

	@Override   //出生之前
	public void init(ServletConfig servletConfig) throws ServletException {
		System.out.println("init");
		System.out.println(servletConfig.getServletName());   //能获取<servlet-name>中的配置名称
		
		System.out.println(servletConfig.getInitParameter("paramName1"));
		System.out.println(servletConfig.getInitParameter("paramName2"));//通过参数名称得到参数值
		
		int i=0;
		Enumeration<Enumeration> e=servletConfig.getInitParameterNames();
		                      
		while(e.hasMoreElements()){          
			System.out.println(e.nextElement());
			System.out.println(i);
			i++;
		}
		
	}

	@Override   //每次请求
	public void service(ServletRequest servletRequest, ServletResponse servletResponse)
			throws ServletException, IOException {
		System.out.println("service");

	}

}
