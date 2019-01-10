package com.intuit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

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
	@HystrixCommand(fallbackMethod="getAnagramFallback")
	public String getAnagram(@PathVariable String word) {
		return wordUtil.generateAnagram(word);
	}
	
	public String getAnagramFallback(String word) {
		return "Oops! Cannot serve you now. Try later";
	}
	
	@GetMapping("/palindrome/{word}")
	@ResponseBody
	@HystrixCommand(fallbackMethod="getPalindromeFallback"
		,commandProperties= {
				@HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds", 
						value="4000")
		})
	public String getPalindrome(@PathVariable String word) {
		System.out.println("***calling getPalindrome method");
		return wordUtil.checkPalindrome(word);
	}
	
	public String getPalindromeFallback(String word) {
		System.out.println("--in getPalindromeFallback method");
		return "Oops! Cannot serve you now. Try later";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
