package com.work.service;

import java.util.List;
import java.util.Optional;

import com.work.model.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee e);
	
	public String removeEmployee(int id);
	
	public Optional<Employee>  findEmpById(int id);
	
	public String updateEmployee(int  id);
	
	public  List<Employee> getAllEmployee();
}
