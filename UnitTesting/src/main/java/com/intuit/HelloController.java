package com.intuit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/greet/{name}")
	public String greet(@PathVariable String name) {
		return "Hello " + name;
	}
	
	@PostMapping("/bye/{name}")
	public String sayBye(@PathVariable String name) {
		return "Bye Bye " + name;
	}
}
