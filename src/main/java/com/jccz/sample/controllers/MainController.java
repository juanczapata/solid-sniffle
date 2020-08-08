package com.jccz.sample.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services/v1")
public class MainController {
	
	@GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
	public String getGreeting() {
		return "Hey dude!";
	}
	
	@GetMapping(value = "/farewell", produces = MediaType.APPLICATION_JSON_VALUE)
	public String getGoodBye() {
		return "So long, partner :(";
	}
}
