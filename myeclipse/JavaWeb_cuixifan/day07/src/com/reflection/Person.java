package com.reflection;

public class Person {
//属性
	private String name;
	private String id;
	private int age;
//构造方法
	public Person(){
	System.out.println("这是无参构造方法");
	}
	public Person(String name, String id) {
		System.out.println("这是有参构造方法");
		this.name = name;
		this.id = id;
	}
//普通方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("这是setName方法");
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
