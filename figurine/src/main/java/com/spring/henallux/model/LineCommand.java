package com.spring.henallux.model;

public class LineCommand 
{
	private int nbFigurine;
	private double prizeCommand;
	private Promotion promotion;
	
	public LineCommand()
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
	
	public Promotion getPromotion()
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
	
	public void setPromotion(Promotion pr)
	{
		promotion = pr;
	}
}
