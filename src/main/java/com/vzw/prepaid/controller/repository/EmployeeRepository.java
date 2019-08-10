package com.vzw.prepaid.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vzw.prepaid.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	public Employee findByName(String name);

}