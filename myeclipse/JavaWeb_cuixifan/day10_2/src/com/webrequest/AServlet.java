package com.webrequest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AServlet extends HttpServlet {

	/**
	 * 
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String addr=request.getRemoteAddr();//得到ip地址
		//System.out.println(addr);
		
		//System.out.println("请求方式："+request.getMethod());
		
		String userAgent=request.getHeader("User-Agent"); //得到浏览器信息
		//System.out.println(userAgent);
		
		if(userAgent.toLowerCase().contains("firefox")){
			System.out.println("这是火狐浏览器访问的");
		}else if(userAgent.toLowerCase().contains("2345explorer")){
			System.out.println("这是2345浏览器访问的");
		}else if(userAgent.toLowerCase().contains("chrome")){
			System.out.println("这是谷歌浏览器访问的");
		}
	}

}
