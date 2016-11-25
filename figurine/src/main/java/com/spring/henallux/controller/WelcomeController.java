package com.spring.henallux.controller;

//import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.henallux.dataAccess.dao.FigurineDAO;
import com.spring.henallux.model.Figurine;
import com.spring.henallux.service.FigurinesService;

@Controller
@RequestMapping(value="/welcome")
public class WelcomeController 
{
	@Autowired
	private MessageSource messageSource;
	
	@Autowired
	private FigurineDAO figurinesDAO;
	
	@RequestMapping(method=RequestMethod.GET)
	public String home(Model model)
	{
		model.addAttribute("figurineAll", figurinesDAO.getAllFigurines());
		model.addAttribute("addBasket", new Figurine());
		return "integrated:welcome";
	}
	
	//Bouton pour la AJOUTER PANIER===============================================
	@RequestMapping(value="/addBasket", method=RequestMethod.POST)
	public String getFormCommandData(Model model, @ModelAttribute(value="addBasket") Figurine figurineBasket)
	{
		return "redirect:/userCommand";
	}
	
}
