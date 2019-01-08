package com.intuit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	//http://localhost:8080/hi?firstname=Mary&lastname=Thomas
	@GetMapping("/hi")
	@ResponseBody
	public String hi(@RequestParam("firstname") String firstName,
			@RequestParam("lastname") String lastName) {
		return "Hi " + firstName + " " + lastName;
	}
	
	//http://localhost:8080/Sam
	@GetMapping("/{name}")
	@ResponseBody
	public String greet(@PathVariable("name") String name) {
		return "Hello " + name;
	}
	
	@PostMapping("/bye/{name}")
	@ResponseBody
	public String bye(@PathVariable("name") String name) {
		return "Bye Bye " + name;
	}
	
}
