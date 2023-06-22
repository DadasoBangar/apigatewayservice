package com.apigateway.microservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
	@GetMapping("/employeeServiceFallback")
	public String employeeServiceFallback()
	{
		return "Employee Service is down at this time";
	}
	
	@GetMapping("/addressServiceFallback")
	public String addressServiceFallback()
	{
		return "Address Service is down at this time";
	}
}
