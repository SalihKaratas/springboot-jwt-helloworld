package com.jwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping({"/hello1"})
	public String helloPage() {
		
		return "Hello World!";
		
	}
	
}
