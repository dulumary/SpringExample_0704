package com.marondal.ex.jsp.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marondal.ex.jsp.dao.UserDAO;

@Service
public class UserBO {
	
	@Autowired
	private UserDAO userDAO;
	
	public int addUser(String name, String yyyymmdd, String introduce, String email) {
		return userDAO.insertUser(name, yyyymmdd, introduce, email);
	}

}
