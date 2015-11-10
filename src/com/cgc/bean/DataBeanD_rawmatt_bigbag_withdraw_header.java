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
public class DataBeanD_rawmatt_bigbag_withdraw_header {
    private String doc_id;
    private String doc_date;
    private Timestamp date;
    private String company_id;
    private String wh_in;
    private String wh_out;
    private String doc_time;
    private String runner_id;
    private String p_type;
    private String by;
    private String remark;
    private String rawmat_emp;
    private String complete_flag;    

    
    public String getDoc_id() {
        return this.doc_id;
    }

    
    public void setDoc_id(String doc_id) {
        this.doc_id = doc_id;
    }

    
    public String getDoc_date() {
        return this.doc_date;
    }

    
    public void setDoc_date(String doc_date) {
        this.doc_date = doc_date;
    }

    
    public Timestamp getDate() {
        return this.date;
    }

    
    public void setDate(Timestamp date) {
        this.date = date;
    }

   
    public String getCompany_id() {
        return this.company_id;
    }

    
    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }

   
    public String getWh_in() {
        return this.wh_in;
    }

    
    public void setWh_in(String wh_in) {
        this.wh_in = wh_in;
    }

   
    public String getWh_out() {
        return this.wh_out;
    }

    
    public void setWh_out(String wh_out) {
        this.wh_out = wh_out;
    }

    
    public String getDoc_time() {
        return this.doc_time;
    }

    
    public void setDoc_time(String doc_time) {
        this.doc_time = doc_time;
    }

   
    public String getRunner_id() {
        return this.runner_id;
    }

    
    public void setRunner_id(String runner_id) {
        this.runner_id = runner_id;
    }

    
    public String getP_type() {
        return this.p_type;
    }

   
    public void setP_type(String p_type) {
        this.p_type = p_type;
    }

    
    public String getBy() {
        return this.by;
    }
    public void setBy(String by) {
        this.by = by;
    }

    
    public String getRemark() {
        return this.remark;
    }

    
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return the rawmat_emp
     */
    public String getRawmat_emp() {
        return rawmat_emp;
    }

    /**
     * @param rawmat_emp the rawmat_emp to set
     */
    public void setRawmat_emp(String rawmat_emp) {
        this.rawmat_emp = rawmat_emp;
    }

    /**
     * @return the complete_flag
     */
    public String getComplete_flag() {
        return complete_flag;
    }

    /**
     * @param complete_flag the complete_flag to set
     */
    public void setComplete_flag(String complete_flag) {
        this.complete_flag = complete_flag;
    }




}
