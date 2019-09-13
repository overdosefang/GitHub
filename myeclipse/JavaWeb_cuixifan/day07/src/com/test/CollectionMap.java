package com.test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

import java.util.Iterator;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;


public class CollectionMap {      //每个对象还可以调用toString（）方法
	@Test
	public void testMap(){                        //key可以不可以重复  value可以重复
		Map<String,String> map=new HashMap<String, String>();
		map.put("zzz", "111");
		map.put("xxx", "222");
		map.put("ccc", "333");
		map.put("zzz", "444");                    //后取的值替换了前面的值
		map.put("iii", "222");      
		//两种遍历
		//第一种 得到key值遍历vaule
		Set<String> set=map.keySet();                     //通过keySet()方法得到Set集合
		for (String key : set) {
			System.out.println(key+" : "+map.get(key));   //通过get(key)得到value的值
		}
		System.out.println("----------------------");
		
		//第二种 通过key与value的关系，分别得到key值与value值
		Set<Entry<String, String>> set1=map.entrySet();   //通过entrySet()方法得到Entry集合
		for (Entry<String, String> entry : set1) {
			
			String key=entry.getKey();                    //通过getKey（）得到key值
			String value=entry.getValue();                //通过getValue（）得到value
			
			System.out.println(key+" : "+value);
		}
		System.out.println("----------------------");
		
		System.out.println(map);
		
		System.out.println("----------------------");
	}
	@Test
	public void testSet(){                  //无序性 不可重复性
		Set<String> set=new HashSet<String>();
		set.add("qqq");
		set.add("eee");
		set.add("www");
		set.add("qqq");
		//两种遍历
		//第一种增强for
		for (String s : set) {
			System.out.println(s);
		}
		System.out.println("----------------------");

		//第二种迭代器
		Iterator<String> it=set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("----------------------");
		
		System.out.println(set);								//直接打印set.toString()
		
		System.out.println("----------------------");
	}

	@Test
	public void testList(){                 //有序性 可重复性
		List<String> list=new ArrayList<String>();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("aaa");
		//三种遍历
		//第一种for循环
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		System.out.println("----------------------");
		
		//第二种增强for
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("----------------------");
		
		//第三种迭代器
		Iterator<String> it=list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
	}
		System.out.println("----------------------");		
		System.out.println(list);
	}
}
