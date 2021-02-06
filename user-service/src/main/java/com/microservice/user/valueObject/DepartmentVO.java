package com.microservice.user.valueObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//We don't need entity here, just the simple POJOs
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentVO {
	
	public Long departementId;
	public String departmentName;
	public String departmentAddress;
	public String departmentCode;

}
