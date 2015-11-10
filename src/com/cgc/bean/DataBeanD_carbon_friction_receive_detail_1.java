/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cgc.bean;

import java.sql.Timestamp;

/**
 *
 * @author Administrator
 */
public class DataBeanD_carbon_friction_receive_detail_1 {
    private Timestamp date;
    private String by;
    private String doc_id;
    private String line_no;
    private String product_id;
    private String friction_house;
    private String silo_no;
    private String location_id;
    private String balance_weight;//ยอดยกมา
    private String remain_weight;//ยอดคงเหลือ
    private String doc_date;

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
     * @return the doc_id
     */
    public String getDoc_id() {
        return doc_id;
    }

    /**
     * @param doc_id the doc_id to set
     */
    public void setDoc_id(String doc_id) {
        this.doc_id = doc_id;
    }

    /**
     * @return the line_no
     */
    public String getLine_no() {
        return line_no;
    }

    /**
     * @param line_no the line_no to set
     */
    public void setLine_no(String line_no) {
        this.line_no = line_no;
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
     * @return the friction_house
     */
    public String getFriction_house() {
        return friction_house;
    }

    /**
     * @param friction_house the friction_house to set
     */
    public void setFriction_house(String friction_house) {
        this.friction_house = friction_house;
    }

    /**
     * @return the silo_no
     */
    public String getSilo_no() {
        return silo_no;
    }

    /**
     * @param silo_no the silo_no to set
     */
    public void setSilo_no(String silo_no) {
        this.silo_no = silo_no;
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
     * @return the balance_weight
     */
    public String getBalance_weight() {
        return balance_weight;
    }

    /**
     * @param balance_weight the balance_weight to set
     */
    public void setBalance_weight(String balance_weight) {
        this.balance_weight = balance_weight;
    }

    /**
     * @return the remain_weight
     */
    public String getRemain_weight() {
        return remain_weight;
    }

    /**
     * @param remain_weight the remain_weight to set
     */
    public void setRemain_weight(String remain_weight) {
        this.remain_weight = remain_weight;
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

}
