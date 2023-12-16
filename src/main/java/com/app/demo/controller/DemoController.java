package com.app.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping(value = "/hello")
	public String hello(@RequestParam String name) {
		return "Hello "+name+" Good Morning";
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/hi")
	public String hi() {
		return "Hello ";
	}
}
