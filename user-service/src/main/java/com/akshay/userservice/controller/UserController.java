package com.akshay.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akshay.userservice.entity.User;
import com.akshay.userservice.service.UserService;
import com.akshay.userservice.vo.ResponseTemplateVo;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
	
	@Autowired
	UserService userService;
	

	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		log.info("save user insede user service");
		return userService.saveUser(user);
	}
	@GetMapping("/{id}")
	public ResponseTemplateVo getuserWithDepartment(@PathVariable("id") Long userId) {
		log.info("execute getuserWithDepartment method inside user service");
		return userService.getUserWithDepartment(userId);
	}

	@GetMapping("/test")
	public String test() {
		return "done";
	}

	/*
	@GetMapping("/testCpu")
	public String testCpu() {
		boolean condition=true;
		try {
			while (condition)
			{
				 Runnable r = () ->{
					 while(true){

					 }
				 };
				 new Thread(r).start();
				 Thread.sleep(5000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "done";
	}*/

}
