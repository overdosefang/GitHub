package com.qilinxx.shiro.controller;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @GetMapping("/index")
    public String hello(){ return "index"; }
    @GetMapping("/add")
    public String add(){
        return "user/add";
    }
    @GetMapping("/update")
    public String update (){
        return "user/update";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/login")
    public String login(String username, String password,boolean rememberMe, Model model){

        // 使用Shiro编写认证操作
        //1、获取subject
        Subject subject= SecurityUtils.getSubject();
        //2、封装用户数据
        UsernamePasswordToken token=new UsernamePasswordToken(username,password,rememberMe);
        //3、执行登录方法
        try {
            subject.login(token);
            return "index";
        }catch (UnknownAccountException e){
            //账号不存在
            model.addAttribute("msg","账号不存在!");
            return "login";
        } catch (IncorrectCredentialsException e){
            //密码错误
            model.addAttribute("msg","密码错误!");
            return "login";
        } catch (AuthenticationException e) {
            model.addAttribute("msg","未知错误!");
            return "login";
        }
    }
    @GetMapping("/noAuth")
    public String unAuth(){
        return "noAuth";
    }
}
