package com.urlencoder;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;

import org.junit.Test;

public class UrlenCoder {

	@Test
	public void test() throws Exception{
	  String name="张三";
	  byte[] b=name.getBytes("utf-8");       
	  System.out.println(Arrays.toString(b));//+256 再转化为16进制 就是URL编码
	  
	  //以后GET中需要自己把中文进行URL编码
	  //POST中自动进行URL编码
	  String s=URLEncoder.encode(name,"utf-8"); //URL编码
	  System.out.println(s);
	  
	  s=URLDecoder.decode(s, "utf-8");          //URL解码
	  System.out.println(s);
	}
}
