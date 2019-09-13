package com.webservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
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
		ServletContext app=getServletContext();
		Integer count=(Integer) app.getAttribute("count");
		
		if(count==null){
			app.setAttribute("count", 1);
		}else{
			app.setAttribute("count", count+1);     //请注意count++与++count的区别
		}
		
		Integer counts=(Integer) app.getAttribute("count");
		PrintWriter pw=response.getWriter();
		pw.print("<h1>"+counts+"</h1>");
	}

}
