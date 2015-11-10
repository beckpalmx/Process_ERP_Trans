package com.cgc.bean;
import java.sql.*;
public class DataBeanMSTD_COST_SUB {
	private String std_sub_id;
	private String std_id;
	private String oh_id;
	private String cost_value;
	private String driver_id;
	private String remark;
	private String name_t;
	private Timestamp date;
        private String doc_type;
	public String getStd_sub_id()
	{
		return this.std_sub_id;
	}
	public void setStd_sub_id(String std_sub_id)
	{
		this.std_sub_id = std_sub_id;
	}
	public String getStd_id()
	{
		return this.std_id;
	}
	public void setStd_id(String std_id)
	{
		this.std_id = std_id;
	}
	public String getOh_id()
	{
		return this.oh_id;
	}
	public void setOh_id(String oh_id)
	{
		this.oh_id = oh_id;
	}
	public String getCost_value()
	{
		return this.cost_value;
	}
	public void setCost_value(String cost_value)
	{
		this.cost_value = cost_value;
	}
	public String getDriver_id()
	{
		return this.driver_id;
	}
	public void setDriver_id(String driver_id)
	{
		this.driver_id = driver_id;
	}
	public String getRemark()
	{
		return this.remark;
	}
	public void setRemark(String remark)
	{
		this.remark = remark;
	}
	public String getName_t()
	{
		return this.name_t;
	}
	public void setName_t(String name_t)
	{
		this.name_t = name_t;
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
     * @return the doc_type
     */
    public String getDoc_type() {
        return doc_type;
    }

    /**
     * @param doc_type the doc_type to set
     */
    public void setDoc_type(String doc_type) {
        this.doc_type = doc_type;
    }

}
