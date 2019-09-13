package cn.itcase_07;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		File file = new File("e:\\");
		
		String[] list = file.list();
		for (String s : list) {
			System.out.println(s);
		}
		
		System.out.println("--------------------------");
		
		File[] listFiles = file.listFiles();
		for (File f : listFiles) {
			System.out.println(f.getName());
			System.out.println(f.getAbsolutePath());
		}
	}
}
