package com.example.demo.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.ResponseTemplateVO.Laptop;
import com.example.demo.ResponseTemplateVO.ResponseTemplate;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;

@Service
public class EmployeeServiceImple implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public ResponseTemplate getEmployeeWithLaptop(Long eid) {
		ResponseTemplate vo=new ResponseTemplate();
		Employee employee2=employeeRepository.findById(eid).orElse(null);
		Laptop laptop2= restTemplate.getForObject("http://laptop-service/laptop/"+employee2.getLid(), Laptop.class);
		
		vo.setEmployee(employee2);
		vo.setLaptop(laptop2);
		
		return vo;
	}

}
