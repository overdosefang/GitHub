package com.fys.jicheng.test;

import com.fys.jicheng.Father;
import com.fys.jicheng.Jump2;

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
