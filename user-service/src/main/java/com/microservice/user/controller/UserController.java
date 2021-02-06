package com.microservice.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.user.entity.User;
import com.microservice.user.service.UserService;
import com.microservice.user.valueObject.ResponseTemplateVO;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		return userService.save(user);

	}

//	@GetMapping("/{id}")
//	public User getUserById(@PathVariable(value = "id") Long usedId) {		
//		return userService.getUserById(usedId);
//	}
	
	@GetMapping("/{id}")
	public ResponseTemplateVO getUserWithDepartment(@PathVariable(value = "id") Long usedId) {
	
		return userService.getUserWithDepartment(usedId);
	}

}
