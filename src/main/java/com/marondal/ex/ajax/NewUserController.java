package com.marondal.ex.ajax;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marondal.ex.ajax.bo.NewUserBO;
import com.marondal.ex.ajax.model.NewUser;

@Controller
@RequestMapping("/ajax/user")
public class NewUserController {
	
	@Autowired
	private NewUserBO newUserBO;
	
	// new_user 테이블 결과 보기 
	@GetMapping("/list")
	public String userList(Model model) {
		
		List<NewUser> userList = newUserBO.getUserList();
		
		model.addAttribute("userList", userList);
		
		return "ajax/userList";
	}
	
	// 이름, 생년월일, 자기소개, 이메일 전달 받고 저장
	@PostMapping("/insert")
	@ResponseBody
	public Map<String, String> addUser(
			@RequestParam("name") String name
			, @RequestParam("birthday") String birthday
			, @RequestParam("introduce") String introduce
			, @RequestParam("email") String email) {
		
		int count = newUserBO.addUser(name, birthday, introduce, email);
		// {"result":"success"}
		
		Map<String, String> result = new HashMap<>();
		
		if(count == 1) {
			// 정상 상태
			// {"result":"success"}
			result.put("result", "success");
			 
		} else {
			// 문제 상태 
			// {"result":"fail"}
			result.put("result", "fail");
		}
		
		return result;
		
	}
	
	@GetMapping("/input")
	public String userInput() {
		return "ajax/userInput";
	}
	@GetMapping("/is_duplicate")
	@ResponseBody
	public Map<String, Boolean> isDuplicate(@RequestParam("name") String name) {
		
		Map<String, Boolean> result = new HashMap<>();
		
//		if(newUserBO.isDuplicateName(name)) {
//			// 중복된 상태
//			// {"is_duplicate": true }
//			result.put("is_duplicate", true);
//			
//			
//		} else {
//			// 중복되지 않은 상태
//			// {"is_duplicate": false }
//			result.put("is_duplicate", false);	
//		}
		
		result.put("is_duplicate", newUserBO.isDuplicateName(name));
		return result;
		
		
		
		
		
	}

}
