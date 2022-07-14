package com.marondal.ex.jsp.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marondal.ex.jsp.dao.UserDAO;
import com.marondal.ex.jsp.model.User;

@Service
public class UserBO {
	
	@Autowired
	private UserDAO userDAO;
	
	public int addUser(String name, String yyyymmdd, String introduce, String email) {
		return userDAO.insertUser(name, yyyymmdd, introduce, email);
	}
	
	public int addUserWithId(User user) {
//		// 객체로 insert
//		User user = new User();
//		user.setName(name);
//		user.setYyyymmdd(yyyymmdd);
//		user.setIntroduce(introduce);
//		user.setEmail(email);
//		
		return userDAO.insertUserWithId(user);
		
	}
	
	
	// 가장 최신 등록된 사용자 정보 
	public User getLastUser() {
		return userDAO.selectLastUser();
	}

}
