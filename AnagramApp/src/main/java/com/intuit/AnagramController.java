package com.intuit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnagramController {
	
	@Autowired
	private Anagram anagram;
	
	@GetMapping("/anagram/{word}")
	public String generate(@PathVariable String word) {
		return anagram.generate(word);
	}
	
	
}
