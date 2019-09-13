package com.test2;

import java.util.Arrays;

public class TestDome {
public static void main(String[] args) {
	Integer[] arr1={1,2,3,4,5,6,7};
	System.out.println(Arrays.toString(arr1));
	reverses(arr1);
	System.out.println(Arrays.toString(arr1));
	System.out.println("_______________________________");

	String[] arr2={"a","b","c","d","e","f"};
	System.out.println(Arrays.toString(arr2));
	reverses(arr2);
	System.out.println(Arrays.toString(arr2));
}

public static <T>void reverses(T[] arr) {
	for(int i=0;i<arr.length/2;i++){
		T temp=arr[i];
		arr[i]=arr[arr.length-i-1];
		arr[arr.length-i-1]=temp;
	}
}
}
