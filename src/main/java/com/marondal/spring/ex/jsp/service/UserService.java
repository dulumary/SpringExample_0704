package com.marondal.spring.ex.jsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marondal.spring.ex.jsp.domain.User;
import com.marondal.spring.ex.jsp.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	// 사용자 정보를 전달 받고 저장하는 기능
	public int addUser(
			String name
			, String birthday
			, String email
			, String introduce) {
		
		int count = userRepository.insertUser(name, birthday, email, introduce);
		
		return count;
		
	}
	
	// 가장 최근 등록된 사용자 정보 얻기 
	public User getLastUser() {
		User user = userRepository.selectLastUser();
		return user;
	}

}
