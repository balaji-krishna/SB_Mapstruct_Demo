package com.mapstruct.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mapstruct.demo.dto.EmployeeDTO;
import com.mapstruct.demo.entity.Employee;
import com.mapstruct.demo.service.EmployeeService;

@RestController
@RequestMapping("employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@PostMapping("saveEmployee")
	private ResponseEntity<Employee> saveEmployee(@RequestBody EmployeeDTO employeeDTO){
		return new ResponseEntity<>(employeeService.savEmployee(employeeDTO), HttpStatus.CREATED);
	}
}
