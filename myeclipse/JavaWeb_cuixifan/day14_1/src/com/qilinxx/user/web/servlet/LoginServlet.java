package com.qilinxx.user.web.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itcast.commons.CommonUtils;

import com.qilinxx.user.domain.User;
import com.qilinxx.user.service.UserException;
import com.qilinxx.user.service.UserService;

public class LoginServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");//请求编码
		response.setContentType("text/html;charset=utf-8");//响应编码
		
		//依赖UserService
		UserService userService=new UserService();
		
		User form=CommonUtils.toBean(request.getParameterMap(), User.class);
		//进行表单校验
		Map<String, String> errors=new HashMap<String, String>();
		//用户名校验
		String username=form.getUsername();
		if(username==null||username.trim().isEmpty()){
			errors.put("username", "用户名不能为空！");
		}else if(username.length()<2||username.length()>15){
			errors.put("username", "用户名长度必须在2~15之间！");
		}
		//密码校验
		String password=form.getPassword();
		if(password==null||password.trim().isEmpty()){
			errors.put("password", "密码不能为空！");
		}else if(password.length()<3||password.length()>15){
			errors.put("password", "密码长度必须在3~15之间！");
		}
		
		if(errors!=null&&errors.size()>0){
			request.setAttribute("errors", errors);//向页面返回错误信息
			request.setAttribute("user", form);//回显
			request.getRequestDispatcher("/user/login.jsp").forward(request, response);
			return;
		}
		
		try {
			User user=userService.login(form);
			request.getSession().setAttribute("user", user);
			response.sendRedirect(request.getContextPath()+"/user/welcome.jsp");
		} catch (UserException e) {
			request.setAttribute("msg", e.getMessage());
			request.setAttribute("user",form);  //回显
			request.getRequestDispatcher("/user/login.jsp").forward(request, response);
		}
	}
	

}
