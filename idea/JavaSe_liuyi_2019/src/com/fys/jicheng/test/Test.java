package com.fys.jicheng.test;

import com.fys.jicheng.Grandpa;
import com.fys.jicheng.Jump2;

public class Test {
    public static void main(String[] args) {
        int height =30;

//        Son son = new Son();
//        System.out.println("age:"+son.age);
//        son.show();
//        son.message();
//        son.jumping();
//
//        Father f1 = new Son();

        Grandpa pa = new Son();
        System.out.println(pa.age);
        System.out.println(pa.name);
        pa.show();
        pa.message();


        Jump2 j = new Son();
        j.jumping();




//        new Jump2() {
//            @Override
//            public void jumping() {
//                System.out.println("自己实现调高"+height);
//            }
//        }.jumping();
    }
}
