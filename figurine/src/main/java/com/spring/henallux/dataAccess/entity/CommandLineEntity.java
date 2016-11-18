package com.spring.henallux.dataAccess.entity;

import javax.persistence.*;

@Entity
@Table(name="commandline")
public class CommandLineEntity 
{
	@Id
	@Column(name="idcommandline")
	private int idCommandeLine;
	
	@Column(name="nbfigurine")
	private int nbFigurine;
	
	@Column(name="prizecommand")
	private double prizeCommand;
	
	@Column(name="promotion")
	private int promotion;
	
	@Column(name="figurine")
	private int figurine;
	
	@Column(name="command")
	private int command;

	public int getIdCommandeLine() 
	{
		return idCommandeLine;
	}

	public void setIdCommandeLine(int idCommandeLine) 
	{
		this.idCommandeLine = idCommandeLine;
	}

	public int getFigurine() 
	{
		return figurine;
	}

	public void setFigurine(int figurine) 
	{
		this.figurine = figurine;
	}

	public int getCommand() 
	{
		return command;
	}

	public void setCommand(int command) 
	{
		this.command = command;
	}

	public int getNbFigurine() 
	{
		return nbFigurine;
	}

	public void setNbFigurine(int nbFigurine) 
	{
		this.nbFigurine = nbFigurine;
	}

	public double getPrizeCommand() 
	{
		return prizeCommand;
	}

	public void setPrizeCommand(double prizeCommand) 
	{
		this.prizeCommand = prizeCommand;
	}

	public int getPromotion() 
	{
		return promotion;
	}

	public void setPromotion(int promotion) 
	{
		this.promotion = promotion;
	}
	
	
}

