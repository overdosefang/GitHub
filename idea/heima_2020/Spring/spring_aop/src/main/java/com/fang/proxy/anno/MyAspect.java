package com.fang.proxy.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    public static final String point2="execution(* com.fang.proxy.anno..*.*(..))";

    @Pointcut("execution(* com.fang.proxy.anno..*.*(..))")
    public void point1(){}


    @Before("execution(* com.fang.proxy.anno..*.*(..))")
    public void before(){
        System.out.println("前置增强。。。。。");
    }

    @AfterReturning("point1()")
    public void afterReturning(){
        System.out.println("后置增强。。。。。");
    }

    @Around(point2)
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前。。。。。。");
        joinPoint.proceed();
        System.out.println("环绕后。。。。。。");
    }

    public void afterThrow(){
        System.out.println("异常发生后......");
    }

    @After("MyAspect.point1()")
    public void after(){
        System.out.println("最终增强。。。。。");
    }
}
