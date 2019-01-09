package com.intuit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {

	@Autowired
	private JmsTemplate jmsTemplate;
	
	@PostMapping("/stock/{symbol}")
	public String getPrice(@PathVariable String symbol) {
		jmsTemplate.convertAndSend("StockQueue", symbol);
		return "Symbol sent";
	}
}
