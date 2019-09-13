package cn.itcase_03;

import java.io.File;

public class FileDeleteDemo {

	public static void main(String[] args) {
		File file = new File("aaa");
		deleteAllFile(file);
	}
	
	public static void deleteAllFile(File srcFolder) {
		File[] listFiles = srcFolder.listFiles();
		if(listFiles!=null) {
			for (File f : listFiles) {
				if(f.isDirectory()) {
					deleteAllFile(f);
				}else {
					System.out.println(f.getName()+":"+f.delete());
				}
			}
		}
		System.out.println(srcFolder.getName()+":"+srcFolder.delete());
	}
}
