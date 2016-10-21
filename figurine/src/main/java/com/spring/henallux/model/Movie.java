package com.spring.henallux.model;

public class Movie extends Work
{
	private String director;
	
	public Movie()
	{
		super();
	}
	
	//GETTERS =====================================================
	public String getDirector()
	{
		return director;
	}
	
	//SETTERS =====================================================
	public void setDirector(String d)
	{
		director = d;
	}
}
