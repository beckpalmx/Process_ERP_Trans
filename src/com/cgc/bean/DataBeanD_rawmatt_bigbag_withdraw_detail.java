package com.cgc.bean;

import java.sql.Timestamp;

//CS_024
public class DataBeanD_rawmatt_bigbag_withdraw_detail {
	private String doc_id;
	private String line_no;
	private String product_id;
        private String product_name;
	private String quantity;
	private String wh_in;
	private String wh_out;
	private String remark;
	private String location_id;
	private String weight;
	private String cust_id;
        private String cust_name;
	private String doc_date;
	private Timestamp date;
        private String runno;
        private String by;
        private String supplier_id;
        private String supplier_name;
        private String wh_out_desc;
        private String wh_in_desc;
        private String location_id_ref;
	
	public String getDoc_id()
	{
		return this.doc_id;
	}
	public void setDoc_id(String doc_id)
	{
		this.doc_id = doc_id;
	}
	public String getLine_no()
	{
		return this.line_no;
	}
	public void setLine_no(String line_no)
	{
		this.line_no = line_no;
	}
	public String getProduct_id()
	{
		return this.product_id;
	}
	public void setProduct_id(String product_id)
	{
		this.product_id = product_id;
	}
	public String getQuantity()
	{
		return this.quantity;
	}
	public void setQuatity(String quantity)
	{
		this.quantity = quantity;
	}
	public String getWh_in()
	{
		return this.wh_in;
	}
	public void  setWh_in(String wh_in)
	{
		this.wh_in = wh_in;
	}
	public String getWh_out()
	{
		return this.wh_out;
	}
	public void setWh_out(String wh_out)
	{
		this.wh_out = wh_out;
	}
	public String getRemark()
	{
		return this.remark;
	}
	public void setRemark(String remark)
	{
		this.remark = remark;
	}
	public String getLocation_id()
	{
		return this.location_id;
	}
	public void setLocation_id(String location_id)
	{
		this.location_id = location_id;
	}
	public String getWeight()
	{
		return this.weight;
	}
	public void setWeight(String weight)
	{
		this.weight = weight;
	}
	public String getCust_id()
	{
		return this.cust_id;
	}
	public void setCust_id(String cust_id)
	{
		this.cust_id = cust_id;
	}
	public String getDoc_date()
	{
		return this.doc_date;
	}
	public void setDoc_date(String doc_date)
	{
		this.doc_date = doc_date;
	}
	public Timestamp getDate()
	{
		return this.date;
	}
	public void setDate(Timestamp date)
	{
		this.date = date;
	}
        public String getProduct_name()
    {
            return this.product_name;
        }
        public void setProduct_name(String product_name)
    {
            this.product_name = product_name;
        }
        public String getCust_name()
    {
            return this.cust_name;
        }
        public void setCust_name(String cust_name)
    {
            this.cust_name = cust_name;
        }

    /**
     * @return the runno
     */
    public String getRunno() {
        return runno;
    }

    /**
     * @param runno the runno to set
     */
    public void setRunno(String runno) {
        this.runno = runno;
    }

    /**
     * @return the by
     */
    public String getBy() {
        return by;
    }

    /**
     * @param by the by to set
     */
    public void setBy(String by) {
        this.by = by;
    }

    /**
     * @return the supplier_id
     */
    public String getSupplier_id() {
        return supplier_id;
    }

    /**
     * @param supplier_id the supplier_id to set
     */
    public void setSupplier_id(String supplier_id) {
        this.supplier_id = supplier_id;
    }

    /**
     * @return the supplier_name
     */
    public String getSupplier_name() {
        return supplier_name;
    }

    /**
     * @param supplier_name the supplier_name to set
     */
    public void setSupplier_name(String supplier_name) {
        this.supplier_name = supplier_name;
    }

    /**
     * @return the wh_out_desc
     */
    public String getWh_out_desc() {
        return wh_out_desc;
    }

    /**
     * @param wh_out_desc the wh_out_desc to set
     */
    public void setWh_out_desc(String wh_out_desc) {
        this.wh_out_desc = wh_out_desc;
    }

    /**
     * @return the wh_in_desc
     */
    public String getWh_in_desc() {
        return wh_in_desc;
    }

    /**
     * @param wh_in_desc the wh_in_desc to set
     */
    public void setWh_in_desc(String wh_in_desc) {
        this.wh_in_desc = wh_in_desc;
    }

    /**
     * @return the location_id_ref
     */
    public String getLocation_id_ref() {
        return location_id_ref;
    }

    /**
     * @param location_id_ref the location_id_ref to set
     */
    public void setLocation_id_ref(String location_id_ref) {
        this.location_id_ref = location_id_ref;
    }

}
