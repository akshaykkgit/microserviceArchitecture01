package com.akshay.userservice.vo;

import com.akshay.userservice.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVo {
	
	User user;
	Department department;

}
