package com.spring.henallux.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserConnection 
{
	@Size(min=5, max=30)
	@NotNull
	private String idUser;

	@Size(min=5, max=30)
	@NotNull
	private String password;
	
	public String getIdUser() 
	{
		return idUser;
	}

	public void setIdUser(String idUser) 
	{
		this.idUser = idUser;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}
	
}
