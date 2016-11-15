package com.spring.henallux.dataAccess.entity;

import javax.persistence.*;

import com.spring.henallux.model.Promotion;

@Entity
@Table(name="CommandLine")
public class CommandLineEntity 
{
	@Id
	@Column(name="nbFigurine")
	private int nbFigurine;
	
	@Column(name="prizeCommand")
	private double prizeCommand;
	
	@Column(name="promotion")
	private Promotion promotion;

	public int getNbFigurine() {
		return nbFigurine;
	}

	public void setNbFigurine(int nbFigurine) {
		this.nbFigurine = nbFigurine;
	}

	public double getPrizeCommand() {
		return prizeCommand;
	}

	public void setPrizeCommand(double prizeCommand) {
		this.prizeCommand = prizeCommand;
	}

	public Promotion getPromotion() {
		return promotion;
	}

	public void setPromotion(Promotion promotion) {
		this.promotion = promotion;
	}
	
	
}

