
package com.akshay.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akshay.userservice.entity.User;

public interface UserRepository  extends JpaRepository<User	, Long>{

	User findByUserId(Long userId);
	

}
