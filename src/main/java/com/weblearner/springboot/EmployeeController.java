package com.weblearner.springboot;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.weblearner.springboot.model.Employee;
import com.weblearner.springboot.service.EmployeeService;

@RestController
@RequestMapping("/weblearner")
public class EmployeeController {

	@Autowired
	private EmployeeService dummyService;	
	
	@PostMapping("/employee")
	public String newEmployee(@Valid @RequestBody Employee employee) {
		return dummyService.addEmployee(employee);
	}

}
