package com.ramit.controllers;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController {

	@RequestMapping(value="/pageNotFound")
	public String pageNotFoundHandler (HttpServletRequest request, Model model) {
		System.out.println("Inside Error Handler");
		model.addAttribute(
				"errorCode", request.getAttribute("javax.servlet.error.status_code"));
		model.addAttribute(
				"errorMessage", request.getAttribute("javax.servlet.error.message"));
		
		return "error-page";
	}
	
}
