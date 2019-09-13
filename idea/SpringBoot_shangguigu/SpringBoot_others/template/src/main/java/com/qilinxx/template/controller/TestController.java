package com.qilinxx.template.controller;

import com.qilinxx.template.configure.WebConst;
import com.qilinxx.template.domain.model.User;
import com.qilinxx.template.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class TestController {
    @Autowired
    private UserService userService;
    @GetMapping("index")
    public String normal(Model model, HttpSession session){
        String text= (String) session.getAttribute(WebConst.SESSION_IDENTIFY_CODE);
        User user = userService.selectUserByid("123456");
        model.addAttribute("user",user);
        model.addAttribute("msg","你好明天");
        model.addAttribute("text",text);
        return "index";
    }
}
