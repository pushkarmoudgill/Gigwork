package com.work.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.work.model.Employee;
import com.work.repository.EmployeeRepo;
import com.work.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public Employee addEmployee(Employee e) {
		// TODO Auto-generated method stub
		
	Employee emp=	employeeRepo.save(e);
		return emp;
	}

	@Override
	public String removeEmployee(int id) {
		// TODO Auto-generated method stub
		employeeRepo.deleteById(id);
		return "Delete data Successfully";
		
	}

	@Override
	public Optional<Employee> findEmpById(int id) {
		// TODO Auto-generated method stub
		Optional <Employee>emp=employeeRepo.findById(id);
		
		if(emp.isPresent()) {
			return emp;
		}else {
			return null;
		}
		//return null;
	}

	@Override
	public String updateEmployee(int id) {
		// TODO Auto-generated method stub
		Optional<Employee> emp=employeeRepo.findById(id);
		
		if(emp.isPresent()) {
			Employee emps=new Employee();
			
			employeeRepo.save(emps);
			return "update Successfully";
		}
		else {
			return "employee not found";
		}
	//	return null;
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		List<Employee> emplist =employeeRepo.findAll();
		return emplist;
	}
	
     	

}
