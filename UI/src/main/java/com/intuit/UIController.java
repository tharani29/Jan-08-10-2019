package com.intuit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UIController {

	@Autowired
	private WordUtil wordUtil;
	
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/anagram/{word}")
	@ResponseBody
	public String getAnagram(@PathVariable String word) {
		return wordUtil.generateAnagram(word);
	}
	
	@GetMapping("/palindrome/{word}")
	@ResponseBody
	public String getPalindrome(@PathVariable String word) {
		return wordUtil.checkPalindrome(word);
	}

}
