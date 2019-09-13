package com.qilinxx.template;

import com.qilinxx.template.domain.model.User;
import com.qilinxx.template.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TemplateApplicationTests {
    @Autowired
    private UserService userService;
    @Test
    public void service() {
        User user = userService.selectUserByid("123456");
        System.out.println(user);
    }

}
