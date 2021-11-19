package com.customer;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller 
public class CustomerController {
	@RequestMapping("/")
	public String getform() {
		return "register";
	}
	
	@RequestMapping(value="result.html" , method = RequestMethod.POST)
	public ModelAndView submitForm(@Valid @ModelAttribute("customer1") Customer customer1, BindingResult result ) {
		
		  if(result.hasErrors()) 
		  {
			  ModelAndView m1 = new ModelAndView("register");
			  return m1; 
		  }
		 
		
		ModelAndView m1 = new ModelAndView("view");
		m1.addObject("msg", "Details Submitted by you ");
		return m1;
		
	}
}
