package com.qilinxx.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot06DataJdbcApplicationTests {
    @Autowired
    private DataSource dataSource;

    @Test
    public void contextLoads() throws SQLException {
        //class org.apache.tomcat.jdbc.pool.DataSource
        //class com.alibaba.druid.pool.DruidDataSource
        System.out.println(dataSource.getClass());
        //ProxyConnection[PooledConnection[com.mysql.jdbc.JDBC4Connection@30e6a763]]
        //com.mysql.jdbc.JDBC4Connection@74971ed9
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

}
