package cn.itcase_02;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("fis.txt");
		//这样单个字节转换，不能读取中文
		int i = fis.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fis.read();
		}
	}
}
