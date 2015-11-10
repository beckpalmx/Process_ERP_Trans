package com.cgc.bean;

import java.sql.Timestamp;

public class DataBeanMuser_Account {
	private String user;
	private String password;
	private Timestamp date;
	
	public String getUser()
	{
		return this.user;
	}
	public void setUser(String user)
	{
		this.user = user;
	}
	public String getPassword()
	{
		return this.password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public Timestamp getDate()
	{
		return this.date;
	}
	public void setDate(Timestamp date)
	{
		this.date = date;		
	}

}
