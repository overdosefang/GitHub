package com.testenum;

import org.junit.Test;

public class TestEnum3 {
	@Test
	public void test2(){
		//知道枚举的下标，获取对象或名称
		int idx=2;
		
		Color100[] carr=Color100.values();
		String name=carr[idx].name();
		System.out.println("name:"+name);
	}
	@Test
	public void test1(){
		//知道枚举的名称，获取对象和下标
		String name="GREEN";
		
		Color100 c=Color100.valueOf(name);
		int idx=c.ordinal();
		System.out.println("idx:"+idx);
	}
	
	@Test
	public void test(){
		//知道枚举的对象，获取名称和下标
		Color100 c=Color100.RED;
		
		String name=c.name();
		int idx=c.ordinal();
		System.out.println("name:"+name+"   "+"idx:"+idx);
	}
}

enum Color100{
	RED,GREEN,YELLOW;
}