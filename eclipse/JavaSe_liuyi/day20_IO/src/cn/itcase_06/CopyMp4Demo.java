package cn.itcase_06;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyMp4Demo {

	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		method1("e:\\a.avi", "e:\\copy1.avi");
		long end1 = System.currentTimeMillis();
		System.out.println("coyp1:"+(end1-start)+"∫¡√Î");
		System.out.println("--------------------------");
		
		method2("e:\\a.avi", "e:\\copy2.avi");
		long end2 = System.currentTimeMillis();
		System.out.println("coyp2:"+(end2-end1)+"∫¡√Î");
		System.out.println("--------------------------");
		
		method3("e:\\a.avi", "e:\\copy3.avi");
		long end3 = System.currentTimeMillis();
		System.out.println("coyp3:"+(end3-end2)+"∫¡√Î");
		System.out.println("--------------------------");
		
		method4("e:\\a.avi", "e:\\copy4.avi");
		long end4 = System.currentTimeMillis();
		System.out.println("coyp4:"+(end4-end3)+"∫¡√Î");
		System.out.println("--------------------------");
		
	}
	
	public static void method1(String src,String dest) throws IOException{
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(dest);
		
		int by=0;
		while((by=fis.read())!=-1){
			fos.write(by);
		}
		
		fos.close();
		fis.close();
	}
	
	public static void method2(String src,String dest) throws IOException{
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(dest);
		
		byte[] bys=new byte[1024];
		int len=0;
		while((len=fis.read(bys))!=-1) {
			fos.write(bys, 0, len);
		}
		
		fos.close();
		fis.close();
	}
	
	public static void method3(String src,String dest) throws IOException{
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));
		
		int by=0;
		while((by=bis.read())!=-1){
			bos.write(by);
		}
		
		bos.close();
		bis.close();
	}
	
	public static void method4(String src,String dest) throws IOException{
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));
		
		byte[] bys=new byte[1024];
		int len=0;
		while((len=bis.read(bys))!=-1) {
			bos.write(bys, 0, len);
		}
		
		bos.close();
		bis.close();
	}
}
