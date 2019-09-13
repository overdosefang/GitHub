package cn.itcase_06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*	字符缓冲输入流：
 * 		每次读取一行，不包括换行符号，所以要手动换行
 *	字符缓冲输出流：
 *		写入字符后，自动根据文本换行
 */
public class BuffereDemo {
	public static void main(String[] args) throws IOException {
		write();
//		read();
	}
	
	private static void read() throws IOException {
		//创建字符缓冲输入流对象
		BufferedReader br = new BufferedReader(new FileReader("bw.txt"));
		String str=null;
		while((str=br.readLine())!=null) {
			System.out.println(str);
		}
		
	}

	public static void write() throws IOException {
		//创建字符缓冲输出流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("bw.sh"));
		for(int i=0;i<10;i++) {
			bw.write("hello"+i);
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
}
