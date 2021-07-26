package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.employee.model.Employee;
import com.repository.IEmployeeRepository;
import java.util.ArrayList;  
import java.util.List;  


@Service
public class EmployeeService {
	@Autowired  
	IEmployeeRepository empRepository;  

	// SELECT * --- GET request
	public List<Employee> getAllEmployees()   
	{  
		List<Employee> empList = new ArrayList<>();  
		empRepository.findAll().forEach(emp -> empList.add(emp));  
		return empList;  
	}  
	
	// SELECT  --- GET request
	public Employee getEmployeeById(int empId)   
	{  
		return empRepository.findById(empId).get();  
	}  
	
	// INSERT --- POST request
	public void saveOrUpdate(Employee emp)   
	{  
		empRepository.save(emp);  
	}  
	
	// DELETE --- DELETE request
	public void delete(int empId)   
	{  
		empRepository.deleteById(empId);  
	}  
	
	// UPDATE --- PUT request
	public void update(Employee emp, int empId)   
	{  
		empRepository.save(emp);  
	}  
}  