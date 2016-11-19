package com.spring.henallux.dataAccess.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name="language")
public class LanguageEntity 
{
	@Id
<<<<<<< HEAD
=======
	@NotNull
	@Min(1)
	@Max(1000)
>>>>>>> branch 'master' of https://github.com/louisvdd/progweb.git
	@Column(name="idlanguage")
	private int idLanguage;
	
	@NotNull
	@Size(min=5, max=30)
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

