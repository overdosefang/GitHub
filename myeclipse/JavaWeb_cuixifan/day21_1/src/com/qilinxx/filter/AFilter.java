package com.qilinxx.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AFilter implements Filter {

	@Override
	public void destroy() {


	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
			System.out.println("AFilter~~~~~~~~~start");
			chain.doFilter(request, response);
			System.out.println("AFilter~~~~~~~~~end");
			
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {


	}

}
