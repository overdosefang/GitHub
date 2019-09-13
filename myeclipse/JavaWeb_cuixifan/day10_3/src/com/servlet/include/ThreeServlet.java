package com.servlet.include;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThreeServlet extends HttpServlet {

	/**
	 * 
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("ThreeServlet...");
		
		response.setHeader("bbb", "BBB");
		
		response.getWriter().print("hello");
		
		request.getRequestDispatcher("/FourServlet").include(request, response);
		
	}

}
