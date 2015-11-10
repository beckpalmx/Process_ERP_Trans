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
public class DataBeanM_iodine {
    private String iod_code;
    private String iod_ctype;
    private String iod_range;
    private String butane;
    private String name_t;
    private String name_e;        
    private String ctc;    
    private String remark;
    private String by;
    private Timestamp date;

    /**
     * @return the iod_code
     */
    public String getIod_code() {
        return iod_code;
    }

    /**
     * @param iod_code the iod_code to set
     */
    public void setIod_code(String iod_code) {
        this.iod_code = iod_code;
    }

    /**
     * @return the iod_ctype
     */
    public String getIod_ctype() {
        return iod_ctype;
    }

    /**
     * @param iod_ctype the iod_ctype to set
     */
    public void setIod_ctype(String iod_ctype) {
        this.iod_ctype = iod_ctype;
    }

    /**
     * @return the iod_range
     */
    public String getIod_range() {
        return iod_range;
    }

    /**
     * @param iod_range the iod_range to set
     */
    public void setIod_range(String iod_range) {
        this.iod_range = iod_range;
    }

    /**
     * @return the butane
     */
    public String getButane() {
        return butane;
    }

    /**
     * @param butane the butane to set
     */
    public void setButane(String butane) {
        this.butane = butane;
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
     * @return the name_e
     */
    public String getName_e() {
        return name_e;
    }

    /**
     * @param name_e the name_e to set
     */
    public void setName_e(String name_e) {
        this.name_e = name_e;
    }

    /**
     * @return the ctc
     */
    public String getCtc() {
        return ctc;
    }

    /**
     * @param ctc the ctc to set
     */
    public void setCtc(String ctc) {
        this.ctc = ctc;
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
