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
public class DataBeanD_summary_product_header {
    private String job_id;
    private String machine;
    private String begin_date_product;
    private String end_date_product;
    private String lost_weight;
    private String withdraw_total_weight;
    private String total_weight;
    private String lost_weight_percent;
    private String total_weight_percent;
    private String by;
    private Timestamp date ;
    private String production_rate;

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
     * @return the machine
     */
    public String getMachine() {
        return machine;
    }

    /**
     * @param machine the machine to set
     */
    public void setMachine(String machine) {
        this.machine = machine;
    }

    /**
     * @return the begin_date_product
     */
    public String getBegin_date_product() {
        return begin_date_product;
    }

    /**
     * @param begin_date_product the begin_date_product to set
     */
    public void setBegin_date_product(String begin_date_product) {
        this.begin_date_product = begin_date_product;
    }

    /**
     * @return the end_date_product
     */
    public String getEnd_date_product() {
        return end_date_product;
    }

    /**
     * @param end_date_product the end_date_product to set
     */
    public void setEnd_date_product(String end_date_product) {
        this.end_date_product = end_date_product;
    }

    /**
     * @return the lost_weight
     */
    public String getLost_weight() {
        return lost_weight;
    }

    /**
     * @param lost_weight the lost_weight to set
     */
    public void setLost_weight(String lost_weight) {
        this.lost_weight = lost_weight;
    }

    /**
     * @return the withdraw_total_weight
     */
    public String getWithdraw_total_weight() {
        return withdraw_total_weight;
    }

    /**
     * @param withdraw_total_weight the withdraw_total_weight to set
     */
    public void setWithdraw_total_weight(String withdraw_total_weight) {
        this.withdraw_total_weight = withdraw_total_weight;
    }

    /**
     * @return the total_weight
     */
    public String getTotal_weight() {
        return total_weight;
    }

    /**
     * @param total_weight the total_weight to set
     */
    public void setTotal_weight(String total_weight) {
        this.total_weight = total_weight;
    }

    /**
     * @return the lost_weight_percent
     */
    public String getLost_weight_percent() {
        return lost_weight_percent;
    }

    /**
     * @param lost_weight_percent the lost_weight_percent to set
     */
    public void setLost_weight_percent(String lost_weight_percent) {
        this.lost_weight_percent = lost_weight_percent;
    }

    /**
     * @return the total_weight_percent
     */
    public String getTotal_weight_percent() {
        return total_weight_percent;
    }

    /**
     * @param total_weight_percent the total_weight_percent to set
     */
    public void setTotal_weight_percent(String total_weight_percent) {
        this.total_weight_percent = total_weight_percent;
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
     * @return the production_rate
     */
    public String getProduction_rate() {
        return production_rate;
    }

    /**
     * @param production_rate the production_rate to set
     */
    public void setProduction_rate(String production_rate) {
        this.production_rate = production_rate;
    }
}
