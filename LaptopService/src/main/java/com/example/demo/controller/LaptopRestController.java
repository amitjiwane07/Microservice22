package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Laptop;
import com.example.demo.serviceImple.LaptopServiceImple;

@RestController
@RequestMapping("/laptop")
public class LaptopRestController {

	@Autowired
	private LaptopServiceImple laptopServiceImple;
	
	@PostMapping("/post")
	public Laptop storeLaptop(@RequestBody Laptop laptop) {
		return laptopServiceImple.saveLaptop(laptop);
	}
	
	@GetMapping("/{lid}")
	public Laptop ObtainLaptopById(@PathVariable Long lid) {
		return laptopServiceImple.getLaptopById(lid);
	}
}
