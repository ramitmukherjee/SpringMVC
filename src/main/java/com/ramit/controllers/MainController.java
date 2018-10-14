package com.ramit.controllers;


import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String defaultView (
			@RequestParam(name="name", defaultValue="World") String name,
			Model model) {
		System.out.println("Inside Main Controller");
		System.out.println("Path Variable: " + name);
		
		model.addAttribute("name", name);
		model.addAttribute("now", new Date());
		
		return "home";
	}
	
}
