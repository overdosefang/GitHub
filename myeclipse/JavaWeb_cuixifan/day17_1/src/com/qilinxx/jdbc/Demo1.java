package com.qilinxx.jdbc;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;



public class Demo1 {
	@Test
	public void test1() throws ClassNotFoundException, SQLException{
		
		Class.forName("com.mysql.jdbc.Driver");//加载驱动类
		
		Connection con= DriverManager.getConnection(  //建立连接，得到连接对象
				"jdbc:mysql://localhost:3306/fang", "root", "123");
		
		System.out.println(con);
	}

}
