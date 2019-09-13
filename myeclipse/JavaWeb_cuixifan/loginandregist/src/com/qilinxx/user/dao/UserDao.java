package com.qilinxx.user.dao;

import java.io.FileOutputStream;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import com.qilinxx.user.domain.User;

public class UserDao {//数据类
	private String path="E:/users.xml";
	
	
	public User findByUsername(String username) {//查询数据库
		SAXReader saxReader=new SAXReader();
		
		try {
			Document document=saxReader.read(path);				
			Element ele=(Element)document.selectSingleNode("//user[@username='"+username+"']");	
			if(ele==null) return null;
			
			User user=new User();
			user.setUsername(ele.attributeValue("username"));
			user.setPassword(ele.attributeValue("password"));
			return user;
			
		} catch (Exception e) {
			throw new RuntimeException();
		}
		
	}
	public void addUser(User user){    //添加用户
		SAXReader saxReader=new SAXReader();	
		
			try {
			Document document = saxReader.read(path);
			Element root=document.getRootElement();
			Element newUser=root.addElement("user");
			newUser.addAttribute("username",user.getUsername());
			newUser.addAttribute("password",user.getPassword());
			
			//回写
			OutputFormat format=OutputFormat.createPrettyPrint();
			XMLWriter xmlWriter=new XMLWriter(new FileOutputStream(path), format);
			xmlWriter.write(document);
			xmlWriter.close();	
			} catch (Exception e) {
				throw new RuntimeException();
			}
	
		
	}
	
}
