package com.sts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstControllerSts {
	
	
	@RequestMapping("/first")
	@ResponseBody
	public String firstController() {
		
		return "this is my first controller in STS";
	}

}
