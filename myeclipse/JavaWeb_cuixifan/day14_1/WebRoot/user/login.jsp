<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <%
  String contextPath=request.getContextPath();
  String message="";
	String msg=(String)request.getAttribute("msg");
	if(msg!=null){
		message=msg;
	}
  
  %>
<form action="<%=contextPath %>/LoginServlet" method="post">

<table align="center">
<caption><font size="6"><b>登录</b></font></caption> 								<%--  回显--%>
<tr><td align="right">用户名: </td> <td colspan="3"><input type="text" name="username" value="${user.username}"></td><td><font color="red">${errors.username}</font></td></tr>   
<tr><td align="right">密 码: </td>  <td colspan="3"><input type="password" name="password" value="${user.password}"/></td><td><font color="red">${errors.password}</font></td></tr>
<tr><td align="right" colspan="3"><input type="submit" value="登录" ></td><td align="right"><a href="<%=contextPath %>/user/regist.jsp">去注册</a></td></tr>
<tr><td align="center" colspan="4"><font color="red"><%=message %></font></td></tr>
</table>
</form>
  </body>
</html>
