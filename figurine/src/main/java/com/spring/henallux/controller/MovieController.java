package com.spring.henallux.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.henallux.model.*;

@Controller
@RequestMapping(value="/movie")
public class MovieController 
{
	@RequestMapping(method=RequestMethod.GET)
	public String home(Model model)
	{
		model.addAttribute("addBasket", new Figurine());
		return "integrated:movie";
	}
	
	//Bouton pour la AJOUTER PANIER===============================================
	@RequestMapping(value="/addBasket", method=RequestMethod.POST)
	public String getFormCommandData(Model model, @ModelAttribute(value="addBasket") Figurine figurineBasket)
	{
		return "integrated:userCommand";
	}
}
