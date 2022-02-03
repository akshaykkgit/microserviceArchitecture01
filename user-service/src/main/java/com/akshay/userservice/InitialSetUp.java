package com.akshay.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.akshay.userservice.entity.User;
import com.akshay.userservice.repository.UserRepository;
@Component
public class InitialSetUp implements CommandLineRunner {
	
	@Autowired
	UserRepository repository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		User user =new User(1L, "Akshay", "KK", "akshaykk3@gmail.com", 1L);
		repository.save(user);

	}

}
