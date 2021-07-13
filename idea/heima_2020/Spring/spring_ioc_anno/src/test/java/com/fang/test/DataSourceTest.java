package com.fang.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.fang.config.SpringConfiguration;
import com.fang.service.UserService;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.util.ResourceBundle;

public class DataSourceTest {

    @Test
    //测试手动创建c3p0数据源
    public void test1() throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://192.168.42.175:3306/test");
        dataSource.setUser("root");
        dataSource.setPassword("123456");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }


    @Test
    //测试手动创建druid数据源
    public void test2() throws Exception {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://192.168.42.175:3306/test");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    @Test
    //测试手动创建druid数据源(使用jdbc配置文件)
    public void teste3() throws Exception {
        ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
        String drive = bundle.getString("jdbc.driver");
        String url = bundle.getString("jdbc.url");
        String username = bundle.getString("jdbc.username");
        String password = bundle.getString("jdbc.password");

        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(drive);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    @Test
    //测试手动创建c3p0数据源(spring容器生成数据源)
    public void test4() throws Exception {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        ComboPooledDataSource dataSource = app.getBean(ComboPooledDataSource.class);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    @Test
    public void test5(){
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserService userService = app.getBean(UserService.class);
        userService.save();
        ComboPooledDataSource dataSources = app.getBean(ComboPooledDataSource.class);
        System.out.println(dataSources);
    }

}
