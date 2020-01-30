package com.project.springbootexternalconfig1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	Config config;

	@GetMapping("/abc")
	public String fetchvalue() {
		return config.abc;
	}
}
