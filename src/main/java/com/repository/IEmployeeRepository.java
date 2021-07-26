package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.employee.model.Employee;

public interface IEmployeeRepository extends CrudRepository<Employee, Integer>{

}
