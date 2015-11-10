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
public class DataBeanD_summary_product_detail {
    private String job_id;
    private String size;
    private String ctc_i2;
    private String job_type_id;
    private String job_type_desc;
    private String weight;
    private String percent;
    private String by;
    private Timestamp date ;
    private String doc_type;

    /**
     * @return the job_id
     */
    public String getJob_id() {
        return job_id;
    }

    /**
     * @param job_id the job_id to set
     */
    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * @return the ctc_i2
     */
    public String getCtc_i2() {
        return ctc_i2;
    }

    /**
     * @param ctc_i2 the ctc_i2 to set
     */
    public void setCtc_i2(String ctc_i2) {
        this.ctc_i2 = ctc_i2;
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
     * @return the percent
     */
    public String getPercent() {
        return percent;
    }

    /**
     * @param percent the percent to set
     */
    public void setPercent(String percent) {
        this.percent = percent;
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
     * @return the doc_type
     */
    public String getDoc_type() {
        return doc_type;
    }

    /**
     * @param doc_type the doc_type to set
     */
    public void setDoc_type(String doc_type) {
        this.doc_type = doc_type;
    }
    
}
