package com.qilinxx.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;


public class BListener implements ServletContextAttributeListener {
	//HttpSessionAttributeListener  与   ServletRequestAttributeListener 方法一致
	
	//三种属性监听的方法            （需要在xml注册）
    public void attributeAdded(ServletContextAttributeEvent scab) {//属性添加时执行
    	System.out.println("新加入的属性名："+scab.getName()+"   ,属性值："+scab.getValue());
    }


    public void attributeReplaced(ServletContextAttributeEvent scab) {//属性值替换时执行
    	System.out.println("被替换属性名："+scab.getName()+"    ,原属性值："+scab.getValue()+"   ,现属性值："+
    			scab.getServletContext().getAttribute(scab.getName()));
    }


    public void attributeRemoved(ServletContextAttributeEvent scab) {//属性移除前时执行
       System.out.println("被移除的属性名："+scab.getName()+"   ，属性值："+scab.getValue());
    }
	
}
