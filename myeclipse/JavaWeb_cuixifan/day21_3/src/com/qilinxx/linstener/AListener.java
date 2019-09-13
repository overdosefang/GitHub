package com.qilinxx.linstener;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class AListener
 *
 */
public class AListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        ServletContext application=sce.getServletContext();
    	
        Map<String, Integer> map=new LinkedHashMap<String,Integer>();  //linkedHasMap为有序的hashMap
        
        application.setAttribute("map", map);
        
        
    }


    public void contextDestroyed(ServletContextEvent sce) {
    	
    }
	
}
