package com.intuit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PalindromeUtil {

	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${palindromeservice.url}")
	private String palindromeServiceUrl;

	public String checkPalindrome(String word) {
		String url = palindromeServiceUrl + "/" + word;
		ResponseEntity<Boolean> response = 
				restTemplate.postForEntity(url, null, Boolean.class);
		boolean isPalin = response.getBody();
		String message = word + " is not a palindrome";
		if(isPalin) {
			message = word + " is a palindrome";
		}

		return message;
	}
	
}
