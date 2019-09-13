package cn.itcase_01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
//		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("a.txt"));
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("a.txt"));
		
		//直接写入字符串
		osw.write("中国");
		
		osw.close();
	}
}
