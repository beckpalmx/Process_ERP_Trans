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
public class DataBeanMproduction_place {
    private String prd_place;
    private String name_t;
    private String job_type_id;
    private String remark;
    private String by;
    private Timestamp date;

    /**
     * @return the machine_id
     */
    public String getPrd_place() {
        return prd_place;
    }

    /**
     * @param machine_id the machine_id to set
     */
    public void setPrd_place(String prd_place) {
        this.prd_place = prd_place;
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
     * @return the job_type_id
     */
    public String getJob_type_id() {
        return job_type_id;
    }

    /**
     * @param job_type_id the job_type_id to set
     */
    public void setJob_type_id(String job_type_id) {
        this.job_type_id = job_type_id;
    }

}
