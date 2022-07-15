package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

	@GetMapping("/laptopServiceFallBack")
	public String laptopServiceFallBack() {
		return "Laptop service is taking longer time than expected "+"Please try agian later";
	}
	
	@GetMapping("/employeeServiceFallBack")
	public String employeeServiceFallBack() {
		return "Employee service is taking longer than expected "+"Please try again later";
	}
}
