package com.cgc.bean;

import java.sql.Timestamp;

public class DataBeanMoverhead {
	private String oh_id;
	private String driver_id;
	private String name_t;
	private String account_code;
	private String remark;
	private Timestamp date;
	
	public String getOh_id()
	{
		return this.oh_id;
	}
	public void setOh_id(String oh_id)
	{
		this.oh_id = oh_id;
	}
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
	public String getAccount_code()
	{
		return this.account_code;
	}
	public void setAccount_code(String account_code)
	{
		this.account_code = account_code;
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
