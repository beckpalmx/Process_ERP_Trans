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
public class DataBeanMshift {
    private String shift_id;
    private String name_t;
    private String remark;

    /**
     * @return the shift_id
     */
    public String getShift_id() {
        return shift_id;
    }

    /**
     * @param shift_id the shift_id to set
     */
    public void setShift_id(String shift_id) {
        this.shift_id = shift_id;
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
 

}
