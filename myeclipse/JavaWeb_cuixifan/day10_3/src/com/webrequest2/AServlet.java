package com.webrequest2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

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
		System.out.println(request.getParameter("xxx"));
		System.out.println(request.getParameter("yyy"));
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
/*		System.out.println(request.getParameter("username"));
		System.out.println(request.getParameter("password"));
		String[] hobby=request.getParameterValues("hobby");
		System.out.println(Arrays.toString(hobby));*/
		
/*		Enumeration e=request.getParameterNames();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());*/
		
		Map<String,String[]> map=request.getParameterMap();
		
/*	    Set<String> set=map.keySet();
		for (String name : set) {
			String[] values=map.get(name);
			System.out.println(Arrays.toString(values));
		}*/
	
		
		for (String name : map.keySet()) {
			System.out.println(name+":"+Arrays.toString(map.get(name)));
		}
		
		
	}
		
}


