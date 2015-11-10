package com.cgc.bean;

import java.sql.Timestamp;

public class DataBeanCus_Sup {
	//____________________mcustomer_______________________
	private String customer_id;
	private String name_t;
	private String address1_t;
	private String tambol_code;
	private String amp_code;
	private String prov_code;
	private String zipcode;
	private String tel;
	private String fax;
	private String contact_name;
	private String remark;
	private String delete_flag;
	private Timestamp date;
        private String country;
        private String price_unit;
        private String location_id2;        
        private String bank_id;    
	
	public String getCustomer_id()
	{
		return this.customer_id;
	}
	public void setCustomer_id(String customer_id)
	{
		this.customer_id = customer_id;
	}
	public String getName_t()
	{
		return this.name_t;
	}
	public void setName_t(String name_t)
	{
		this.name_t = name_t;
	}
	public String getAddress1_t()
	{
		return this.address1_t;
	}
	public void setAddress1_t(String address1_t)
	{
		this.address1_t = address1_t;
	}
	public String getTambol_code()
	{
		return this.tambol_code;
	}
	public void setTambol_code(String tambol_code)
	{
		this.tambol_code = tambol_code;
	}
	public String getAmp_code()
	{
		return this.amp_code;
	}
	public void setAmp_code(String amp_code)
	{
		this.amp_code = amp_code;
	}
	public String getProv_code()
	{
		return this.prov_code;
	}
	public void setProv_code(String prov_code)
	{
		this.prov_code = prov_code;
	}
	public String getZipcode()
	{
		return this.zipcode;
	}
	public void setZipcode(String zipcode)
	{
		this.zipcode = zipcode;
	}
	public String getTel()
	{
		return this.tel;
	}
	public void setTel(String tel)
	{
		this.tel = tel;
	}
	public String getFax()
	{
		return this.fax;
	}
	public void setFax(String fax)
	{
		this.fax = fax;
	}
	public String getContact_name()
	{
		return this.contact_name;
	}
	public void setContact_name(String contact_name)
	{
		this.contact_name = contact_name;
	}
	public String getRemark()
	{
		return this.remark;
	}
	public void setRemark(String remark)
	{
		this.remark = remark;
	}
	public String getDelete_flag()
	{
		return this.delete_flag;
	}
	public void setDelete_flag()
	{
		this.delete_flag = "Y";
	}
	//___________________End mcustomer________________________________
	
	//___________________msupplier_____________________________________
	
	private String supplier_id;
	public String getSupplier_id()
	{
		return supplier_id;
	}
	public void setSupplier_id(String supplier_id)
	{
		this.supplier_id = supplier_id;
	}
	//____________________End msupplier__________________________________
	public Timestamp getDate()
	{
		return this.date;
	}
	public void setDate(Timestamp date)
	{
		this.date = date;
	}

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }
    
     /**
     * @return the price_unit
     */
    public String getPrice_unit() {
        return price_unit;
    }

    /**
     * @param Price_unit the Price_unit to set
     */
    public void setPrice_unit(String price_unit) {
        this.price_unit = price_unit;
    }    
     /**
     * @return the location_id2
     */
    public String getBranch_id() {
        return location_id2;
    }

    /**
     * @param location_id2 the location_id2 to set
     */
    public void setBranch_id(String location_id2) {
        this.location_id2 = location_id2;
    }       
     /**
     * @return the bank_id
     */
    public String getBank_id() {
        return bank_id;
    }

    /**
     * @param bank_id the bank_id to set
     */
    public void setBank_id(String bank_id) {
        this.bank_id = bank_id;
    }          
}
