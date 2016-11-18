package com.spring.henallux.model;

public class CommandLine 
{
	private int idCommandeLine;
	private int nbFigurine;
	private double prizeCommand;
	private int promotion;
	private int figurine;
	private int command;
	
	public CommandLine()
	{
		
	}

	public int getIdCommandeLine() 
	{
		return idCommandeLine;
	}

	public void setIdCommandeLine(int idCommandeLine) 
	{
		this.idCommandeLine = idCommandeLine;
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
}
