package cn.itcase_03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		//将文本内容进行读取和写入
		FileInputStream fis = new FileInputStream("a.txt");
		FileOutputStream fos = new FileOutputStream("b.txt");
		
		int i=0;
		while((i=fis.read())!=-1) {
			fos.write(i);
		}
		fos.close();
		fis.close();
	}
}
