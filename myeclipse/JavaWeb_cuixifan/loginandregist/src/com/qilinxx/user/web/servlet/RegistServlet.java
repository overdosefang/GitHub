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

public class RegistServlet extends HttpServlet {

	private HttpServletRequest request;
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		//依赖UserService
		UserService userService=new UserService();
		
		//封装表单数据到User对象中去!
		User form=CommonUtils.toBean(request.getParameterMap(), User.class);
		
		Map<String, String> errors=new HashMap<String, String>();//进行表单校验 如果有错误信息就存入errors里
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

		
		//验证码校验
		String session_vcode=(String) request.getSession().getAttribute("session_vcode");
		String verifyCode=form.getVerifyCode();
		if(verifyCode==null||verifyCode.trim().isEmpty()){
			errors.put("verifyCode", "验证码不能为空！");
		}else if(verifyCode.length()!=4){
			errors.put("verifyCode", "验证码长度必须为4！");
		}else if(!verifyCode.equalsIgnoreCase(session_vcode)){		
			errors.put("verifyCode", "输入验证码错误！");
		}
			
			
		if(errors!=null&&errors.size()>0){
			System.out.println(errors);
			request.setAttribute("errors", errors);//向页面返回错误信息
			request.setAttribute("user", form);//回显
			request.getRequestDispatcher("/user/regist.jsp").forward(request, response);
			return;
		}
		//判断验证码
/*		String session_vcode=(String) request.getSession().getAttribute("session_vcode"); 
		String verifyCode=form.getVerifyCode();
		
		if(!verifyCode.equalsIgnoreCase(session_vcode)){
			request.setAttribute("user", form);
			request.setAttribute("msg", "验证码错误！请重新输入");
			request.getRequestDispatcher("/user/regist.jsp").forward(request, response);
			return;
		}*/

		try {
			userService.regist(form);                                       //注册成功
			response.getWriter().print("<h1>注册成功！<h1><a href='"+
			                       request.getContextPath()+"/user/login.jsp'>点击登录</a>");
		} catch (UserException e) {                                         //注册失败
			request.setAttribute("msg", e.getMessage());
			request.setAttribute("user", form);   //回显
			
			request.getRequestDispatcher("/user/regist.jsp").forward(request, response);		
		}
		
	}

}
