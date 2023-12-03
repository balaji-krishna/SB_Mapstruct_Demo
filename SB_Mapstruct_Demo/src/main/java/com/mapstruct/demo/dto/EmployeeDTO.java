package com.mapstruct.demo.dto;

public class EmployeeDTO {
	
	private Long empId;
	
	private String empName;
	
	private Long empAge;
	
	private String empEmail;

	public EmployeeDTO() {
		super();
	}

	public EmployeeDTO(Long empId, String empName, Long empAge, String empEmail) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empEmail = empEmail;
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

}
