package cn.itcase_05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyFileDemo2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
		
		String str=null;
		while((str=br.readLine())!=null) {
			bw.write(str);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		br.close();
	}
}	
