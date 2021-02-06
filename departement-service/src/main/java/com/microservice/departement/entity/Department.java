package com.microservice.departement.entity;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Departments")
@EntityListeners(AuditingEntityListener.class)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long departementId;
	public String departmentName;
	public String departmentAddress;
	public String departmentCode;

	/*
	 * public Long getDepartementId() { return departementId; }
	 * 
	 * public void setDepartementId(Long departementId) { this.departementId =
	 * departementId; }
	 * 
	 * public String getDepartmentName() { return departmentName; }
	 * 
	 * public void setDepartmentName(String departmentName) { this.departmentName =
	 * departmentName; }
	 * 
	 * public String getDepartmentAddress() { return departmentAddress; }
	 * 
	 * public void setDepartmentAddress(String departmentAddress) {
	 * this.departmentAddress = departmentAddress; }
	 * 
	 * public String getDepartmentCode() { return departmentCode; }
	 * 
	 * public void setDepartmentCode(String departmentCode) { this.departmentCode =
	 * departmentCode; }
	 */


}
