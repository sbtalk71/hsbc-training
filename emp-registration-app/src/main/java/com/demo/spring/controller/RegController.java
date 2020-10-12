package com.demo.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hsbc.tr.spring.entity.Emp;

@Controller
public class RegController {

	@RequestMapping(path = "/reg", method = RequestMethod.GET)
	public String getRegpage(Model model) {
		Emp e= new Emp();
		model.addAttribute("empData", e);
		return "register";
	}

	/*
	 * @RequestMapping(path = "/reg", method = RequestMethod.POST) public
	 * ModelAndView registerEmp(@RequestParam("empId") int id, @RequestParam("name")
	 * String name,
	 * 
	 * @RequestParam("city") String city, @RequestParam("salary") double salary) {
	 * ModelAndView mv = new ModelAndView();
	 * 
	 * mv.setViewName("success"); HashMap<String, String> emp = new HashMap<>();
	 * emp.put("empId", id + ""); emp.put("name", name); emp.put("city", city);
	 * emp.put("salary", salary + ""); mv.addObject("emp",emp); return mv; }
	 */
	
	/*
	 * @RequestMapping(path = "/reg", method = RequestMethod.POST,consumes =
	 * MediaType.APPLICATION_FORM_URLENCODED_VALUE) public ModelAndView
	 * registerEmp(Emp e) { ModelAndView mv = new ModelAndView();
	 * 
	 * mv.setViewName("success");
	 * 
	 * mv.addObject("emp",e); return mv; }
	 */
	
	@RequestMapping(path = "/reg", method = RequestMethod.POST)
	public ModelAndView registerEmp(@ModelAttribute("empData")Emp e) {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("success");
		
		mv.addObject("emp",e);
		return mv;
	}
}
