package com.akshay.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.akshay.userservice.entity.User;
import com.akshay.userservice.repository.UserRepository;
import com.akshay.userservice.vo.Department;
import com.akshay.userservice.vo.ResponseTemplateVo;

@Service
public class UserService {
	
	@Autowired
	UserRepository repository;
	
	@Autowired
	RestTemplate restTemplate;

	public User saveUser(User user) {
		
		return repository.save(user);
	}

	public ResponseTemplateVo getUserWithDepartment(Long userId) {
		ResponseTemplateVo vo=new ResponseTemplateVo();
		User user=repository.findByUserId(userId);
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE:9091/departments/"+user.getUserId(), Department.class);
		vo.setUser(user);
		vo.setDepartment(department);
		return vo;
	}
	

}
