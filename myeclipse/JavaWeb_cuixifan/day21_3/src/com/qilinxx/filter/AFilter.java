package com.qilinxx.filter;

import java.io.IOException;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class AFilter
 */
public class AFilter implements Filter {
	private FilterConfig fConfig;
	
	public void destroy() {
		
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String ip=request.getRemoteAddr();
		
		ServletContext application=fConfig.getServletContext();
		Map<String, Integer> map=(Map<String, Integer>) application.getAttribute("map");	
		if(map.containsKey(ip)){
			map.put(ip,map.get(ip)+1);
		
		}else{
			map.put(ip,1);

		}		

		chain.doFilter(request, response);   //必须放行
	}

	public void init(FilterConfig fConfig) throws ServletException {
		this.fConfig=fConfig;
	}

}
