package com.intuit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/palindrome")
public class PalindromeController {
	
	@Autowired
	private Palindrome palindrome;
	
	@PostMapping("/check/{word}")
	public boolean check(@PathVariable String word) {
		return palindrome.check(word);
	}
	
}
