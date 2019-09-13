package com.qilinxx.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class Demo2 {
@Test
public void test2() throws ClassNotFoundException, SQLException{
	//四大参数
	String driverClassName="com.mysql.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/fang";
	String username="root";
	String password="123";
	//加载类  与建立连接
	Class.forName(driverClassName);

	Connection con=DriverManager.getConnection(url, username, password);
	
	Statement stmt=con.createStatement();  //发送sql语句
	
	String sql="INSERT INTO stu VALUES('itcase_0005','yasuo',23,'male')";
	
	int r=stmt.executeUpdate(sql);//执行增、删、改           返回改变的行数
	
	System.out.println(r);
	
	
}
}
