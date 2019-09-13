package cn.jsprequest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AServlet extends HttpServlet {


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String num1=request.getParameter("num1");
		String num2=request.getParameter("num2");
		
		int n1=Integer.parseInt(num1);
		int n2=Integer.parseInt(num2);
		int sum=n1+n2;
		
		String s=String.valueOf(sum);
		
		request.setAttribute("sum", s);
		
		request.getRequestDispatcher("/sum/result.jsp").forward(request, response);
		
	}

}
