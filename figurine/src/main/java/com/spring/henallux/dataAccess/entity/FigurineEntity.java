package com.spring.henallux.dataAccess.entity;

import javax.persistence.*;

@Entity
@Table(name="figurine")
public class FigurineEntity 
{
	@Id
	@Column(name="idFigurine")
	private int idFigurine;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="size")
	private double size;
	
	@Column(name="weight")
	private double weight;
	
	@Column(name="brand")
	private String brand;
	
	@Column(name="painting")
	private boolean painting;
	
	@Column(name="nbStock")
	private int nbStock;
	
	@Column(name="cost")
	private double cost;

	public int getIdFigurine() {
		return idFigurine;
	}

	public void setIdFigurine(int idFigurine) {
		this.idFigurine = idFigurine;
	}

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

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public boolean isPainting() {
		return painting;
	}

	public void setPainting(boolean painting) {
		this.painting = painting;
	}

	public int getNbStock() {
		return nbStock;
	}

	public void setNbStock(int nbStock) {
		this.nbStock = nbStock;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
}

