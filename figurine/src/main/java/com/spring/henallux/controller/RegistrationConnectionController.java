package com.spring.henallux.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.spring.henallux.dataAccess.dao.UserDAO;
import com.spring.henallux.model.*;

@Controller
@RequestMapping(value="/registrationConnection")
@SessionAttributes(RegistrationConnectionController.CURRENTUSER)
public class RegistrationConnectionController 
{
	@Autowired
	private UserDAO userDAO;
	
	protected static final String CURRENTUSER = "currentUser";
	
	@ModelAttribute(CURRENTUSER)
	public User user()
	{
		return new User();
	}
	@RequestMapping(method=RequestMethod.GET)
	public String home(Model model)
	{
		model.addAttribute("connection", new User());
		model.addAttribute("registration", new User());
		return "integrated:registrationConnection";
	}
	//Bouton pour la CONNEXION=====================================
	@RequestMapping(value="/connection", method=RequestMethod.POST)
	public String getFormConnectionData(Model model,@Valid @ModelAttribute(value=CURRENTUSER) User userConnection, final BindingResult errors)
	{
		String userName = userConnection.getIdUser();
		String userPassword = userConnection.getPassword();
		
		ArrayList <User> users = userDAO.getUsers();
		int i = 0;
		
		while(i < users.size()-1 && users.get(i).getIdUser().equals(userName)==false)
		{
			i++;
		}	
		
		if(users.get(i).getIdUser().equals(userName) && users.get(i).getPassword().equals(userPassword))
		//if(userDAO.getUsers().contains(userName) && userDAO.getUsers().contains(userPassword))
			return "redirect:/userConnection";
		
		return "redirect:/errorConnection";
	}
	
	//Bouton pour l'INSCRIPTION====================================
	@RequestMapping(value="/registration", method=RequestMethod.POST)
	public String getFormRegistrationData(Model model, @ModelAttribute(value="registration") User userRegistration)
	{
		userDAO.save(userRegistration);
		return "redirect:/userRegistration";
	}
}
