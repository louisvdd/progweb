package com.spring.henallux.model;

public class TranslationCategory 
{
	private int idTranslationCategory;
	private String name;
	private int language;
	private int category;
	
	public int getIdTranslationCategory() 
	{
		return idTranslationCategory;
	}
	public void setIdTranslationCategory(int idTranslationCategory) 
	{
		this.idTranslationCategory = idTranslationCategory;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getLanguage() 
	{
		return language;
	}
	public void setLanguage(int language) 
	{
		this.language = language;
	}
	public int getCategory() 
	{
		return category;
	}
	public void setCategory(int category) 
	{
		this.category = category;
	}
}
