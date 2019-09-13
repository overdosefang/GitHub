package cn.itcase_04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		
		//一次读取一个字符
//		int ch=0;
//		while((ch=br.read())!=-1) {
//			System.out.print((char)ch);
//		}
		
		//一次读取一个字符数组
		char[] chs=new char[1024];
		int len=0;
		while((len=br.read(chs))!=-1) {
			System.out.print(new String(chs,0,len));
		}
		
		br.close();
	}
}
