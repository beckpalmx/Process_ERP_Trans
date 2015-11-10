package com.cgc.bean;
import java.sql.*;
public class DataBeanMPROCESS_GRP {
	private String procgrp_id;
	private String name_t;
	private String remark;
	private Timestamp date;
	
	public String getProcgrp_id()
	{
		return this.procgrp_id;
	}
	public void setProcgrp_id(String procgrp_id)
	{
		this.procgrp_id = procgrp_id;
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
