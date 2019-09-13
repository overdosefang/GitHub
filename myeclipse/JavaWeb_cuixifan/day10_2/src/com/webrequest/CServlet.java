package com.webrequest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CServlet extends HttpServlet {

	/**
	 * 
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String referer=request.getHeader("Referer");
		System.out.println(referer);
		
		if(referer==null || !(referer.contains("localhost")||referer.contains("127.0.0.1"))){
			response.sendRedirect("http://www.baidu.com");	
		}else System.out.println("您是从本机的a.html来的");
	}

}
