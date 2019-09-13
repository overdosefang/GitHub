package cn.itcase_04;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException {
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("a.txt")));
		BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
		
		bw.write("niaho");
		bw.write("ÖÐ¹ú");
		bw.flush();
		
		bw.close();
	}
}
