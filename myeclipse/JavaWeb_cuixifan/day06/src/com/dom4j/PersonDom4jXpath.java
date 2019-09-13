package com.dom4j;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.Node;

import com.utils.Dom4jUtils;

public class PersonDom4jXpath {
public static void main(String[] args) {
	//test1();
	test2();
}

public static void test2(){
	Document document=Dom4jUtils.getDocument(Dom4jUtils.PATH);
	
	Node node=document.selectSingleNode("//p1[@id='aaaa']/name");
	
	System.out.println(node.getText());
}

public static void test1(){
	Document document=Dom4jUtils.getDocument(Dom4jUtils.PATH);
	
	List<Node> list=document.selectNodes("//name");
	
	for (Node node : list) {
		//所有的node都是name
		System.out.println(node.getText());
	}
	
}
}
