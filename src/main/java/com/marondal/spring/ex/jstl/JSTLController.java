package com.marondal.spring.ex.jstl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JSTLController {
	
	@GetMapping("/jstl/ex01")
	public String ex01() {
		return "jstl/ex01";
	}

}
