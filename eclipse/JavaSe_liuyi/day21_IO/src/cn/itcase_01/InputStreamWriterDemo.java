package cn.itcase_01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"));
//		InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"),"utf-8");
		
		//一次读取一个字符
		int ch=0;
		while((ch=isr.read())!=-1) {
			System.out.print((char)ch);
		}
		
		isr.close();
	}
}
