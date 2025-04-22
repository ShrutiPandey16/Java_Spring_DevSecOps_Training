package com.secops.training.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.secops.training.Model.Employee;

@RestController
public class TrainController {
	
	@GetMapping("employee/{empno}")
	public Employee employeeDetails(@PathVariable("empno")int empNo) {
		Employee emp = new Employee(empNo, "Shruti_"+empNo); 
		return emp;
	}
}
