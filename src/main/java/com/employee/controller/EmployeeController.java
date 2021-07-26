package com.employee.controller;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService empService;

	@GetMapping("/employee")  
	private List<Employee> getAllEmployees()   
	{  
		return empService.getAllEmployees();  
	}  

	@GetMapping("/employee/{empid}")  
	private Employee getEmployee(@PathVariable("empid") int empid)   
	{  
		return empService.getEmployeeById(empid);  
	}  

	@DeleteMapping("/employee/{empid}")  
	private void deleteEmployee(@PathVariable("empid") int empid)   
	{  
		empService.delete(empid);  
	}  

	@PostMapping("/employee")  
	private int saveEmployee(@RequestBody Employee employee)   
	{  
		empService.saveOrUpdate(employee);  
		return employee.getEmpId();  
	}  

	@PutMapping("/employee")  
	private Employee update(@RequestBody Employee emp)   
	{  
		empService.saveOrUpdate(emp);  
		return emp;  
	}  
}  

