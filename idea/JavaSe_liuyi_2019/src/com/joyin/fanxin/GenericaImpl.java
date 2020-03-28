package com.joyin.fanxin;

public class GenericaImpl<T> implements Generica<T> {

    @Override
    public void show(T t) {
        System.out.println(t);
    }

}
