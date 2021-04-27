package com.fys.collection;

import java.util.ArrayList;

public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList<String> c = new ArrayList<>();

        c.add("hello");
        c.add("world");
        c.add("javase");
        c.add("hello");

//        c.remove("hello");

//        Iterator<String> it = c.iterator();
////        while (it.hasNext()) {
////            String s = it.next();
////            System.out.println(s);
////        }

        for (int i = 0; i < c.size(); i++) {
            System.out.println(c.get(i));
            if (c.get(i).equals("world")) {
                c.add("javaee");
            }
        }
        System.out.println(c);

//        Collection<Student> c = new ArrayList<>();
//
//        Student s1 = new Student("张三", 20);
//        Student s2 = new Student("李四", 30);
//        Student s3 = new Student("王五", 40);
//        Student s4 = new Student("李四", 30);
//
//        c.add(s1);
//        c.add(s2);
//        c.add(s3);
//
//        System.out.println(c.contains(s2));
//        System.out.println(c.contains(s4));
//
//        Iterator<Student> it = c.iterator();
//        while(it.hasNext()){
//            Student s = it.next();
//            System.out.println(s);
//        }


//        int[] arr = {1, 3, 4, 5, 7, 9, 8, 4, 5, 1, 5, 4};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

    }
}
