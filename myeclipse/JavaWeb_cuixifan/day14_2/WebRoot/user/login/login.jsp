<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Login</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<meta name="keywords" content="Flat Dark Web Login Form Responsive Templates, Iphone Widget Template, Smartphone login forms,Login form, Widget Template, Responsive Templates, a Ipad 404 Templates, Flat Responsive Templates" />
<link href="/day14_1/user/login/css/style.css" rel='stylesheet' type='text/css' />
<!--webfonts-->
<link href='http://fonts.useso.com/css?family=PT+Sans:400,700,400italic,700italic|Oswald:400,300,700' rel='stylesheet' type='text/css'>
<link href='http://fonts.useso.com/css?family=Exo+2' rel='stylesheet' type='text/css'>
<!--//webfonts-->
<script src="http://ajax.useso.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
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
<%--<script type="text/javascript">
	function warning(){
		 if("<%=message%>"=="<%=msg%>")	alert("<%=message%>");
}
</script>

--%><script>
	$(document).ready(function(c) {
		$('.close').on('click', function(c){
			$('.login-form').fadeOut('slow', function(c){
		  		$('.login-form').remove();
			});
		});	  
});
</script>
 <!--SIGN UP-->
 <h1>登录页面</h1>
<div class="login-form">
	<div class="close"> </div>
		<div class="head-info">
			<label class="lbl-1"> </label>
			<label class="lbl-2"> </label>
			<label class="lbl-3"> </label>
		</div>
		<div class="clear"> </div>
		<div class="avtar">
			<img src="<%=contextPath %>/user/login/images/avtar.png" />
		</div>
			<form action="<%=contextPath %>/LoginServlet" method="post">
				<input type="text" name="username" class="text" value="${user.username}" >
				<div class="key">
					<input type="password" name="password" value="${user.password}">
				</div>
		<div class="signin">
			<input type="submit" value="登录" >
		</div>
			</form>
</div>
<div class="errors1">
	<p><font size="4"><%=message %></font></p>
</div>

 <div class="errors2">
 	<p><font size="4" >${errors.username}</font></p>
 	<br/><br/>
 	<p><font size="4" >${errors.password}</font></p>
			</div>--%>
 <div class="copy-rights">
  <p> <a   href="<%=contextPath %>/user/regist/regist.jsp"><font size="6">去注册</font></a></p>
			</div>

</body>

</html>