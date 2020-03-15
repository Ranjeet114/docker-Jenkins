package com.spring.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/")	
	public String home() {
		return ("<h1>This is my home<h1>");

	}
}
