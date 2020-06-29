package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

	@Autowired
	private NameProperties greetingProperties;
	
	@GetMapping("/")
	public String getName() {
		return greetingProperties.getName();
	}
	
}
