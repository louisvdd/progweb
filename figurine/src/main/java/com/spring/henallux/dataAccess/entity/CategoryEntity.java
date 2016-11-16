package com.spring.henallux.dataAccess.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="category")
public class CategoryEntity 
{
	@Id
	@Column(name="idCategory")
	private int idCategory;
	
	@Column(name="name")
	private String name;	
	
	@Column(name="dateOut")
	private Date dateOut;
	
	@Column(name="producer")
	private String producer;

	public int getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOut() {
		return dateOut;
	}

	public void setDateOut(Date dateOut) {
		this.dateOut = dateOut;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}
	
	
}

