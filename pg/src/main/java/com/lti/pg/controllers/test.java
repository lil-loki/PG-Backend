package com.lti.pg.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    @RequestMapping("/")
	public String welcome() {
		return "Welcome to Spring Boot ";
	}
	
	@RequestMapping("/hello")
	public String myData() {
		return "Hello Spring Boot";
	}
}
