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
public class DataBeanMcarbon_size {
    private int size_id;
    private String name_t;
    private String remark;
    private String by;
    private Timestamp date;
    private int size_order;

    /**
     * @return the size_id
     */
    public int getSize_id() {
        return size_id;
    }

    /**
     * @param size_id the size_id to set
     */
    public void setSize_id(int size_id) {
        this.size_id = size_id;
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
     * @return the size_order
     */
    public int getSize_order() {
        return size_order;
    }

    /**
     * @param size_order the size_order to set
     */
    public void setSize_order(int size_order) {
        this.size_order = size_order;
    }

   
}
