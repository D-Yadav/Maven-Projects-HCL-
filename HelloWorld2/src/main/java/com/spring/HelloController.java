package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public ModelAndView sayHello() {
		return new ModelAndView("resultpage","message","Welcome to The Earth");
		
	}

	@RequestMapping("/priya")
	public ModelAndView sayPriya() {
		return new ModelAndView("resultpage","message","Welcome to The Mars");
}

	@RequestMapping("/about")
	public ModelAndView sayAbout() {
		return new ModelAndView("resultpage","message","Welcome to The Neptune");	
}

	@RequestMapping("/contact")
	public ModelAndView sayContact() {
		return new ModelAndView("resultpage","message","Welcome to The Uranus");
}
}