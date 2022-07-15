package com.example.demo.ResponseTemplateVO;

import com.example.demo.model.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplate {

	private Employee employee;
	private Laptop laptop;
}
