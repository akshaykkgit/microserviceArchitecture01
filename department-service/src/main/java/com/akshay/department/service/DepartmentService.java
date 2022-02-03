package com.akshay.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akshay.department.entity.Department;
import com.akshay.department.repository.DepartmentRepository;
@Service
public class DepartmentService {
    
	@Autowired
	DepartmentRepository departmentRepository;
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
		
	}
	public Department getDepartmentById(Long id) {
		return departmentRepository.findByDepartmentId(id);
	}

}
