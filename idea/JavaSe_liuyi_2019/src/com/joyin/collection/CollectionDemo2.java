package com.joyin.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class CollectionDemo2 {
    public static void main(String[] args) {
//        Student[] s2={new Student("张三",20),new Student("张三",20)};
//        System.out.println(Arrays.toString(s2));

        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num=o1.getAge()-o2.getAge();
                num = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
                return num;
            }
        });

        ts.add(new Student("张三",20));
        ts.add(new Student("李四",18));
        ts.add(new Student("王五",25));
        ts.add(new Student("马六",22));

        ts.add(new Student("钱七",18));

        for(Student s: ts){
            System.out.println(s.toString());
        }
    }
}
