package com.fang.test.aop;

import com.fang.proxy.aop.TargetInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class aopTest {

    @Autowired
    private TargetInterface targetInterface;

    @Test
    public void test1(){
        targetInterface.save();
    }

}