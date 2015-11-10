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
public class DataBeanD_ticketbuy_doc {

    private Integer runno;
    private String doc_id;
    private String doc_date;
    private String doc_time;
    private String remark;
    private String complete_flag;
    private String doc_type;
    private String report_id;
    private Timestamp date;
    private String by;

    /**
     * @return the runno
     */
    public Integer getRunno() {
        return runno;
    }

    /**
     * @param runno the runno to set
     */
    public void setRunno(Integer runno) {
        this.runno = runno;
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
     * @return the doc_time
     */
    public String getDoc_time() {
        return doc_time;
    }

    /**
     * @param doc_time the doc_time to set
     */
    public void setDoc_time(String doc_time) {
        this.doc_time = doc_time;
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

    /**
     * @return the report_id
     */
    public String getReport_id() {
        return report_id;
    }

    /**
     * @param report_id the report_id to set
     */
    public void setReport_id(String report_id) {
        this.report_id = report_id;
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

}
