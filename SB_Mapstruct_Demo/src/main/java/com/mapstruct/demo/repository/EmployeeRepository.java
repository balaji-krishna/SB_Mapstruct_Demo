package com.mapstruct.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapstruct.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
