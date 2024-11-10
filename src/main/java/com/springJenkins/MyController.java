package com.springJenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController 
{
	@PostMapping("/hello")
	public String getHello()
	{
		return "Hello";
	}
}
