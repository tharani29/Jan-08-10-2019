package com.intuit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WordUtil {

	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${palindromeservice.url}")
	private String palindromeServiceUrl;
	
	@Value("${anagramservice.url}")
	private String anagramServiceUrl;

	public String checkPalindrome(String word) {
		String url = palindromeServiceUrl + "/" + word;
		ResponseEntity<Boolean> response = 
				restTemplate.getForEntity(url, Boolean.class);
		boolean isPalin = response.getBody();
		String message = word + " is not a palindrome";
		if(isPalin) {
			message = word + " is a palindrome";
		}

		return message;
	}
	
	public String generateAnagram(String word) {
		String url = anagramServiceUrl + "/" + word;
		ResponseEntity<String> response = 
				restTemplate.getForEntity(url, String.class);
		String message = response.getBody();

		return message;
	}
	
}
