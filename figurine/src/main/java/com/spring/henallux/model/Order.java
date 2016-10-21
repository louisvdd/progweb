package com.spring.henallux.model;

import java.util.Date;

public class Order 
{
	private int idOrder;
	private Date dateOrder;
	
	public Order()
	{
		
	}
	
	//GETTERS =====================================================
	public int getIdOrder()
	{
		return idOrder;
	}
	
	public Date getDateOrder()
	{
		return dateOrder;
	}
	
	//SETTERS =====================================================
	public void setDateOrder(Date d)
	{
		dateOrder = d;
	}
}
