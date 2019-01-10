package com.intuit;

import org.springframework.stereotype.Component;

@Component
public class Palindrome {

	public boolean check(String word) {
		String[] letters = word.split("");
		String reversedWord = "";
		for(int i = letters.length - 1; i > -1; i--) {
			reversedWord += letters[i];
		}
		return word.equalsIgnoreCase(reversedWord);
	}
}
