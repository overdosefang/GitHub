package com.webrequest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BServlet extends HttpServlet {

	/**
	 * 
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8"); 
		
		
		response.getWriter().print(request.getScheme()+"<br/>");     //获取协议名
		response.getWriter().print(request.getServerName()+"<br/>"); //获取服务器名
		response.getWriter().print(request.getServerPort()+"<br/>"); //获取服务器端口
		response.getWriter().print(request.getContextPath()+"<br/>");//获取项目名   （最常用）
		response.getWriter().print(request.getServletPath()+"<br/>");//获取Servlet路径
		response.getWriter().print(request.getQueryString()+"<br/>");//获取参数
		response.getWriter().print(request.getRequestURI()+"<br/>"); //项目名+端口名
		response.getWriter().print(request.getRequestURL()+"<br/>"); //不包含参数的请求路径
	}

}
