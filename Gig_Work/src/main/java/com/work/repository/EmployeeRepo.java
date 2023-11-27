package com.work.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.work.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
