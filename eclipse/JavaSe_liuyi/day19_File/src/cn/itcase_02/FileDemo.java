package cn.itcase_02;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		File file1 = new File("e:\\aaa");
		System.out.println(file1);
		System.out.println(file1.mkdir());
		
		File file2 = new File("e:/bbb");
		System.out.println(file2.mkdir());
		
		File file3 = new File("e:/ccc\\ddd");
		System.out.println(file3.mkdirs());
		
		File file4 = new File("e:/a.txt");
		System.out.println(file4.createNewFile());
		
		
		

	}

}
