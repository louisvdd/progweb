package com.spring.henallux.dataAccess.entity;

import javax.persistence.*;
<<<<<<< HEAD
=======
import javax.validation.constraints.*;
>>>>>>> branch 'master' of https://github.com/louisvdd/progweb.git

@Entity
@Table(name="commandline")
public class CommandLineEntity 
{
	@Id
<<<<<<< HEAD
	@Column(name="idcommandline")
	private int idCommandeLine;
	
=======
	@NotNull
	@Min(1)
	@Max(1000)
	@Column(name="idlinecommand")
	private int idLineCommand;
	
	@NotNull
	@Min(0)
	@Max(1000)
>>>>>>> branch 'master' of https://github.com/louisvdd/progweb.git
	@Column(name="nbfigurine")
	private int nbFigurine;
	
<<<<<<< HEAD
=======
	@NotNull
	@DecimalMin("1.00")
	@DecimalMax("10000.00")
>>>>>>> branch 'master' of https://github.com/louisvdd/progweb.git
	@Column(name="prizecommand")
	private double prizeCommand;
	
	@NotNull
	@Min(0)
	@Max(1000)
	@Column(name="promotion")
	private int promotion;
	
<<<<<<< HEAD
	@Column(name="figurine")
	private int figurine;
	
	@Column(name="command")
	private int command;
=======
	@NotNull
	@Min(0)
	@Max(1000)
	@Column(name="command")
	private int command;
	
	@NotNull
	@Min(0)
	@Max(1000)
	@Column(name="figurine")
	private int figurine;

	public int getIdLineCommand() {
		return idLineCommand;
	}

	public void setIdLineCommand(int idLineCommand) {
		this.idLineCommand = idLineCommand;
	}

	public int getCommand() {
		return command;
	}

	public void setCommand(int command) {
		this.command = command;
	}

	public int getFigurine() {
		return figurine;
	}

	public void setFigurine(int figurine) {
		this.figurine = figurine;
	}
>>>>>>> branch 'master' of https://github.com/louisvdd/progweb.git

	public int getIdCommandeLine() 
	{
		return idCommandeLine;
	}

	public void setIdCommandeLine(int idCommandeLine) 
	{
		this.idCommandeLine = idCommandeLine;
	}

	public int getFigurine() 
	{
		return figurine;
	}

	public void setFigurine(int figurine) 
	{
		this.figurine = figurine;
	}

	public int getCommand() 
	{
		return command;
	}

	public void setCommand(int command) 
	{
		this.command = command;
	}

	public int getNbFigurine() 
	{
		return nbFigurine;
	}

	public void setNbFigurine(int nbFigurine) 
	{
		this.nbFigurine = nbFigurine;
	}

	public double getPrizeCommand() 
	{
		return prizeCommand;
	}

	public void setPrizeCommand(double prizeCommand) 
	{
		this.prizeCommand = prizeCommand;
	}

	public int getPromotion() 
	{
		return promotion;
	}

	public void setPromotion(int promotion) 
	{
		this.promotion = promotion;
	}
	
	
}

