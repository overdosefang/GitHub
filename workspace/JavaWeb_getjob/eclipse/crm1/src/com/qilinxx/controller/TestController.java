package com.qilinxx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping(value="test.action")
	public String test (){
		return "customer";
	}
}
