package com.sax;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class PersonSax {
	public static void main(String[] args) throws Exception{
		SAXParserFactory saxParserFactory=SAXParserFactory.newInstance();
		
		SAXParser saxParser=saxParserFactory.newSAXParser();
		
		saxParser.parse("src/person.xml",new MyDefaultHandler2());
	}
}

class MyDefaultHandler3 extends DefaultHandler{

	boolean flag=false;
	int i=1;
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		if("name".equals(qName)){
			flag=true;
		}
	}
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		if(flag==true&&i==1){
			System.out.println(new String(ch,start,length));
			i++;
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		if("name".equals(qName)){
			flag=false;
		}
	}


	
}


class MyDefaultHandler2 extends DefaultHandler{

	boolean flag=false;
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		if("name".equals(qName)){
			flag=true;
		}
	}
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		if(flag==true){
			System.out.println(new String(ch,start,length));
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		if("name".equals(qName)){
			flag=false;
		}
	}


	
}

class MyDefaultHandler extends DefaultHandler{

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
				System.out.print("<"+qName+">");
	}

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
				System.out.print(new String(ch,start,length));

	}
	
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
				System.out.print("</"+qName+">");
	}

}
