package com.offcn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	
	@RequestMapping("/index")
	public String getIndex(){
		System.out.println("呱呱呱");
		return "Hello Word!";
	}

}
