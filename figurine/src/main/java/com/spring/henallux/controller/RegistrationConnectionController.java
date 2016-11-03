package com.spring.henallux.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.henallux.model.*;

@Controller
@RequestMapping(value="/registrationConnection")
public class RegistrationConnectionController 
{
	@RequestMapping(method=RequestMethod.GET)
	public String home(Model model)
	{
		model.addAttribute("connection", new User());
		model.addAttribute("registration", new User());
		return "integrated:registrationConnection";
	}
	//Bouton pour la CONNEXION=====================================
	@RequestMapping(value="/connection", method=RequestMethod.POST)
	public String getFormConnectionData(Model model, @ModelAttribute(value="connection") User userConnection)
	{
		//Prend pas en compte les valeurs noté, elles seront égale à null! Pourquoi?
		if(userConnection.getPassword().equals("1234") && userConnection.getIdUser().equals("damien"))
			return "integrated:userConnection";
		
		System.out.println(userConnection.getIdUser()+" "+userConnection.getPassword());
		return "integrated:errorConnection";
	}
	
	//Bouton pour l'INSCRIPTION====================================
	@RequestMapping(value="/registration", method=RequestMethod.POST)
	public String getFormRegistrationData(Model model, @ModelAttribute(value="registration") User userConnection)
	{
		return "integrated:userRegistration";
		//normalement c'est redirect:/userRegistration mais ça ne fonctionne pas
	}
}
