package com.spring.henallux.model;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

public class Command 
{
	@Min(1)
	@Max(1000)
	@NotNull
	private int idCommand;
	
	@NotNull
	@Past
	private Date dateCommand;
	
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
