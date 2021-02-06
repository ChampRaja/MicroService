package com.microservice.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservice.user.entity.User;
import com.microservice.user.repository.UserRepository;
import com.microservice.user.valueObject.DepartmentVO;
import com.microservice.user.valueObject.ResponseTemplateVO;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;

	// With this rest template we will call the department
	// service and will call the department object
	@Autowired
	private RestTemplate restTemplate;

	public User save(User user) {
		return userRepo.save(user);
	}

	public User getUserById(Long usedId) {
		return userRepo.getOne(usedId);
	}

	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		ResponseTemplateVO vo = new ResponseTemplateVO();
		User user = userRepo.getOne(userId);

		DepartmentVO department = restTemplate
				.getForObject("http://localhost:9001/departments/" + user.getDepartmentId(), DepartmentVO.class);

		vo.setUser(user);
		vo.setDepartmentVO(department);

		return vo;
	}
}
