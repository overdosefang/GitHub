package cn.itcase_01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		//创建字节输出流对象会自动创建文件
		FileOutputStream fos = new FileOutputStream("fos.txt");
//		FileOutputStream fos = new FileOutputStream("fos.txt",true);
		
		//写入的内容会覆盖之前的所有内容
		fos.write("hello ".getBytes());
		
//		fos.write(97);//int类型	写入一个字节
//		fos.write(57);
//		fos.write(55);
		
//		for(int i=0;i<10;i++) {
//			fos.write(("hello"+i).getBytes());
//			fos.write("\r\n".getBytes());
//		}
		
		fos.close();
	}

}
