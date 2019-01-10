package com.intuit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UtilService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${datetimeservice.url}")
	private String datetimeServiceUrl;
	
	
	public String getDateTime() {
		ResponseEntity<String> response = 
				restTemplate.getForEntity(datetimeServiceUrl, String.class);
		String message = response.getBody();

		return message;
	}
	
}

