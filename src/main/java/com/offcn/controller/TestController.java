package com.offcn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	
	@RequestMapping("/index")
	public String getIndex(){
		System.out.println("呱呱呱");
		System.out.println("哈哈哈");
		System.out.println("再来一次");
		System.out.println("哈哈");
		return "Hello Word!";
	}

}
