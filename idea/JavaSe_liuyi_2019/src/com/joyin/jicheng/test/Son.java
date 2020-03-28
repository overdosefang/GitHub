package com.joyin.jicheng.test;

import com.joyin.jicheng.Father;
import com.joyin.jicheng.Jump2;

public  class Son extends Father implements Jump2 {
    int  age =20;

    public Son (){
        super();
        super.getInterface();
    }

    @Override
    public void jumping() {
        System.out.println("儿子会跳");
    }

    //    public void show (){
//        System.out.println("儿子的show方法");
//    }
}
