package com.qilinxx.security.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //super.configure(http);
        //定制授权规则
        http.authorizeRequests().antMatchers("/").permitAll()
                .antMatchers("/level1/**").hasRole("VIP1")
                .antMatchers("/level2/**").hasRole("VIP2")
                .antMatchers("/level3/**").hasRole("VIP3");

        /**
         * 开启配置登录功能，默认访问/login页面，跳转自身的登录页面
         * 登录失败，默认重定向到/login?error
         * 默认形式的post形式，请求login
         * 一旦定制了loginPage，登录页面的post请求定制也得是loginPage，除非写上.loginProcessingUrl("/login")
         */
        http.formLogin().usernameParameter("user").passwordParameter("pwd").loginPage("/userlogin");

        /**
         * 开启自动注销功能
         * 默认访问logout表示用户注销，清空session
         * 注销成功后，默认跳转/login?logout
         */
        http.logout().logoutSuccessUrl("/");//注销成功后跳转首页

        /**
         * 开启记住我功能
         */
        http.rememberMe().rememberMeParameter("remember");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //super.configure(auth);
        //定制认证规则
        auth.inMemoryAuthentication().withUser("zhangsan").password("123456").roles("VIP1", "VIP2")
                .and()
                .withUser("lisi").password("123456").roles("VIP2", "VIP3")
                .and()
                .withUser("wangwu").password("123456").roles("VIP1", "VIP3");
    }
}
