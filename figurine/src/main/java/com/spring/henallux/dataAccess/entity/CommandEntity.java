package com.spring.henallux.dataAccess.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="command")
public class CommandEntity 
{
	@Id
	@Column(name="idcommand")
	private int idCommand;
	
	@Column(name="datecommand")
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

	public void setDateCommand(Date dateCommand) {
		this.dateCommand = dateCommand;
	}
	
	
}

