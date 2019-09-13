package com.joyin.compare;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CompareDemo {

	public static void main(String[] args) {
		Boolean b=isSameFile("e://33.jar", "e://44.jar");
		System.out.println(b);
	}
	
	/**
	 * 	判断两个文件是否相同
	 * @param fileName1
	 * @param fileName2
	 * @return
	 */
	public static boolean isSameFile(String fileName1,String fileName2){  
	    FileInputStream fis1 = null;  
	    FileInputStream fis2 = null;  
	    try {  
	        fis1 = new FileInputStream(fileName1);  
	        fis2 = new FileInputStream(fileName2);  
	          
	        int len1 = fis1.available();//返回总的字节数  
	        int len2 = fis2.available();  
	          
	        if (len1 == len2) {//长度相同，则比较具体内容  
	            //建立两个字节缓冲区  
	            byte[] data1 = new byte[len1];  
	            byte[] data2 = new byte[len2];  
	              
	            //分别将两个文件的内容读入缓冲区  
	            fis1.read(data1);  
	            fis2.read(data2);  
	              
	            //依次比较文件中的每一个字节  
	            for (int i=0; i<len1; i++) {  
	                //只要有一个字节不同，两个文件就不一样  
	                if (data1[i] != data2[i]) {  
	                    System.out.println("文件内容不一样");  
	                    return false;  
	                }  
	            }  
	            System.out.println("两个文件完全相同"); 
	            return true;  
	        } else {  
	            //长度不一样，文件肯定不同  
	        	System.out.println("文件字节数不同");
	            return false;  
	        }  
	    } catch (FileNotFoundException e) {  
	        e.printStackTrace();  
	    } catch (IOException e) {  
	        e.printStackTrace();  
	    } finally {//关闭文件流，防止内存泄漏  
	        if (fis1 != null) {  
	            try {  
	                fis1.close();  
	            } catch (IOException e) {  
	                //忽略  
	                e.printStackTrace();  
	            }  
	        }  
	        if (fis2 != null) {  
	            try {  
	                fis2.close();  
	            } catch (IOException e) {  
	                //忽略  
	                e.printStackTrace();  
	            }  
	        }  
	    }  
	    return false;  
	}  
}
