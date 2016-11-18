package com.spring.henallux.model;

public class TranslationFigurine 
{
	private int idTranslationFigurine;
	private String name;
	private String description;
	private int figurine;
	private int language;
	
	public int getIdTranslationFigurine() 
	{
		return idTranslationFigurine;
	}
	public void setIdTranslationFigurine(int idTranslationFigurine) 
	{
		this.idTranslationFigurine = idTranslationFigurine;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getDescription() 
	{
		return description;
	}
	public void setDescription(String description) 
	{
		this.description = description;
	}
	public int getFigurine() 
	{
		return figurine;
	}
	public void setFigurine(int figurine) 
	{
		this.figurine = figurine;
	}
	public int getLanguage() 
	{
		return language;
	}
	public void setLanguage(int language) 
	{
		this.language = language;
	}
}
