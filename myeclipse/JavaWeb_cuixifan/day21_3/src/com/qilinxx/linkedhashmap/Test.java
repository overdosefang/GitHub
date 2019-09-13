package com.qilinxx.linkedhashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {
public static void main(String[] args) {
	Map<String, String> map=new LinkedHashMap<String, String>();
		
	map.put("zzz", "111");
	map.put("xxx", "222");
	map.put("ccc", "333");
	map.put("zzz", "444");                    //后取的值替换了前面的值
	map.put("iii", "222");
	
	
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
	
	//第二种方法的变形
	Iterator iter = map.entrySet().iterator();  
	while (iter.hasNext()) {
		Map.Entry entry = (Map.Entry) iter.next(); 
		
		String key = (String)entry.getKey(); 
		String val =(String) entry.getValue(); 
		
		System.out.println(key+"   :"+val);
	}
		
	System.out.println("----------------------");

	System.out.println(map);
	
	System.out.println("----------------------");
}
}
