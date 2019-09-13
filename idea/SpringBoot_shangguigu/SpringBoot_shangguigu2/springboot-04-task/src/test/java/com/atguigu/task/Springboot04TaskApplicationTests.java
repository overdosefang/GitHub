package com.atguigu.task;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot04TaskApplicationTests {
    @Autowired
    JavaMailSenderImpl mailSender;
    @Test
    public void contextLoads() {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setSubject("今晚开会");
        mailMessage.setText("今晚，7点，东门，开会222222");
        mailMessage.setTo("wy1114915144@163.com");
        mailMessage.setFrom("1114915144@qq.com");
        mailSender.send(mailMessage);
    }
    @Test
    public void test02() throws MessagingException {
        //创建复杂消息的邮件
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        //是否上传文件：true
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

        helper.setSubject("今晚开会");
        helper.setText("<b style='color:red'>今晚，7点，东门，123456</b>",true);
        helper.setTo("wy1114915144@163.com");
        helper.setFrom("1114915144@qq.com");

        helper.addAttachment("1.jpg",new File("E:\\1.jpg"));
        helper.addAttachment("2.jpg",new File("E:\\2.jpg"));
        mailSender.send(mimeMessage);
    }

}
