package com.intuit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalcController {

	@Autowired
	private Calculator calculator;
	
	@GetMapping("/add/{number1}/{number2}")
	public int add(@PathVariable int number1, @PathVariable int number2) {
		return calculator.add(number1, number2);
	}
	
	@GetMapping("/square/{number}")
	public int square(@PathVariable int number) {
		return calculator.square(number);
	}
	
	@PutMapping("/subtract/{number1}/{number2}")
	public int subtract(@PathVariable int number1, @PathVariable int number2) {
		return calculator.subtract(number1, number2);
	}
	
	@PostMapping("/product")
	public int product(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
		return calculator.multiply(number1, number2);
	}
	
}
