/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cgc.bean;

import java.sql.Timestamp;

/**
 *
 * @author Beck
 */
public class DataBeanT_warehouse_item {
    private String warehouse_id;
    private String location_id;
    private String product_id;
    private String price;
    private String wh_value;
    private String weight;
    private String by;
    private Timestamp date;

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
     * @return the weight
     */
    public String getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(String weight) {
        this.weight = weight;
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
     * @return the date
     */
    public Timestamp getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Timestamp date) {
        this.date = date;
    }

}
