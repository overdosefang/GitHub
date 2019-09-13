package com.qilinxx.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {   //粗粒度权限管理

												//负责保存会员和管理员的用户名
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		HttpSession session=request.getSession();
		
		String username=request.getParameter("username");
		if(username.contains("itcase")){           //
			session.setAttribute("admin", username);
		}else{
System.out.println(username);
			session.setAttribute("user", username);
		}
		
		response.sendRedirect("/day21_4/index.jsp");
		
	}

}
