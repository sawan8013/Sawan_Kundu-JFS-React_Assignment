package com.example.demo.Controller;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.model.Customer;

@Controller
public class ValidationController {

	@RequestMapping("/register")
	public String getform() {
		return "register.jsp";
	}
	@RequestMapping(value="result.html" , method = RequestMethod.POST)
	public ModelAndView submitForm(@Valid @ModelAttribute("customer1") Customer customer1, BindingResult result ) {
		
		  if(result.hasErrors()) 
		  {
			  ModelAndView m1 = new ModelAndView("register.jsp");
			  //System.out.print(result);
			  return m1; 
		  }
		 
		
		ModelAndView m1 = new ModelAndView("view.jsp");
		m1.addObject("msg", "Details Submitted by you. ");
		return m1;
		
	}
	
}
