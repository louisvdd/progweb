package com.spring.henallux.dataAccess.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name="translationfigurine")
public class TranslationFigurineEntity 
{
	@Id
	@NotNull
	@Size(min=5, max=30)
	@Column(name="name")
	private String name;
	
	@NotNull
	@Size(min=10, max=300)
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

