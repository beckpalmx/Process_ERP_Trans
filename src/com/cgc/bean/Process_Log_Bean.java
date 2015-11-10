/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cgc.bean;
import java.sql.Timestamp;

/**
 *
 * @author beckp
 */
public class Process_Log_Bean {
    private int runno;
    private String log_id;
    private String process_id;
    private String start_time;
    private String end_time;
    private String remark;
    private Timestamp create_date;
    private String create_by;
    private Timestamp update_date;
    private String update_by;
    private String delete_flag;
    private String doc_type;
    private Timestamp delete_date;
    private String delete_by;
    private String company_id;
    private String complete_flag;
    private String condition;

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
     * @return the log_id
     */
    public String getLog_id() {
        return log_id;
    }

    /**
     * @param log_id the log_id to set
     */
    public void setLog_id(String log_id) {
        this.log_id = log_id;
    }

    /**
     * @return the process_id
     */
    public String getProcess_id() {
        return process_id;
    }

    /**
     * @param process_id the process_id to set
     */
    public void setProcess_id(String process_id) {
        this.process_id = process_id;
    }

    /**
     * @return the start_time
     */
    public String getStart_time() {
        return start_time;
    }

    /**
     * @param start_time the start_time to set
     */
    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    /**
     * @return the end_time
     */
    public String getEnd_time() {
        return end_time;
    }

    /**
     * @param end_time the end_time to set
     */
    public void setEnd_time(String end_time) {
        this.end_time = end_time;
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
     * @return the update_date
     */
    public Timestamp getUpdate_date() {
        return update_date;
    }

    /**
     * @param update_date the update_date to set
     */
    public void setUpdate_date(Timestamp update_date) {
        this.update_date = update_date;
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

    /**
     * @return the delete_flag
     */
    public String getDelete_flag() {
        return delete_flag;
    }

    /**
     * @param delete_flag the delete_flag to set
     */
    public void setDelete_flag(String delete_flag) {
        this.delete_flag = delete_flag;
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
     * @return the delete_date
     */
    public Timestamp getDelete_date() {
        return delete_date;
    }

    /**
     * @param delete_date the delete_date to set
     */
    public void setDelete_date(Timestamp delete_date) {
        this.delete_date = delete_date;
    }

    /**
     * @return the delete_by
     */
    public String getDelete_by() {
        return delete_by;
    }

    /**
     * @param delete_by the delete_by to set
     */
    public void setDelete_by(String delete_by) {
        this.delete_by = delete_by;
    }

    /**
     * @return the company_id
     */
    public String getCompany_id() {
        return company_id;
    }

    /**
     * @param company_id the company_id to set
     */
    public void setCompany_id(String company_id) {
        this.company_id = company_id;
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
     * @return the condition
     */
    public String getCondition() {
        return condition;
    }

    /**
     * @param condition the condition to set
     */
    public void setCondition(String condition) {
        this.condition = condition;
    }
    
}
