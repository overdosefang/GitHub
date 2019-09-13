package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	/**
	 * 	跳转主页
	 * @return	跳转主页
	 */
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	/**
	 * 	返回指定界面
	 * @param page	指定页面
	 * @return	返回指定页面
	 */
	@RequestMapping("/{page}")
	public String page(@PathVariable String page) {
		return page;
	}
	
}
