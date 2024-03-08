package com.ds.t01;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RegisterController {
	
	@GetMapping("/register")
    @ResponseBody
    public String Register() {
		// User_info2 user = new User_info2("asdf", "1234", "xxx", "xxx@eee.com", new Date(), "fb", new Date());
		
		return "Test Register"; //+ user.toString();
//		return "";
	}
}
