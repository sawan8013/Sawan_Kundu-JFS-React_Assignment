package com.simpleinterest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerOfSimpleInterest {
	@RequestMapping("/")
	public String getform() {
		return "simpleInterest";
	}
	
	@RequestMapping(value="result.html" , method = RequestMethod.POST)
	public ModelAndView submitForm(@RequestParam("principalAmount") int p , 
			@RequestParam("noOfYears") int t, @RequestParam("rateOfInterest") int r ) {
		
		ModelAndView m1 = new ModelAndView("submitResult");
		double interset = (p*r*t)/100;
		m1.addObject("msg", "Simple Interest is :"+ interset);
		return m1;
		
	}
}
