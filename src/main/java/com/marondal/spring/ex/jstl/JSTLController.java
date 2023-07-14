package com.marondal.spring.ex.jstl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/jstl")
@Controller
public class JSTLController {
	
	@GetMapping("/ex01")
	public String ex01() {
		return "jstl/ex01";
	}
	
	@GetMapping("/ex02")
	public String ex02(Model model) {
		
		List<String> fruitList = new ArrayList<>();
		fruitList.add("사과");
		fruitList.add("딸기");
		fruitList.add("바나나");
		
		model.addAttribute("fruitList", fruitList);
		
		// 사용자 정보 리스트 
		// 사용자 정보 : 이름, 나이, 취미 
		
		List<Map<String, Object>> userList = new ArrayList<>();
		
		
		Map<String, Object> user1 = new HashMap<>();
		user1.put("name", "김인규");
		user1.put("age", 26);
		user1.put("hobby", "독서");
		userList.add(user1);
		
		Map<String, Object> user2 = new HashMap<>();
		user2.put("name", "바다");
		user2.put("age", 5);
		user2.put("hobby", "사냥하기");
		userList.add(user2);
		
		model.addAttribute("userList", userList);
		
		
		
		return "jstl/ex02";
	}

}
