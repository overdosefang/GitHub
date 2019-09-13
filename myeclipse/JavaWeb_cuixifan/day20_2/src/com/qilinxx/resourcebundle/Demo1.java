package com.qilinxx.resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.Test;

public class Demo1 {
	@Test
	public void test1(){    //国际化
		 Locale locale =Locale.CHINA;
		 System.out.println(locale);
		 
		 ResourceBundle rb=ResourceBundle.getBundle("res", locale);//第一个参数基本名称   第二个参数Locale
		 
		 
		 System.out.println(rb.getString("username"));
		 System.out.println(rb.getString("password"));
		 System.out.println(rb.getString("login"));
		 
	}
}
