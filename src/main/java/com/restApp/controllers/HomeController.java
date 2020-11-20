package com.restApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping ("/")
	public String rootPath() {
		return "Hello";
	}
}