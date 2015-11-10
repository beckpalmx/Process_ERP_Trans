package com.cgc.bean;

import java.sql.Timestamp;

public class T_WareHouseBean {
    private String warehouse_id;
    private String location_id;
    private String product_id;
    private String weight;
    private String price;
    private String wh_value;
    private Timestamp create_date;
    private Timestamp update_date;
    private String create_by;
    private String update_by;

    /**
     * @return the warehouse_id
     */
    public String getWarehouse_id() {
        return warehouse_id;
    }

    /**
     * @param warehouse_id the warehouse_id to set
     */
    public void setWarehouse_id(String warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    /**
     * @return the location_id
     */
    public String getLocation_id() {
        return location_id;
    }

    /**
     * @param location_id the location_id to set
     */
    public void setLocation_id(String location_id) {
        this.location_id = location_id;
    }

    /**
     * @return the product_id
     */
    public String getProduct_id() {
        return product_id;
    }

    /**
     * @param product_id the product_id to set
     */
    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    /**
     * @return the quantity
     */
    public String getWeight() {
        return weight;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setWeight(String quantity) {
        this.weight = quantity;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * @return the wh_value
     */
    public String getWh_value() {
        return wh_value;
    }

    /**
     * @param wh_value the wh_value to set
     */
    public void setWh_value(String wh_value) {
        this.wh_value = wh_value;
    }

    /**
     * @return the create_date
     */
    public Timestamp getCreate_date() {
        return create_date;
    }

    /**
     * @param create_date the create_date to set
     */
    public void setCreate_date(Timestamp create_date) {
        this.create_date = create_date;
    }

    /**
     * @return the update_date
     */
    public Timestamp getUpdate_date() {
        return update_date;
    }

    /**
     * @param update_date the update_date to set
     */
    public void setUpdate_date(Timestamp update_date) {
        this.update_date = update_date;
    }

    /**
     * @return the create_by
     */
    public String getCreate_by() {
        return create_by;
    }

    /**
     * @param create_by the create_by to set
     */
    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    /**
     * @return the update_by
     */
    public String getUpdate_by() {
        return update_by;
    }

    /**
     * @param update_by the update_by to set
     */
    public void setUpdate_by(String update_by) {
        this.update_by = update_by;
    }
    
}
