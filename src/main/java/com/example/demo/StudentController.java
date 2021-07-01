package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	private DBConfiguration config;

	@GetMapping("student/{id}")
	public String getStudent(@PathVariable long id) {
		return "User-"  +config.getUsername() +"-SchemaName-" +config.getSchemaname();
	}
}
