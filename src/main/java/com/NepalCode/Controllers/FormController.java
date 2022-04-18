package com.NepalCode.Controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
	
	@RequestMapping("/form")
	public String formFill(HttpServletRequest request ,Model model) {
		
		// sending data to view
		String heading = "Welcome to my login page";
		model.addAttribute("Myheading", heading);
		return "formPage";
	}
	
	@RequestMapping("/loginprocess")
	public String loginProcessPage(HttpServletRequest request ,Model model) {
		// handle data received from user
				String uName = request.getParameter("username");
				String uPass = request.getParameter("password");
				
				// adding the capture value to model and set the userdata with model 
				model.addAttribute("username", uName);
				model.addAttribute("password", uPass);
				
				// send the model data to view 
		return "login-process";
	}
	
	

}
