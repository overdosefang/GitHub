package com.test2;

public class TestDome2 {
public static void main(String[] args) {
/*	add(10,20,30);
	add(10,20);
	add(10);
*/
	any("10","20");
}
public static void add(int...arr){      //可变参数  适用于逻辑相同 参数相同 只是参数数量不同
	int sum=0;
	for(int i=0;i<arr.length;i++){
		sum+=arr[i];
	}
	System.out.println("sum:"+sum);	
}

public static <T>void any(T...arr){     //泛型方法与可变参数结合！
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
	}
}
}
