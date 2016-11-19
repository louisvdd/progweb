package com.spring.henallux.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.spring.henallux.dataAccess.entity.CommandEntity;

//import javax.validation.constraints.*;

public class User 
{
	@Size(min=5, max=30)
	@NotNull( message = "Veuillez saisir un nom d'utilisateur" )
	private String idUser;
	
	@Size(min=5, max=30)
	@NotNull( message = "Veuillez saisir votre prénom" )
	private String firstName;
	
	@Size(min=5, max=50)
	@NotNull( message = "Veuillez saisir votre nom" )
	private String lastName;
	
	@NotNull( message = "Veuillez saisir une adresse email" )
	@Pattern( regexp = "([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)", message = "Merci de saisir une adresse mail valide" )
	private String email;
	
	@Size(min=5, max=30)
	private String numTel;
	
	@Size(min=5, max=30)
	private String numFax;
	
	@Size(min=5, max=30)
	@NotNull( message = "Veuillez saisir votre rue" )
	private String street;
	
	@Size(min=5, max=30)
	@NotNull( message = "Veuillez saisir la ville où vous habitez" )
	private String city;
	
	@Size(min=3, max=10)
	@NotNull( message = "Veuillez saisir votre code postal" )
	private String postalCode;
	
	@Size(min=5, max=30)
	@NotNull( message = "Veuillez saisir votre pays" )
	private String country;
	
	@Size(min=5, max=30)
	@NotNull( message = "Veuillez saisir votre mot de passe" )
	private String password;
	
	@OneToMany(mappedBy="user")
	private Collection<CommandEntity> commands;
	
	public User()
	{
		
	}
	
	//GETTERS ========================================================
	public String getIdUser()
	{
		return idUser;
	}
	
	public String getNumTel() 
	{
		return numTel;
	}

	
	public String getNumFax() 
	{
		return numFax;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public String getStreet()
	{
		return street;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public String getPostalCode()
	{
		return postalCode;
	}
	
	public String getCountry()
	{
		return country;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	//SETTERS ========================================================
	
	public void setIdUser(String idUser) 
	{
		this.idUser = idUser;
	}
	
	public void setFirstName(String f)
	{
		firstName = f;
	}
	
	public void setNumFax(String numFax) 
	{
		this.numFax = numFax;
	}
	
	public void setNumTel(String numTel) 
	{
		this.numTel = numTel;
	}

	
	public void setLastName(String l)
	{
		lastName = l;
	}
	
	public void setEmail(String e)
	{
		email = e;
	}
	
	public void setStreet(String s)
	{
		street = s;
	}
	
	public void setCity(String c)
	{
		city = c;
	}
	
	public void setPostalCode(String p)
	{
		postalCode = p;
	}
	
	public void setCountry(String co)
	{
		country = co;
	}
	
	public void setPassword(String pass)
	{
		password = pass;
	}
	
}
