package com.webservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BServlet extends HttpServlet {

	/**
	 * 
	 *
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {	  //ServletContext¶ÁÈ¡Êý¾Ý
		ServletContext application=getServletContext();
		String s=(String) application.getAttribute("name");    
		System.out.println(s);
	}

}
