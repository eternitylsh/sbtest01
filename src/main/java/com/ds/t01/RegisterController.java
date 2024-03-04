package com.ds.t01;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ds.t01.user.User;

@Controller
public class RegisterController {
	@GetMapping("/register")
    @ResponseBody
    public String Register() {
		User user = new User("asdf", "1234", "xxx", "xxx@eee.com", new Date(), "fb", new Date());
		
		return "Test Register" + user.toString();
	}
}
