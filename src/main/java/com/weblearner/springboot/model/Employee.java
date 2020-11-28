package com.weblearner.springboot.model;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

import com.weblearner.springboot.validator.NameCheck;

@Component
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;	
	
	@NotBlank(message = "{empId.notblank}")
	@Size(min = 3, max = 5, message = "{empId.maxsize}")
	private String empId;
	@NotBlank(message = "{empName.notblank}")
	@NameCheck
	private String empName;
	@NotBlank(message = "{deptName.notblank}")
	private String deptName;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String toString() {
		return "Employee Id: " + this.empId + "Employee Name: " + this.empName + "Employee Dept Name: " + this.deptName;
	}

}
