package com.spring.henallux.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.henallux.model.User;
import com.spring.henallux.service.*;


@Controller
@RequestMapping(value="/basket")
public class BasketController 
{
	@Autowired
	private CommandLinesService commandLinesService;
	
	@Autowired
	private CommandsService commandsService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String home(Model model)
	{
		model.addAttribute("command",commandsService.getCommand());
		model.addAttribute("commandLines",commandLinesService.getCommandLines());
		model.addAttribute("command", new User());
		return "integrated:basket";
	}
	
	//Bouton pour la COMMANDE===============================================
	@RequestMapping(value="/command", method=RequestMethod.POST)
	public String getFormCommandData(Model model, @ModelAttribute(value="command") User userCommand)
	{
		return "integrated:userCommand";
	}
}
