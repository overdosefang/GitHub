package com.webservlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

public class AServlet extends HttpServlet {

	/**
	 * （在java工作环境里）相等于把src文件夹改名classes放入了WEB-INF目录下，并且保存的是.class文件！
	 * 
	 * （在web服务器中）相当于把myeclipse的WebRoot文件夹更名为项目名，并保存。
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {      //src相当于classes
		
/*		ClassLoader cl=getClass().getClassLoader();	
		InputStream input=cl.getResourceAsStream("com/webservlet/b.txt");*/   //基于classes目录下
		
		Class c=getClass();                                  //Clases有两种形式
		//InputStream input=c.getResourceAsStream("b.txt");  	        		  //基于.class文件身边
		
	/*	InputStream input=c.getResourceAsStream("/a.txt");	*/				 //基于classes目录下
		InputStream input=c.getResourceAsStream("/../../index.jsp");
		String s =IOUtils.toString(input);
		System.out.println(s);
	}

}
