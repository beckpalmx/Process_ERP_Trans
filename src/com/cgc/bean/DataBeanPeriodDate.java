/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cgc.bean;

/**
 *
 * @author com02
 */
public class DataBeanPeriodDate {

    private int runno;
    private String period_id;
    private String name_t;
    private String doc_type;
    private String start_period;    
    private String end_period;

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
     * @return the period_id
     */
    public String getPeriod_id() {
        return period_id;
    }

    /**
     * @param period_id the period_id to set
     */
    public void setPeriod_id(String period_id) {
        this.period_id = period_id;
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
     * @return the start_period
     */
    public String getStart_period() {
        return start_period;
    }

    /**
     * @param start_period the start_period to set
     */
    public void setStart_period(String start_period) {
        this.start_period = start_period;
    }

    /**
     * @return the end_period
     */
    public String getEnd_period() {
        return end_period;
    }

    /**
     * @param end_period the end_period to set
     */
    public void setEnd_period(String end_period) {
        this.end_period = end_period;
    }

}
