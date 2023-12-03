package com.mapstruct.demo.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapstruct.demo.dto.EmployeeDTO;
import com.mapstruct.demo.entity.Employee;
import com.mapstruct.demo.mapper.EmployeePopulator;
import com.mapstruct.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee savEmployee(EmployeeDTO employeeDTO) {
		// convert DTO to entity		
		Employee employee = EmployeePopulator.INSTANCE.populateEmployee(employeeDTO);
		employee.setEmpCreationDate(new Date());
		return employeeRepository.save(employee);
	}
}
