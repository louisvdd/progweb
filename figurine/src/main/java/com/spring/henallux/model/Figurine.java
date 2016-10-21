package com.spring.henallux.model;

public class Figurine 
{
	private int idFigurine;
	private String name;
	private double weight;
	private double size;
	private boolean painting;
	private int nbStock;
	private double cost;
	
	public Figurine()
	{
		
	}
	
	//GETTERS ================================================================
	public int getIdFigurine()
	{
		return idFigurine;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public double getSize()
	{
		return size;
	}
	
	public boolean getPainting()
	{
		return painting;
	}
	
	public int getNbStock()
	{
		return nbStock;
	}
	
	public double getCost()
	{
		return cost;
	}
	
	
	//SETTER ==================================================================
	public void setName(String n)
	{
		name = n;
	}
	
	public void setWeight(double w)
	{
		weight = w;
	}
	
	public void setSize(double s)
	{
		size = s;
	}
	
	public void setPainting(boolean p)
	{
		painting = p;
	}
	
	public void setNbStock(int nb)
	{
		nbStock = nb;
	}
	
	public void setCost(double c)
	{
		cost = c;
	}
}
