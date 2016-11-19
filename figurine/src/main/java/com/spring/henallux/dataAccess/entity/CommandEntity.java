package com.spring.henallux.dataAccess.entity;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name="command")
public class CommandEntity 
{
	@Id
<<<<<<< HEAD
=======
	@Min(1)
	@Max(1000)
	@NotNull
>>>>>>> branch 'master' of https://github.com/louisvdd/progweb.git
	@Column(name="idcommand")
	private int idCommand;
	
<<<<<<< HEAD
=======
	@NotNull
	@Past
>>>>>>> branch 'master' of https://github.com/louisvdd/progweb.git
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

