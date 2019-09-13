package com.testenum;

import org.junit.Test;

public class TestEnum {

	private int color1;
	private Color2 color2;
	private Color3 color3;
	@Test
	public void test(){
		color1=Color1.GREEN;//000;
		color2=Color2.GREEN;//new Color2();
		color3=Color3.RED;
		System.out.println("color1:"+color1);
		System.out.println("color2:"+color2);
		System.out.println("color3:"+color3);
	}
}

enum Color3{                                              //枚举类将构造方法私有化
	    RED,GREEN,YELLOW;                                 //构造方法私有化不能从外部new（构建新的对象）
}
														//方法二与方法三一样！
class Color2{
	private Color2(String name){}                       //私有化构造方法
	public static final Color2 RED=new Color2("RED");
	public static final Color2 GREEN=new Color2("GREEN");
	public static final Color2 YELLOW=new Color2("YELLOW");
}

class Color1{
	public static final int RED=1;
	public static final int GREEN=2;
	public static final int YELLOW=3;
}
