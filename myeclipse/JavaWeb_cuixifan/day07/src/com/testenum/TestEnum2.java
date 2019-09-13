package com.testenum;

public class TestEnum2 {
public static void main(String[] args) {

	Color11 color11=Color11.GREEN;
	System.out.println(Color11.GREEN);     //不打印重写的抽象方法
}
	
		

}

enum Color11{
	RED("RED"){
		@Override
		public void print1() {
			// TODO Auto-generated method stub
			System.out.println("RED");
		}
		
	},GREEN("GREEN"){

		@Override
		public void print1() {
			// TODO Auto-generated method stub
			System.out.println("GREEN");
			System.out.println("hello");
		}
		
		},YELLOW("YELLOW"){

			@Override
			public void print1() {
				// TODO Auto-generated method stub
				System.out.println("YELLOW");
			}
			
		};

	private Color11(String name){}
	
	public abstract void  print1();
}

abstract class abs{
	public void print1(){
		
	}
}