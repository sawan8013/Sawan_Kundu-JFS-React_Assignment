package com.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {
	@RequestMapping("hello")
	public @ResponseBody String getHello() {
		return "Hello World";
		
	}
}
