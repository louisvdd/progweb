package com.spring.henallux.dataAccess.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name="translationfigurine")
public class TranslationFigurineEntity 
{
	@Id
<<<<<<< HEAD
	@Column(name="idTranslationfigurine")
	private int idTranslationFigurine;
	
=======
	@NotNull
	@Size(min=5, max=30)
>>>>>>> branch 'master' of https://github.com/louisvdd/progweb.git
	@Column(name="name")
	private String name;
	
	@NotNull
	@Size(min=10, max=300)
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

