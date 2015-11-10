package com.cgc.bean;

import java.sql.Timestamp;

public class CostProductBean {
    private String doc_id;
    private String job_id;
    private String std_id;
    private String std_sub_id;
    private String oh_id;
    private String driver_id;
    private String cost_value;
    private Timestamp create_date;
    private String create_by;
    private String update_by;

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
     * @return the std_id
     */
    public String getStd_id() {
        return std_id;
    }

    /**
     * @param std_id the std_id to set
     */
    public void setStd_id(String std_id) {
        this.std_id = std_id;
    }

    /**
     * @return the std_sub_id
     */
    public String getStd_sub_id() {
        return std_sub_id;
    }

    /**
     * @param std_sub_id the std_sub_id to set
     */
    public void setStd_sub_id(String std_sub_id) {
        this.std_sub_id = std_sub_id;
    }

    /**
     * @return the oh_id
     */
    public String getOh_id() {
        return oh_id;
    }

    /**
     * @param oh_id the oh_id to set
     */
    public void setOh_id(String oh_id) {
        this.oh_id = oh_id;
    }

    /**
     * @return the driver_id
     */
    public String getDriver_id() {
        return driver_id;
    }

    /**
     * @param driver_id the driver_id to set
     */
    public void setDriver_id(String driver_id) {
        this.driver_id = driver_id;
    }

    /**
     * @return the cost_value
     */
    public String getCost_value() {
        return cost_value;
    }

    /**
     * @param cost_value the cost_value to set
     */
    public void setCost_value(String cost_value) {
        this.cost_value = cost_value;
    }

    /**
     * @return the create_date
     */
    public Timestamp getCreate_date() {
        return create_date;
    }

    /**
     * @param create_date the create_date to set
     */
    public void setCreate_date(Timestamp create_date) {
        this.create_date = create_date;
    }

    /**
     * @return the create_by
     */
    public String getCreate_by() {
        return create_by;
    }

    /**
     * @param create_by the create_by to set
     */
    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    /**
     * @return the update_by
     */
    public String getUpdate_by() {
        return update_by;
    }

    /**
     * @param update_by the update_by to set
     */
    public void setUpdate_by(String update_by) {
        this.update_by = update_by;
    }


}
