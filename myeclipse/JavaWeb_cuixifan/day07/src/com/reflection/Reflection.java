package com.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

public class Reflection {
public static void main(String[] args) throws Exception {  //得到Class实例
	Class c1=Person.class;                                          
	Class c2=new Person().getClass();
	Class c3=Class.forName("com.reflection.Person"); //常用
}
@Test
public void test4() throws Exception{               //使用反射操作普通方法
	Class c4=Class.forName("com.reflection.Person");
	Person p4=(Person) c4.newInstance();
	Method m4=c4.getDeclaredMethod("setName", String.class);
	
	m4.invoke(p4, "wangwu");
	
	System.out.println(p4.getName());
	
	
}

@Test
public void test3() throws Exception{             //使用反射操作属性
	Class c3=Class.forName("com.reflection.Person");
	Person p3=(Person) c3.newInstance();
	
	Field f3=c3.getDeclaredField("name");
	
	f3.setAccessible(true);     //获取private权限
	
	f3.set(p3,"zhangsan");    //对属性设值    相当于 p3.name="zhangsan";
	
	System.out.println(f3.get(p3));  //相当于  p3.name
	
}

@Test
public void test2() throws Exception{            //使用反射操作有参构造方法
	Class c2=Class.forName("com.reflection.Person");
	
	Constructor cs=c2.getConstructor(String.class,String.class); //先要得到有参构造方法
	
	Person p2=(Person) cs.newInstance("lisi","2");     //在进行实例化
	
	System.out.println(p2.getName()+"   "+p2.getId());
}
 
@Test
public void test() throws Exception{            // 使用反射操作无参构造方法
	Class c1=Class.forName("com.reflection.Person");
	Person p1=(Person) c1.newInstance();
	
	p1.setName("zhangsan");
	System.out.println(p1.getName());
}

}
