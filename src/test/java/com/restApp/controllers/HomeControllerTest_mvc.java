package com.restApp.controllers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest
public class HomeControllerTest_mvc {
	
	MockMvc mockMvc;
	
	@Autowired
	WebApplicationContext wac;
	

	@Test
	public void shouldExposeRootEndpoint_GET() {
		try {
			
			
			this.mockMvc.perform(
					MockMvcRequestBuilders.get("/")
			).andDo(MockMvcResultHandlers.print())
			.andExpect(MockMvcResultMatchers.status().isOk())
			.andExpect(MockMvcResultMatchers.content().string("Hello"));			
		} catch (Exception ex) {
			Assert.fail("shouldExposeRootEndpoint_GET failed because of the following exception: " + ex.getMessage());
		}
	}
	
	@Before
	public void setupBeforeEachTest() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}
}
