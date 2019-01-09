package com.intuit;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WordController {

	@Autowired
	private PalindromeUtil palindromeUtil;
	
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@PostMapping("/wordcheck")
	public String processWord(@RequestParam String word, ModelAndView modelAndView) {
		String message = palindromeUtil.checkPalindrome(word);
		modelAndView.addObject("message", message);
		return "index";
	}
	
	
	
}
