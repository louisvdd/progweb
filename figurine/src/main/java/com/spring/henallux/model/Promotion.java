package com.spring.henallux.model;

import java.util.Date;

public class Promotion 
{
	private int idPromotion;
	private double amountPourc;
	private Date dateBegin;
	private Date dateEnd;
	
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
	
	public Date getDateBegin()
	{
		return dateBegin;
	}
	
	public Date getDateEnd()
	{
		return dateEnd;
	}
	
	//SETTERS =====================================================
	public void setAmountPourc(double a)
	{
		amountPourc = a;
	}
	
	public void setDateBegin(Date db)
	{
		dateBegin = db;
	}
	
	public void setDateEnd(Date de)
	{
		dateEnd = de;
	}
}
