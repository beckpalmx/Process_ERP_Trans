package com.cgc.bean;

import java.sql.*;

public class DataBeanMDRIVER {
	private String driver_id;
	private String name_t;
	private String remark;
	private Timestamp date;
	
	public String getDriver_id()
	{
		return this.driver_id;
	}
	public void setDriver_id(String driver_id)
	{
		this.driver_id = driver_id;
	}
	public String getName_t()
	{
		return this.name_t;
	}
	public void setName_t(String name_t)
	{
		this.name_t = name_t;
	}
	public String getRemark()
	{
		return this.remark;
	}
	public void setRemark(String remark)
	{
		this.remark = remark;
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
