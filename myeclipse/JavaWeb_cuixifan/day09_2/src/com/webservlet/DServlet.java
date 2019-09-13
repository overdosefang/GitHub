package com.webservlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DServlet extends HttpServlet {

	/**
	 * 
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {        //在Servlet得到文件真实路径
		String path=getServletContext().getRealPath("/index.jsp");
		System.out.println(path);
		
		//获取资源路径后，再创建输入流的对象
		InputStream input=getServletContext().getResourceAsStream("/index.jsp");
		
		
		//获取当前目录下的所有资源路径
		Set<String > paths=getServletContext().getResourcePaths("/WEB-INF");
		System.out.println(paths);
	}

}
