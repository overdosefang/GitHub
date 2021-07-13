package com.fang.proxy.aop;

import org.aspectj.lang.ProceedingJoinPoint;


public class MyAspect {

    public void before(){
        System.out.println("前置增强。。。。。");
    }

    public void afterReturning(){
        System.out.println("后置增强。。。。。");
    }

    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前。。。。。。");
        joinPoint.proceed();
        System.out.println("环绕后。。。。。。");
    }

    public void afterThrow(){
        System.out.println("异常发生后......");
    }

    public void after(){
        System.out.println("最终增强。。。。。");
    }
}
