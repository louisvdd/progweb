package com.spring.henallux.model;

public class User 
{
	private String idUser;
	private String firstName;
	private String lastName;
	private String email;
	private String numTel;
	private String numFax;
	private String street;
	private String city;
	private String postalCode;
	private String country;
	private String password;
	private Command command;
	
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
	
	public Command getCommand()
	{
		return command;
	}
	
	//SETTERS ========================================================
	
	public void setIdUser(String idUser) 
	{
		this.idUser = idUser;
	}

	public void setCommand(Command command) 
	{
		this.command = command;
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
