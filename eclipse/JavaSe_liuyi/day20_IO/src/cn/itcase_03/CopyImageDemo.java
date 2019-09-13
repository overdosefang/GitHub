package cn.itcase_03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImageDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("a.jpg");
		FileOutputStream fos = new FileOutputStream("b.jpg");
		
		//每次读写一个字节，效率比较低
		int by=0;
		while((by=fis.read())!=-1) {
			fos.write(by);
		}
		
		fis.close();
		fos.close();
	}
}
