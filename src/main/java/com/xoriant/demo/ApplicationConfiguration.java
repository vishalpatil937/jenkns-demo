package com.xoriant.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationConfiguration {
	@RequestMapping("/hello")
	public String hello() {
		return "Hello World";
	}

}
