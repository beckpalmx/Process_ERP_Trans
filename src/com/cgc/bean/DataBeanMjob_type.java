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
public class DataBeanMjob_type {
    private String job_type_id;
    private String name_t;
    private String remark;
    private String by;
    private Timestamp date;
    
    public String getJob_type_id(){
        return job_type_id;
    }
    public void setJob_type_id(String job_type_id){
        this.job_type_id = job_type_id;
    }
    public String getName_t(){
        return name_t;
    }
    public void setName_t(String name_t){
        this.name_t = name_t;
    }
    public String getRemark(){
        return  remark;
    }
    public void setRemark(String remark){
        this.remark = remark;
    }
    public String getBy(){
        return by;
    }
    public void setBy(String by){
        this.by = by;
    }
    public Timestamp getDate(){
        return date;
    }
    public void SetDate(Timestamp date){
        this.date = date;
    }
}
