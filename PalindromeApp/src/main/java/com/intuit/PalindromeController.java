package com.intuit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PalindromeController {
	
	@Autowired
	private Palindrome palindrome;
	
	@Value("${welcome}")
	private String welcome;
	
	@GetMapping("/palindrome/{word}")
	public boolean check(@PathVariable String word) {
		return palindrome.check(word);
	}
	
	
	@GetMapping("/")
	public String index() {
		return welcome;
	}
}
