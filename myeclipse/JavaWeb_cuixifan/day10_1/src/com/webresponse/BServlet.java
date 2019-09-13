package com.webresponse;

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
			throws ServletException, IOException {  //重定向到CServlet
		System.out.println("BServlet");
		
/*		response.setHeader("Location", "/day10_1/CServlet");
		response.setStatus(302);*/
		
		response.sendRedirect("/day10_1/CServlet");  //快速重定向
	}

}
