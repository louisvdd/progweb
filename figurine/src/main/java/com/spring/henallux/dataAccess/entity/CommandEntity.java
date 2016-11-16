package com.spring.henallux.dataAccess.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="command")
public class CommandEntity 
{
	@Id
	@Column(name="idCommand")
	private int idCommand;
	
	@Column(name="dateCommand")
	private Date dateCommand;

	public int getIdCommand() {
		return idCommand;
	}

	public void setIdCommand(int idCommand) {
		this.idCommand = idCommand;
	}

	public Date getDateCommand() {
		return dateCommand;
	}

	public void setDateCommand(Date dateCommand) {
		this.dateCommand = dateCommand;
	}
	
	
}

