package com.spring.henallux.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.henallux.model.*;

@Controller
@RequestMapping(value="/registration")
public class RegistrationController 
{
	@RequestMapping(method=RequestMethod.GET)
	public String home(Model model)
	{
		model.addAttribute("user", new User());
		return "integrated:registration";
	}
	
	@RequestMapping(value="/connection", method=RequestMethod.POST)
	public String getFormData(Model model, @ModelAttribute(value="user") User userConnection)
	{
		//Prend pas en compte les valeurs noté, elles seront égale à null! Pourquio?
		if(userConnection.getPassword().equals("1234") && userConnection.getIdUser().equals("damien"))
			return "integrated:userConnection";
		
		System.out.println(userConnection.getIdUser()+" "+userConnection.getPassword());
		return "integrated:errorConnection";
	}
}
