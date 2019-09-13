package cn.itcase_05;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class BufferedInputStreamDemo {

	public static void main(String[] args) throws IOException {
		//无法正常控制台打印中文
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.txt"));
		//一次读取一个字节
//		int by=0;
//		while((by=bis.read())!=-1) {
//			System.out.print((char)by);
//		}
		
		//一次读取一个字节数组
		byte[] bys=new byte[1024];
		int len=0;
		while((len=bis.read(bys))!=-1) {
			System.out.println(new String(bys,0,len));
		}
		bis.close();
	}

}
