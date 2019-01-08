package com.intuit;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TraditionalController {

	@PostMapping("/process")
	public String processForm(@RequestParam("firstname") String firstName, 
				HttpSession session) {
		String message = "Hello " + firstName;
		session.setAttribute("message", message);
		return "result";
	}
	
//	@PostMapping("/process")
//	@ResponseBody
//	public String processForm(@RequestParam("firstname") String firstName) {
//		return "Hello " + firstName;
//	}
	
	@GetMapping("/start")
	public String start() {
		return "index";
	}
}
