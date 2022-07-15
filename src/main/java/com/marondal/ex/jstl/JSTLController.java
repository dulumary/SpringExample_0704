package com.marondal.ex.jstl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.marondal.ex.jsp.model.User;

@Controller
public class JSTLController {
	
	@GetMapping("/jstl/ex01")
	public String ex01() {
		
		return "jstl/ex01";
	}
	
	@GetMapping("/jstl/ex02")
	public String ex02(Model model) {
		
		// 과일이름 리스트 
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("melon");
		fruits.add("peach");
		fruits.add("mango");
		
		model.addAttribute("data", fruits);
		
		List<User> userList = new ArrayList<>();
		
		User user1 = new User();
		user1.setName("김인규");
		user1.setYyyymmdd("20120325");
		user1.setEmail("lecture@hagulu.com");
		userList.add(user1);
		
		User user2 = new User();
		user2.setName("유재석");
		user2.setYyyymmdd("20020511");
		user2.setEmail("yu@hagulu.com");
		userList.add(user2);
		
		model.addAttribute("userList", userList);
		
		return "jstl/ex02";
	}
	
	

}
