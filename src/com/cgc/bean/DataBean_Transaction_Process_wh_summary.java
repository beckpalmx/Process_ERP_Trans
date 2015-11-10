/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cgc.bean;

import java.sql.Timestamp;

/**
 *
 * @author Beckeck
 */
public class DataBean_Transaction_Process_wh_summary {

    private String stock_type;
    private String doc_date;
    private Double weight_value;
    private Double price_value;
    private Timestamp create_date;

    /**
     * @return the stock_type
     */
    public String getStock_type() {
        return stock_type;
    }

    /**
     * @param stock_type the stock_type to set
     */
    public void setStock_type(String stock_type) {
        this.stock_type = stock_type;
    }

    /**
     * @return the doc_date
     */
    public String getDoc_date() {
        return doc_date;
    }

    /**
     * @param doc_date the doc_date to set
     */
    public void setDoc_date(String doc_date) {
        this.doc_date = doc_date;
    }

    /**
     * @return the weight_value
     */
    public Double getWeight_value() {
        return weight_value;
    }

    /**
     * @param weight_value the weight_value to set
     */
    public void setWeight_value(Double weight_value) {
        this.weight_value = weight_value;
    }

    /**
     * @return the price_value
     */
    public Double getPrice_value() {
        return price_value;
    }

    /**
     * @param price_value the price_value to set
     */
    public void setPrice_value(Double price_value) {
        this.price_value = price_value;
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
            
}
    

 
