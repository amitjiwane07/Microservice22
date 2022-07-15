package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ResponseTemplateVO.ResponseTemplate;
import com.example.demo.model.Employee;
import com.example.demo.serviceImple.EmployeeServiceImple;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {

	@Autowired
	private EmployeeServiceImple employeeServiceImple;
	
	@PostMapping("/post")
	public Employee storeEmployee(@RequestBody Employee employee) {
		return employeeServiceImple.saveEmployee(employee);
	}
	
	@GetMapping("/{eid}")
	public ResponseTemplate getEmployeeWithLaptop(@PathVariable Long eid) {
		return employeeServiceImple.getEmployeeWithLaptop(eid);
	}
}
