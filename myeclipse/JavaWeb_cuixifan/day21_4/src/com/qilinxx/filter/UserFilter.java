package com.qilinxx.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


public class UserFilter implements Filter {



	public void destroy() {
		
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
			throws IOException, ServletException {//过滤器  不是管理员或会员，都打回登录页面
		
		
		HttpServletRequest req=(HttpServletRequest) request;
		HttpSession session=req.getSession();
		
		if(session.getAttribute("admin")!=null || session.getAttribute("user")!=null){

			chain.doFilter(request, response);
		}else{

			session.setAttribute("msg", "你是游客，不是会员或管理员，无权访问会员空间！");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
		
	}


	public void init(FilterConfig fConfig) throws ServletException {

	}

}
