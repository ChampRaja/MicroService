package com.microservice.departement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.departement.entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {

}
