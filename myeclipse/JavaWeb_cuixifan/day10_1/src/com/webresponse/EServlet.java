package com.webresponse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EServlet extends HttpServlet {

	/**
	 * 禁用浏览器缓存
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {  //三种禁用浏览器缓存适用任何版本
		response.setHeader("pragma", "no-cache");
		response.setHeader("cache-control","no-cache");
		response.setDateHeader("expires",-1);
		
		response.getWriter().print("hello hello");
	}

}
