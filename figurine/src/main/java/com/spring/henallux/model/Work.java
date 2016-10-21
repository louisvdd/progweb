package com.spring.henallux.model;

import java.util.Date;

public class Work 
{
	private int idWork; //traduction de oeuvre
	private String nameWork;
	private Date dateOut;
	private String producer;
	
	public Work()
	{
		
	}
	
	//GETTERS ==============================================
	public int getIdWork()
	{
		return idWork;
	}
	
	public String getNameWork()
	{
		return nameWork;
	}
	
	public Date getDateOut()
	{
		return dateOut;
	}
	
	public String getProducer()
	{
		return producer;
	}
	//SETTERS ==============================================
	public void setNameWork(String n)
	{
		nameWork = n;
	}
	
	public void setDateOut(Date d)
	{
		dateOut = d;
	}
	
	public void setProducer(String p)
	{
		producer = p;
	}
}
