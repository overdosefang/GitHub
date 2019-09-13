<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'regist.jsp' starting page</title>
    
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
  String message="";
  	String msg=(String)request.getAttribute("msg");
  	if(msg!=null){
  		message=msg;
  	}
  	String contextPath=request.getContextPath();
  %>
<form action="<%=contextPath %>/RegistServlet" method="post">

<table align="center">
<caption><font size="6"><b>注册</b></font></caption> 								<%--  回显--%>
<tr><td align="right">用户名: </td> <td colspan="3"><input type="text" name="username" value="${user.username}"></td><td><font color="red">${errors.username}</font></td></tr>   
<tr><td align="right">密 码: </td>  <td colspan="3"><input type="password" name="password" value="${user.password}"/></td><td><font color="red">${errors.password}</font></td></tr>
<tr><td align="right">验证码:</td>  <td><input type="text" name="verifyCode" value="${user.verifyCode }" size="3" /></td>  
		<td colspan="2"><img id="imgid" src="<%=contextPath %>/VerifyCodeServlet" border="1" /><a href="javascript:change()">看不清，换一张</a></td><td><font color="red">${errors.verifyCode}</font></td>  </tr>
<tr><td align="center" colspan="3"><input type="submit" value="注册" ></td><td align="center"><a href="<%=contextPath %>/user/login.jsp">去登陆</a></td></tr>
<tr><td align="center" colspan="4"><font color="red"><%=message %></font></td></tr>
</table>
</form>
  </body>
  <script type="text/javascript">
  	 function change(){
  		 var img=document.getElementById("imgid");
  		 img.src="/day14_1/VerifyCodeServlet?a="+new Date().getTime();
  	 }
  </script>
</html>
