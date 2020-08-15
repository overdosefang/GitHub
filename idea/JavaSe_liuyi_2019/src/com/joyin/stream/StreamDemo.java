package com.joyin.stream;

import java.util.ArrayList;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("张曼丽");
        list.add("张玉霞");
        list.add("张曼");
        list.add("张丽");
        list.add("如曼丽");
        list.add("姜曼丽");
        list.add("曼丽");
        list.add("丽");
        list.add("曼");
        list.add("张三");
        list.add("李四");

        ArrayList<String> threeList = new ArrayList<>();
        for (String s : list) {
            if (s.length() == 3) {
                threeList.add(s);
            }
        }

        for (String threeStr : threeList) {
            System.out.println(threeStr);
        }
        System.out.println("-----------------");

        list.stream().filter(s -> s.length() == 3).filter(s -> s.startsWith("张")).forEach(s -> System.out.println(s));


    }
}
