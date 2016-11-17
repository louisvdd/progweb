package com.spring.henallux.dataAccess.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name="translationcategory")
public class TranslationCategoryEntity 
{
	@Id
	@NotNull
	@Size(min=5, max=30)
	@Column(name="name")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

