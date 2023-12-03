package com.mapstruct.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	private Long empId;
	
	private String empName;
	
	private Long empAge;
	
	private String empEmail;
	
	private Date empCreationDate;

	public Employee() {
		super();
	}

	public Employee(Long empId, String empName, Long empAge, String empEmail, Date empCreationDate) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empEmail = empEmail;
		this.empCreationDate = empCreationDate;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Long getEmpAge() {
		return empAge;
	}

	public void setEmpAge(Long empAge) {
		this.empAge = empAge;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public Date getEmpCreationDate() {
		return empCreationDate;
	}

	public void setEmpCreationDate(Date empCreationDate) {
		this.empCreationDate = empCreationDate;
	}
	
	

}
