package com.spring.henallux.dataAccess.entity;

import javax.persistence.*;

@Entity
@Table(name="TranslationFigurine")
public class TranslationFigurineEntity 
{
	@Id
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}

