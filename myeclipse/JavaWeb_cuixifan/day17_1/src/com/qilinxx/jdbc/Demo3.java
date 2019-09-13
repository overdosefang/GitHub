package com.qilinxx.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class Demo3 {
@Test
public void test3() throws ClassNotFoundException, SQLException{
	String driverClassName="com.mysql.jdbc.Driver";
	String url="jdbc:mysql://localhost/exam";
	String username="root";
	String password="123";
	
	Class.forName(driverClassName); //找到类驱动
	Connection con=DriverManager.getConnection(url, username, password);//建立连接
	
	Statement stmt=con.createStatement();//提供语句发送器
	
	String sql="select * from emp";//查询语句
	
	ResultSet rs=stmt.executeQuery(sql);//返回列表
	
	System.out.println("empno|ename|sal");
	//解析ResultSet!
	while(rs.next()){
		int empno=rs.getInt(1);
		String ename=rs.getString("ename");
		Double sal=rs.getDouble("sal");
		
		System.out.println(empno+"|"+ename+"|"+sal);
		
	}
	
	
	rs.close();
	stmt.close();
	con.close();
		
}

@Test
public void test3_1(){//jdbc代码规范化
	
	String driverClassName="com.mysql.jdbc.Driver";
	String  url="jdbc:mysql://localhost/exam";
	String username="root";
	String password="123";
	
	Connection con=null;  //定义对象
	Statement stmt=null;
	ResultSet rs=null;
	
	try {
		 Class.forName(driverClassName);
		 con=DriverManager.getConnection(url, username, password);//实例化
	 
		  stmt=con.createStatement();
		  
		  String sql="select * from emp";
	
		  rs=stmt.executeQuery(sql);
		  
		  rs.last();//
		  System.out.println(rs.getRow());//
		  rs.beforeFirst();//
		  
		  int count=rs.getMetaData().getColumnCount();
		  System.out.println(count);
		  while(rs.next()){
			 for(int i=0;i<count;i++){
				 System.out.print(rs.getString(i+1));
				 if(i<count-1){
					 System.out.print(", ");
				 }
			 }
			 System.out.println();
		  }	
		
	} catch (Exception e) {
		throw  new RuntimeException();
	}finally{
			try {
				if(rs!=null) 	rs.close();
				if(stmt!=null)	stmt.close();
				if(con!=null)   con.close();
			} catch (Exception e) {
				throw new RuntimeException();
			}
		
		
		
	}
		
}

}
