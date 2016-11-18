package com.spring.henallux.dataAccess.entity;

import javax.persistence.*;

@Entity
@Table(name="translationfigurine")
public class TranslationFigurineEntity 
{
	@Id
	@Column(name="idTranslationfigurine")
	private int idTranslationFigurine;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="figurine")
	private int figurine;
	
	@Column(name="language")
	private int language;

	public String getName() 
	{
		return name;
	}

	public int getIdTranslationFigurine() 
	{
		return idTranslationFigurine;
	}

	public void setIdTranslationFigurine(int idTranslationFigurine) 
	{
		this.idTranslationFigurine = idTranslationFigurine;
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
	
}

