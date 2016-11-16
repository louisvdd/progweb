package com.spring.henallux.dataAccess.entity;

import javax.persistence.*;

import com.spring.henallux.model.Promotion;

@Entity
@Table(name="commandline")
public class CommandLineEntity 
{
	@Id
	@Column(name="nbFigurine")
	private int nbFigurine;
	
	@Column(name="prizeCommand")
	private double prizeCommand;
	
	@Column(name="promotion")
	private int promotion;

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

	public int getPromotion() {
		return promotion;
	}

	public void setPromotion(int promotion) {
		this.promotion = promotion;
	}
	
	
}

