package cn.itcase_05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 * 	文字类文件	--		字节									字符
 * 						输入									输入
 * 							FileInputStream						FileReader=InputStreamReader(子=父)
 * 							BufferedInputStream					BufferedReader
 * 						输出									输出
 * 							FileOutputStream					FileWriter=OutputStreamWriter(子=父)
 * 							BufferedOutputStream				BufferedWriter
 * 
 * 	规律：
 * 		1、FielInputStream与FileOutputStream和FileReader与FileWriter构造形参可以直接写文件名；
 * 		2、InputStreamReader与OutputStream构造形参需要传入FileInputStream与FileOutputStream的对象；
 * 		3、Buffered*类构造方法都需要传入相应字节流/字符流的对象；
 * 		4、传输中：字节流以一个字节或者一个字节数组单位，字符流以一个字符或者字符数组为单位
 */
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
		
		char[] chs=new char[1024];
		int len=0;
		while((len=br.read(chs))!=-1) {
			bw.write(chs,0,len);
			bw.flush();
		}
		
		bw.close();
		br.close();
	}
}
