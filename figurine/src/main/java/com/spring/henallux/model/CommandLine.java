package com.spring.henallux.model;

public class CommandLine 
{
	private int nbFigurine;
	private double prizeCommand;
	private int promotion;
	
	public CommandLine()
	{
		
	}
	
	//GETTERS =====================================================
	public int getNbFigurine()
	{
		return nbFigurine;
	}
	
	public double getPrizeCommand()
	{
		return prizeCommand;
	}
	
	public int getPromotion()
	{
		return promotion;
	}
	
	//SETTERS =====================================================
	public void setNbFigurine(int nb)
	{
		nbFigurine = nb;
	}
	
	public void setPrizeCommand(double p)
	{
		prizeCommand = p;
	}
	
	public void setPromotion(int pr)
	{
		promotion = pr;
	}
}
