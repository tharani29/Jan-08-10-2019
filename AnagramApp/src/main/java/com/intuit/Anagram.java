package com.intuit;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Anagram {

	public String generate(String word) {
		String[] letters = word.split("");
		List<String> lettersList = Arrays.asList(letters);
		Collections.shuffle(lettersList); 
		StringBuilder jumbledWord = new StringBuilder("");
		lettersList.forEach(letter -> jumbledWord.append(letter));
		return jumbledWord.toString();
	}
}
