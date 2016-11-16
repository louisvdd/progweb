package com.spring.henallux.dataAccess.entity;

import javax.persistence.*;

@Entity
@Table(name="translationcategory")
public class TranslationCategoryEntity 
{
	@Id
	@Column(name="name")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

