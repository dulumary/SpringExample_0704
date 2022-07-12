package com.marondal.ex.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marondal.ex.jsp.bo.UserBO;

@Controller
public class UserController {
	
	@Autowired
	private UserBO userBO;
	
	// 사용자가 파라미터를 통해서 전달한 데이터로 사용자 정보 저장
	@ResponseBody
	@RequestMapping("/jsp/user/insert")
	public String addUser(
			@RequestParam("name") String name
			, @RequestParam("yyyymmdd") String yyyymmdd
			, @RequestParam(value="introduce", required=false) String introduce
			, @RequestParam(value="email", required=false) String email) {
		
		int count = userBO.addUser(name, yyyymmdd, introduce, email);
		
		return "삽입 결과 : " + count;
		
	}

}
