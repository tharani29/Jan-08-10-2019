package com.intuit;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.mockito.BDDMockito.*;


@RunWith(SpringRunner.class)
@WebMvcTest(HelloController.class)
public class HelloControllerTest {

	@MockBean
	private HelloController helloController;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testBye()throws Exception{
		when(helloController.sayBye("Ram")).thenReturn("Bye Bye Ram");
		mockMvc.perform(post("/bye/Ram"))
				.andExpect(content().string("Bye Bye Ram"));
	}
	
	@Test
	public void testGreet() throws Exception{
		  when(helloController.greet("sam")).thenReturn("Hello sam");
	      mockMvc.perform(get("/greet/sam")).
	                andExpect(status().isOk()).
	                andExpect(content().string("Hello sam"));
	}

}









