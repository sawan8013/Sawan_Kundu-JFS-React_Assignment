package com.usermodel1;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	@RequestMapping("/")
	public String getform() {
		return "Details";
	}
	
	@RequestMapping(value="result.html" , method = RequestMethod.POST)
	public ModelAndView submitForm(@ModelAttribute("username1") UserName username1  , BindingResult result) {
		
		if(username1.pass.length()<=3) {
			ModelAndView m1 = new ModelAndView("Error");
			return m1;
		}
		
		ModelAndView m1 = new ModelAndView("Success");
		//m1.addObject("msg", "Details Submitted by you: ");
		return m1;
		
	}
}
