package com.example.demo.service;

import com.example.demo.ResponseTemplateVO.ResponseTemplate;
import com.example.demo.model.Employee;

public interface EmployeeService {

	public Employee saveEmployee(Employee employee);
	
	public ResponseTemplate getEmployeeWithLaptop(Long eid);
}
