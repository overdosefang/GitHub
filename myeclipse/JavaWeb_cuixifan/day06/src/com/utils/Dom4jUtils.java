package com.utils;

import java.io.FileOutputStream;

import org.dom4j.Document;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;


public class Dom4jUtils {

	public static final String PATH="src/person.xml";
	
	public static Document getDocument(String path){
		SAXReader saxReader= new SAXReader();
		
		try {
			Document document=saxReader.read(path);
			
			return document;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	public static void xmlWriters(String path,Document document){
		
		try {
			OutputFormat format=OutputFormat.createPrettyPrint();
			
			XMLWriter xmlWriter=new XMLWriter(new FileOutputStream(path), format);
			
			xmlWriter.write(document);
			
			xmlWriter.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
