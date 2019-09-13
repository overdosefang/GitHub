package com.webresponse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DServlet extends HttpServlet {

	/**
	 *
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("DServlet");
		
		//字符流
		PrintWriter writer=response.getWriter();
		writer.print("<h1>5秒后跳转页面</h1>");
		
		response.setHeader("refresh", "5;url=/day10_1/CServlet");
		
		
	}

}
