package com.qilinxx.xmlhttprequest;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/xml;charset=utf-8");
		String xml="<students>"+
						"<student>"+
							"<number>itcase_1001</number>"+
							"<name>张三</name>"+
							"<age>18</age>"+
							"<sex>male</sex>"+
						"</student>"+
					"</students>";
		response.getWriter().print(xml);
		
	}

}
