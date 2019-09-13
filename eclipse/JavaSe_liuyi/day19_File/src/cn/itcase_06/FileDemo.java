package cn.itcase_06;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo {

	public static void main(String[] args) {
		File file = new File("aaa\\bbb\\a.txt");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.getName());
		System.out.println(file.length());
		System.out.println(file.lastModified());
		
		Date date = new Date(file.lastModified());
		SimpleDateFormat sdf = new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String timeString = sdf.format(date);
		System.out.println(timeString);
	}

}
