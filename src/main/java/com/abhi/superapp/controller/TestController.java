package com.abhi.superapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello from Super-App";
	}
	
	@GetMapping("/2.0/hello")
	public String hello() {
		return "Hello from Super-App: Updater to 2.0";
	}

}
