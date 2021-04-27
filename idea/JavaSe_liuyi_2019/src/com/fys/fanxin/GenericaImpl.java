package com.fys.fanxin;

public class GenericaImpl<T> implements Generica<T> {

    @Override
    public void show(T t) {
        System.out.println(t);
    }

}
