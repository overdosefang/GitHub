package com.webresponse;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

public class FServlet extends HttpServlet {

	/**
	 * 
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ServletOutputStream，用来向客户端发送字节数据。ServletOutputStream out = resopnse.getOutputStream();
		
		//  PrintWriter，用来向客户端发送字符数据！需要设置编码。PrintWriter writer = response.getWriter();
		
/*		String s="hello";
		byte[] b=s.getBytes();
		
		response.getOutputStream().write(b);*///字节流
		
		//response.getWriter().print(s);      //字符流
		
				                              //不能同时使用
		
		FileInputStream f=new FileInputStream("E:/a.jpg");  //图片打印到网页上
		
		byte[] b=IOUtils.toByteArray(f);      //将输入流读取到字节数组中
		
		/*ServletOutputStream sos=response.getOutputStream();
		sos.write(b);*/
		response.getOutputStream().write(b);
		
	}

}
