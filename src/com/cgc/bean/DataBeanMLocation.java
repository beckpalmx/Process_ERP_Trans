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
public class DataBeanMLocation {
    private int runno;
    private String location_id;
    private String name_t;
    private String location_id_ref;
    private String price_per_unit;    
    private String remark;
    private String location_type;
    private String by;
    private Timestamp date;

    /**
     * @return the runno
     */
    public int getRunno() {
        return runno;
    }

    /**
     * @param runno the runno to set
     */
    public void setRunno(int runno) {
        this.runno = runno;
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
     * @return the name_t
     */
    public String getName_t() {
        return name_t;
    }

    /**
     * @param name_t the name_t to set
     */
    public void setName_t(String name_t) {
        this.name_t = name_t;
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

    /**
     * @return the price_per_unit
     */
    public String getPrice_per_unit() {
        return price_per_unit;
    }

    /**
     * @param price_per_unit the price_per_unit to set
     */
    public void setPrice_per_unit(String price_per_unit) {
        this.price_per_unit = price_per_unit;
    }

    /**
     * @return the remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark the remark to set
     */
    public void setRemark(String remark) {
        this.remark = remark;
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

    /**
     * @return the location_type
     */
    public String getLocation_type() {
        return location_type;
    }

    /**
     * @param location_type the location_type to set
     */
    public void setLocation_type(String location_type) {
        this.location_type = location_type;
    }
    


   
}
