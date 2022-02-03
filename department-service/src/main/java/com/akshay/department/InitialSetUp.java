package com.akshay.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.akshay.department.entity.Department;
import com.akshay.department.repository.DepartmentRepository;

@Component
public class InitialSetUp implements CommandLineRunner {
	
	@Autowired
	
	DepartmentRepository departmentRepository;
	

	@Override
	public void run(String... args) throws Exception {
		
		Department department=new Department(1L, "IT", "KL11", "001");
		departmentRepository.save(department);
		
		

	}

}
