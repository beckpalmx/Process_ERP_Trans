package com.cgc.bean;
import java.sql.*;
public class DataBeanMSTD_COST_MAIN {

	private String std_id;
	private String name_t;
	private String remark;
	private Timestamp date;
        private String process_id;
	
	public String getStd_id()
	{
		return this.std_id;
	}
	public void setStd_id(String std_id)
	{
		this.std_id = std_id;
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

    /**
     * @return the process_id
     */
    public String getProcess_id() {
        return process_id;
    }

    /**
     * @param process_id the process_id to set
     */
    public void setProcess_id(String process_id) {
        this.process_id = process_id;
    }
	
}
