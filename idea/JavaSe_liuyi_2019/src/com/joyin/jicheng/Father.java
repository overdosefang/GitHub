package com.joyin.jicheng;

public class Father extends Grandpa {
    public int age =40;

//    private Father(){
//    }


    public Father getInterface(){
        return new Father();
    }

    public void show(){
        System.out.println("父亲的方法show");
    }
}
