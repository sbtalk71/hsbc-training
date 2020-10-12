package com.demo.spring.controller;

import java.util.Date;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String getLoginPage() {
		return "login";
	}

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public ModelAndView processLogin(@RequestParam("username") String user, @RequestParam("password") String pwd) {
		ModelAndView mv = new ModelAndView();
		if (user.equals(pwd)) {
			mv.setViewName("success");
			HashMap<String, String> data=new HashMap<>();
			data.put("user", user);
			data.put("date", new Date().toString());
			
			mv.addObject("data", data);
		} else {
			mv.setViewName("failure");
		}
		return mv;
	}
}
