package cn.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String verifyCode=request.getParameter("verifyCode");  //验证码是否正确
		String session_vcode=(String) request.getSession().getAttribute("session_vcode");
		System.out.println(verifyCode);
		System.out.println(session_vcode);
		if(!verifyCode.equalsIgnoreCase(session_vcode)){
			request.setAttribute("msg", "输入验证码错误");
			request.getRequestDispatcher("/session2/login.jsp").forward(request, response);
			return;
		}
		
		String username=request.getParameter("username");//得到用户名
		
		if(username.equalsIgnoreCase("itcase")){//判断用户名
			request.setAttribute("msg", "你输入的用户名或密码错误！");
			
			request.getRequestDispatcher("/session2/login.jsp").forward(request, response);
		}else{
			HttpSession hs=request.getSession();
			hs.setAttribute("username",username);
			
			response.sendRedirect("/day11_2/session2/succ1.jsp");
			
		}
	}

}
