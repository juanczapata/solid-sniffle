package com.jccz.sample.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(controllers = MainController.class)
class MainControllerTest {
	@Autowired
	private MockMvc mockMvc;

	@Test
	void testGetGreeting() throws Exception {
		mockMvc.perform(get("/services/v1/hello"))
		.andExpect(status().isOk());
	}

	@Test
	void testGetGoodBye() throws Exception {
		mockMvc.perform(get("/services/v1/farewell"))
		.andExpect(status().isOk());
	}

}
