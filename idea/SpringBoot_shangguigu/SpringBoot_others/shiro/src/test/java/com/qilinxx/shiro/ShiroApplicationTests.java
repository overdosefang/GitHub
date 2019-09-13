package com.qilinxx.shiro;

import com.qilinxx.shiro.domain.model.User;
import com.qilinxx.shiro.service.UserService;
import com.qilinxx.shiro.utils.MD5Util;
import com.qilinxx.shiro.utils.MD5Utils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.DigestUtils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShiroApplicationTests {
    @Autowired
    UserService userService;
    @Test
    public void testService() {
        User user = userService.findByName("zhangsan");
        System.out.println(user);
    }
    @Test
    public void testMD5() throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        // java自带工具包MessageDigest
        String resultString = MD5Utils.stringToMD5("123456");
        System.out.println(resultString);
        // e10adc3949ba59abbe56e057f20f883e
        String resultString1 = MD5Utils.stringToMD5("1234");
        System.out.println(resultString1);
        //81dc9bdb52d04dc20036dbd8313ed055

        // spring自带工具包DigestUtils
        System.out.println(DigestUtils.md5DigestAsHex("1234".getBytes()));
        // 81dc9bdb52d04dc20036dbd8313ed055
    }
    @Test
    public void testMD5Salt(){
        // 原文
        String plaintext = "DingSai";
        //  plaintext = "123456";
        System.out.println("原始：" + plaintext);
        System.out.println("普通MD5后：" + MD5Util.MD5(plaintext));

        // 获取加盐后的MD5值
        String ciphertext = MD5Util.generate(plaintext);
        System.out.println("加盐后MD5：" + ciphertext);
        System.out.println("是否是同一字符串:" + MD5Util.verify(plaintext, ciphertext));
        /**
         * 其中某次DingSai字符串的MD5值
         */
        String[] tempSalt = { "54651bf9b504882449a7d657544b1ab0d211b63911947469", "38d556e68348389619702d11090d1ba78e58d77361f3ef45", "766d9d87cb6c83769420ee57419b5c89ef5b18906c04027d" };

        for (String temp : tempSalt) {
            System.out.println("是否是同一字符串:" + MD5Util.verify(plaintext, temp));
        }

    }

}

