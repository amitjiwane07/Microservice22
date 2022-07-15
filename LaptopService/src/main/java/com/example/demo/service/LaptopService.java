package com.example.demo.service;

import com.example.demo.model.Laptop;

public interface LaptopService {

	public Laptop saveLaptop(Laptop laptop);
	
	public Laptop getLaptopById(Long lid);
}
