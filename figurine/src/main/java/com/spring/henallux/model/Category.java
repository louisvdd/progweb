package com.spring.henallux.model;

import java.util.Date;

public class Category 
{
	private int idCategory;
	private String name;
	private Date dateOut;
	private String producer;
	
	public int getIdCategory() 
	{
		return idCategory;
	}
	
	public void setIdCategory(int idCategory) 
	{
		this.idCategory = idCategory;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public Date getDateOut() 
	{
		return dateOut;
	}
	
	public void setDateOut(Date dateOut) 
	{
		this.dateOut = dateOut;
	}
	
	public String getProducer() 
	{
		return producer;
	}
	
	public void setProducer(String producer) 
	{
		this.producer = producer;
	}
	
}
