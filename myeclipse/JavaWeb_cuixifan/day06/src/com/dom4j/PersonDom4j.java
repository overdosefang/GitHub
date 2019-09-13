package com.dom4j;

import java.io.FileOutputStream;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import com.utils.Dom4jUtils;


public class PersonDom4j {
public static void main(String[] args) throws Exception {
	//selectAll();
	//selectFirst();
	selectSecond();
	//add();
	//addBefore();
	//modifyAge();
	//delSch();
	//getValues();
	
}
public static void getValues(){

	Document document= Dom4jUtils.getDocument(Dom4jUtils.PATH);
	
	Element root=document.getRootElement();
	
	Element p1= root.element("p1");
	
	String s=p1.attributeValue("id");
	
	System.out.println(s);
}

public static void delSch(){
	Document document=Dom4jUtils.getDocument(Dom4jUtils.PATH);
	
	Element root=document.getRootElement();
	
	Element p1 = root.element("p1");
	
	Element school =p1.element("school");
	
	p1.remove(school);
	//回写
	Dom4jUtils.xmlWriters(Dom4jUtils.PATH, document);
}

public static void modifyAge(){
	Document document=Dom4jUtils.getDocument(Dom4jUtils.PATH);
	
	Element root=document.getRootElement();
	
	List<Element> list=root.elements("p1");
	
	Element age =list.get(0).element("age");
	
	age.setText("30");
	
	//回写
	Dom4jUtils.xmlWriters(Dom4jUtils.PATH, document);
}

public static void addBefore() throws Exception{
/*	SAXReader saxReader=new SAXReader();
	
	Document document=saxReader.read("src/person.xml");*/
	
	//使用封装的方法
	Document document=Dom4jUtils.getDocument(Dom4jUtils.PATH);
	
	Element root =document.getRootElement();
	
	Element p1 =root.element("p1");
	
	List<Element> list=p1.elements();
	
	Element school=DocumentHelper.createElement("school");  //先创建后添加
	
	school.setText("huaishida");
	
	list.add(1, school);                    //指定位置用list加
	
	//回写
/*	OutputFormat format=OutputFormat.createPrettyPrint();
	
	XMLWriter xmlWriter=new XMLWriter(new FileOutputStream("src/person.xml"), format);
	
	xmlWriter.write(document);
	
	xmlWriter.close();
*/
	Dom4jUtils.xmlWriters(Dom4jUtils.PATH, document);
}

public static void add() throws Exception{
	SAXReader saxReader=new SAXReader();
	
	Document document=saxReader.read("src/person.xml");
	
	Element root=document.getRootElement();
	
	List<Element> list=root.elements("p1");
	
	Element p1=list.get(0);
	
	Element sex=p1.addElement("sex");             //既创建又添加
	                                              //尾节点用父节点加  
	sex.setText("nv");
	
	
   	//回写操作
	OutputFormat format=OutputFormat.createPrettyPrint();         
	
	XMLWriter xmlWriter=new XMLWriter(new FileOutputStream("src/person.xml"), format);
	
	xmlWriter.write(document);
	
	xmlWriter.close();

	
}

public static void selectSecond() throws Exception {
	SAXReader saxReader=new SAXReader();
	
	Document document=saxReader.read("src/person.xml");
	
	Element root=document.getRootElement();
	
	List<Element> list=root.elements("p1");
	
	Element p12 =list.get(1);
	
	Element name2=p12.element("name");
	
	System.out.println(name2.getText());
	
	
}


public static void selectFirst() throws Exception{
	SAXReader saxReader=new SAXReader();
	
	Document document=saxReader.read("src/person.xml");
	
	Element root=document.getRootElement();
	
	List<Element> list=root.elements("p1");
	
	Element p11=list.get(0);
	
	Element name1=p11.element("name");
	
	System.out.println(name1.getText());
}

public static void selectAll() throws Exception{
	SAXReader saxReader=new SAXReader();
	
	Document document=saxReader.read("src/person.xml");
	
	Element root=document.getRootElement();
	
	List<Element> list=root.elements("p1");
	
/*	for (Element element : list) {
		Element name=element.element("name");
		
		System.out.println(name.getText());
	}*/
	for(int i=0;i<list.size();i++){
		Element name=list.get(i).element("name");
		
		System.out.println(name.getText());
	}
}

}
