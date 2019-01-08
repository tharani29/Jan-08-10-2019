package com.intuit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TraditionalController {

	@GetMapping("/start")
	public String start() {
		return "index";
	}
}
