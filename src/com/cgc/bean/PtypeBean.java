/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cgc.bean;

import java.sql.Timestamp;

/**
 *
 * @author com02
 */
public class PtypeBean {
    private String runno;
    private String ptype_id;
    private String name_t;
    private String name_e;
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

    /**
     * @return the runno
     */
    public String getRunno() {
        return runno;
    }

    /**
     * @param runno the runno to set
     */
    public void setRunno(String runno) {
        this.runno = runno;
    }

    /**
     * @return the pgroup_id
     */
    public String getPtype_id() {
        return ptype_id;
    }

    /**
     * @param pgroup_id the pgroup_id to set
     */
    public void setPtype_id(String ptype_id) {
        this.ptype_id = ptype_id;
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
}
