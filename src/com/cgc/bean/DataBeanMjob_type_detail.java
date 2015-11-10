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
public class DataBeanMjob_type_detail {
    private String job_type_id;
    private String job_type_desc;    
    private String remark;
    private String by;
    private Timestamp date;

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

    /**
     * @return the job_type_desc
     */
    public String getJob_type_desc() {
        return job_type_desc;
    }

    /**
     * @param job_type_desc the job_type_desc to set
     */
    public void setJob_type_desc(String job_type_desc) {
        this.job_type_desc = job_type_desc;
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
    

}
