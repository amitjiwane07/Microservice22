package com.example.demo.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Laptop;

@Repository
public interface LaptopRepository extends JpaRepositoryImplementation<Laptop, Long>{

	
}
