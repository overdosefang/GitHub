package cn.itcase_03;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		File file1 = new File("a.txt");
		System.out.println(file1.createNewFile());
		
		File file2 = new File("aaa\\bbb\\ccc");
		System.out.println(file2.mkdirs());
		
		System.out.println(file1.delete());
		
		System.out.println(file2.delete());
		
		
	}

}
