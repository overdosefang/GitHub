package com.jaxp.xml;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

public class PersonDom {
	//用jaxp将整个perso.xml进行DOM式的解析
public static void main(String[] args) throws Exception {
	selectAll();
	//selectFirst();
	//addNode();
	//changeContent();
	//delNode();
	//traverseNode();
}
public static void list1(Node node1){
	if(node1.getNodeType()==Node.ELEMENT_NODE){                                //判断节点是否为元素
		System.out.println(node1.getNodeName());
	}
	
	NodeList list=node1.getChildNodes();                //得到子元素集合
	
	for(int i=0;i<list.getLength();i++){
		list1(list.item(i));
	}
	
}

public static void traverseNode() throws Exception{
	DocumentBuilderFactory builderFactory=DocumentBuilderFactory.newInstance();
	DocumentBuilder builder=builderFactory.newDocumentBuilder();
	Document doc=builder.parse("src/person.xml");
	
	list1(doc);                                                                 //利用递归思想
}

public static void delNode() throws Exception{
	DocumentBuilderFactory builderFactory=DocumentBuilderFactory.newInstance();
	DocumentBuilder builder=builderFactory.newDocumentBuilder();
	Document doc =builder.parse("src/person.xml");
	
	Node p1=doc.getElementsByTagName("p1").item(0);
	Node sex1=doc.getElementsByTagName("sex").item(0);
	
	p1.removeChild(sex1);
	
	TransformerFactory transformerFactory=TransformerFactory.newInstance();
	Transformer transformer=transformerFactory.newTransformer();
	transformer.transform(new DOMSource(doc), new StreamResult("src/person.xml"));
	
}

public static void changeContent() throws Exception{
	DocumentBuilderFactory builderFactory=DocumentBuilderFactory.newInstance();
	DocumentBuilder builder=builderFactory.newDocumentBuilder();
	Document doc=builder.parse("src/person.xml");
	
	Node node1=doc.getElementsByTagName("sex").item(0);
	
	node1.setTextContent("nan");
	
	TransformerFactory transformerFactory=TransformerFactory.newInstance();
	Transformer transformer=transformerFactory.newTransformer();
	transformer.transform(new DOMSource(doc),new StreamResult("src/person.xml"));
	
}

public static void addNode() throws Exception{
	DocumentBuilderFactory builderFactory=DocumentBuilderFactory.newInstance();
	DocumentBuilder builder=builderFactory.newDocumentBuilder();
	Document doc=builder.parse("src/person.xml");
	
	Node node1=doc.getElementsByTagName("p1").item(0);
	
	Element sex=doc.createElement("sex");
	Text text1=doc.createTextNode("nv");
	sex.appendChild(text1);
	
	node1.appendChild(sex);
	
	TransformerFactory transformerFactory=TransformerFactory.newInstance();       //回写xml中
	Transformer transformer=transformerFactory.newTransformer();
	transformer.transform(new DOMSource(doc),new StreamResult("src/person.xml"));
	
}

public static void selectFirst() throws Exception{
	DocumentBuilderFactory builderFactory=DocumentBuilderFactory.newInstance();
	DocumentBuilder builder=builderFactory.newDocumentBuilder();
	Document doc=builder.parse("src/person.xml");                             
	NodeList list=doc.getElementsByTagName("name");
	Node node1=list.item(0);
	System.out.println(node1.getTextContent());
	
}

public static void selectAll() throws Exception{ 
	DocumentBuilderFactory builderFactory =DocumentBuilderFactory.newInstance();
	
	DocumentBuilder builder=builderFactory.newDocumentBuilder();
	
	Document doc=builder.parse("src/person.xml");                                  //前面都是为了获取dom文件
	
	NodeList list=doc.getElementsByTagName("name");                                	//后面获取标签 划分节点 得到内容
	
	for(int i=0;i<list.getLength();i++){
		Node node1=list.item(i);
		System.out.println(node1.getTextContent());
	}
	
}

}
