package com.spring.henallux.dataAccess.entity;

import javax.persistence.*;

@Entity
@Table(name="language")
public class LanguageEntity 
{
	@Id
	@Column(name="idlanguage")
	private int idLanguage;
	
	@Column(name="name")
	private String name;

	public int getIdLanguage() 
	{
		return idLanguage;
	}

	public void setIdLanguage(int idLanguage) 
	{
		this.idLanguage = idLanguage;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	
}

