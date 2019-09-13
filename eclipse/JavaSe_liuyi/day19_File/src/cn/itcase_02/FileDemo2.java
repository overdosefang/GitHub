package cn.itcase_02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo2 {
	public static void main(String[] args) {
		//文件类是抽象的，路径和文件可以不存在
		File file = new File("z:\\a.txt");
		System.out.println(file);
		try {
			//字节输出流类是具体的，要求有实际存在的路径，文件没有默认创造
			FileOutputStream fos=new FileOutputStream(file);
			System.out.println(fos);
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
