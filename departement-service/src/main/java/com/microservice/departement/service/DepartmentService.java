package com.microservice.departement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.departement.entity.Department;
import com.microservice.departement.repository.DepartmentRepo;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepo deptRepo;

	public Department saveDepartment(Department department) {
		return deptRepo.save(department);
	}

	public Department findDepartmentById(Long departmentId) {
		return deptRepo.getOne(departmentId);
	}

}
