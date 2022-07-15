package com.example.demo.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Laptop;
import com.example.demo.repository.LaptopRepository;
import com.example.demo.service.LaptopService;

@Service
public class LaptopServiceImple implements LaptopService{

	@Autowired
	private LaptopRepository laptopRepository;
	
	@Override
	public Laptop saveLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		return laptopRepository.save(laptop);
	}

	@Override
	public Laptop getLaptopById(Long lid) {
		// TODO Auto-generated method stub
		return laptopRepository.findById(lid).orElse(null);
	}

}
