package com.mapstruct.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.mapstruct.demo.dto.EmployeeDTO;
import com.mapstruct.demo.entity.Employee;

@Mapper
public interface EmployeePopulator {
	
	EmployeePopulator INSTANCE = Mappers.getMapper(EmployeePopulator.class);
	
	@Mapping(target = "empCreationDate", ignore = true)
	Employee populateEmployee(EmployeeDTO employeeDTO);

}
