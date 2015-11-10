package com.cgc.bean;

import java.sql.Timestamp;

public class DataBeanMessage {
	private String message_id;
	private String message_detail;
	private String status;        
        private Timestamp create_date;
        private String create_by;
        private Timestamp update_date;
        private String update_by;
        private String delete_flag;        
        private Timestamp delete_date;
        private String delete_by;
        private String company_id;        

    /**
     * @return the message_id
     */
    public String getMessage_id() {
        return message_id;
    }

    /**
     * @param message_id the message_id to set
     */
    public void setMessage_id(String message_id) {
        this.message_id = message_id;
    }

    /**
     * @return the message_detail
     */
    public String getMessage_detail() {
        return message_detail;
    }

    /**
     * @param message_detail the message_detail to set
     */
    public void setMessage_detail(String message_detail) {
        this.message_detail = message_detail;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
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
     * @param create_date the create_date to set
     */
    public void setCreate_date(Timestamp create_date) {
        this.create_date = create_date;
    }

    /**
     * @param create_by the create_by to set
     */
    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    /**
     * @param update_date the update_date to set
     */
    public void setUpdate_date(Timestamp update_date) {
        this.update_date = update_date;
    }

    /**
     * @param update_by the update_by to set
     */
    public void setUpdate_by(String update_by) {
        this.update_by = update_by;
    }

    /**
     * @param delete_flag the delete_flag to set
     */
    public void setDelete_flag(String delete_flag) {
        this.delete_flag = delete_flag;
    }

    /**
     * @param delete_by the delete_by to set
     */
    public void setDelete_by(String delete_by) {
        this.delete_by = delete_by;
    }

    /**
     * @param company_id the company_id to set
     */
    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }
	


}
