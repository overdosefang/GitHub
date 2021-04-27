package com.fys.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
//        File dir = new File("D://work");
//        System.out.println(dir);
//        String[] listDir = dir.list();
//        System.out.println(listDir);
//        System.out.println(dir.exists());
//        String[] listDir = dir.list();
//        for(String str : listDir){
////            System.out.println(str);
//        }
//        File[] listFiles = dir.listFiles();
//        for (File file : listFiles){
//            if(file.isAbsolute()){
//                System.out.println(file.getName());
//            }
//
//        }
        File f1 = new File("java.txt");
        System.out.println(f1.createNewFile());

        File f2 = new File("..//java2.txt");
//        System.out.println(f2.createNewFile());

        File f3 = new File("heima");
        f3.mkdir();



    }

}
