package com.spring.henallux.model;

public class Promotion 
{
	private int idPromotion;
	private double amountPourc;
	
	public Promotion()
	{
		
	}
	
	//GETTERS =====================================================
	public int getIdPromotion()
	{
		return idPromotion;
	}
	
	public double amountPourc()
	{
		return amountPourc;
	}
	
	//SETTERS =====================================================
	public void setAmountPourc(double a)
	{
		amountPourc = a;
	}
}
