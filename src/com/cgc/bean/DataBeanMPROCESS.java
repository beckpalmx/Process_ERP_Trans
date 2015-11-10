package com.cgc.bean;

import java.sql.Timestamp;

public class DataBeanMPROCESS {
	
	private String process_id;
	private String procgrp_id;
	private String warehouse_id;
	private String name_t;
	private String wh_bg;
	private String wh_en;
	private String remark;
	private Timestamp date;
        private String sub_table1;
	
	public String getProcess_id()
	{
		return this.process_id;
	}
	public void setProcess_id(String process_id)
	{
		this.process_id = process_id;
	}
	public String getProcgrp_id()
	{
		return this.procgrp_id;
	}
	public void setProcgrp_id(String procgrp_id)
	{
		this.procgrp_id = procgrp_id;
	}
	public String getWarehouse_id()
	{
		return this.warehouse_id;
	}
	public void setWareHouse_id(String warehouse_id)
	{
		this.warehouse_id = warehouse_id;
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
	public String getWh_bg()
	{
		return this.wh_bg;
	}
	public void setWh_bg(String wh_bg)
	{
		this.wh_bg = wh_bg;
	}
	public String getWh_en()
	{
		return this.wh_en;
	}
	public void setWh_en(String wh_en)
	{
		this.wh_en = wh_en;
		
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
     * @return the sub_table1
     */
    public String getSub_table1() {
        return sub_table1;
    }

    /**
     * @param sub_table1 the sub_table1 to set
     */
    public void setSub_table1(String sub_table1) {
        this.sub_table1 = sub_table1;
    }
	
	
}
