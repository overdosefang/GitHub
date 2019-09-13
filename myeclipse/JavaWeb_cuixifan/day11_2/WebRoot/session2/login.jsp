<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
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
  String message="";
  String uname="";
  	String msg=(String)request.getAttribute("msg");
  	if(msg!=null){
  		message=msg;
  	}
  	
  	Cookie[] cookies=request.getCookies();
  	if(cookies!=null){
   		for(Cookie c:cookies){
  			if(c.getName().equalsIgnoreCase("username")){
  				uname=c.getValue();
  			}
  		}
  	}
  %>

	<font color="red"><b><%=message %></b></font>
<form action="/day11_2/LoginServlet" method="post">

<table align="center">
<caption><font size="6"><b>登录</b></font></caption>
<tr><td align="right">用户名: </td> <td colspan="2"><input type="text" name="username" value=<%=uname %>></td></tr>

<tr><td align="right">密 码: </td>   <td colspan="2"><input type="password" name="password" /></td></tr>

<tr><td align="right">验证码: </td>   <td ><input type="text" name="verifyCode" size="3"/></td>
		<td><img id="vcode" src="/day11_2/VerifyCodeServlet"  onclick="this.src=this.src=this.src+'?a='+Math.random()" /><a href="javascript:change()">看不清,换一张</a></td></tr>
		
<tr><td></td><td><input type="submit" value="登录"/></td>  <td><input type="button" value="注册" ></td></tr>
</table>
</form>

  </body>
  <script type="text/javascript">
  		function change(){
  			var img=document.getElementById("vcode");
  			
  			img.src="/day11_2/VerifyCodeServlet?a="+new Date().getTime();
  		}
  		


  </script>
</html>
