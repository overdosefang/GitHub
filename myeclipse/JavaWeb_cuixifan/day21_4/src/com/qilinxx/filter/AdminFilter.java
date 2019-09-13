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


public class AdminFilter implements Filter {


	public void destroy() {
		
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
			throws IOException, ServletException {//过滤器，不是管理员不允许访问，打回登录页面
		
		
		HttpServletRequest req=(HttpServletRequest) request;
		
		HttpSession session=req.getSession();
		
		if(session.getAttribute("admin")!=null){
			chain.doFilter(request, response);
		}else{
			session.setAttribute("msg", "你可能是游客或会员，无权访问管理员空间！");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
		
		
		
	}


	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
