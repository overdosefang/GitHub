package cn.itcase_05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo {

	public static void main(String[] args) throws ParseException {
//		String s1="nihao";
//		String s2="nihao";
//		System.out.println(s1==s2);
		method1();
	}
	
	public static void method1() throws ParseException {
		String s="2019-6-25";
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=sdf.parse(s);
		
	}
}
