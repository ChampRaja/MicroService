package com.microservice.departement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.departement.entity.Department;
import com.microservice.departement.service.DepartmentService;

@RestController
@RequestMapping("/departments")

public class DepartmentController {

	@Autowired
	private DepartmentService deptService;

	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		
		return deptService.saveDepartment(department);
	}
	
	@GetMapping("/{id}")
	public Department findDepartmentById(@PathVariable(value="id") Long departmentId) {
		
		return deptService.findDepartmentById(departmentId);
		
	}
}
