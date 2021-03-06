package com.spring.henallux.model;

import java.util.Date;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.*;


public class Command 
{
	@Min(1)
	@Max(1000)
	@NotNull
	private int idCommand;
	
	@NotNull
	@Past
	private Date dateCommand;
	
	@NotNull
	private User user;
	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getIdCommand() 
	{
		return idCommand;
	}
	
	public void setIdCommand(int idCommand) 
	{
		this.idCommand = idCommand;
	}
	
	public Date getDateCommand() 
	{
		return dateCommand;
	}
	
	public void setDateCommand(Date dateCommand) 
	{
		this.dateCommand = dateCommand;
	}
}
