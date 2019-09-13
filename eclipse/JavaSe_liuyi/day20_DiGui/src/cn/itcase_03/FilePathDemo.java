package cn.itcase_03;

import java.io.File;

public class FilePathDemo {

	public static void main(String[] args) {
		File srcFolder = new File("E:\\");
		getAllFile(srcFolder);
	}
	
	public static void getAllFile(File srcFolder) {
		File[] listFiles = srcFolder.listFiles();
		if(listFiles!=null) {
			for (File f : listFiles) {
				if(f.isDirectory()) {
					getAllFile(f);
				}else {
					if(f.getName().endsWith(".txt")) {
						System.out.println(f.getAbsolutePath());
					}
				}
			}
		}
	}

}
