package com.fys.fanxin;

public class Demo {
    public static void main(String[] args) {
        Generic<String> st = new Generic<>();
        st.setT("你好啊");
        System.out.println(st.getT());

        GenericaImpl<String> generica = new GenericaImpl<String>();
        generica.show("s1");

    }
}
