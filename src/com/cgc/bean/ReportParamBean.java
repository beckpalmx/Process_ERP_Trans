/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cgc.bean;

/**
 *
 * @author com02
 */
public class ReportParamBean {
    private int runno;
    private String report_id;
    private String param_name;
    private String param_from;
    private String param_to;
    private String lookup_name;

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
     * @return the param_name
     */
    public String getParam_name() {
        return param_name;
    }

    /**
     * @param param_name the param_name to set
     */
    public void setParam_name(String param_name) {
        this.param_name = param_name;
    }

    /**
     * @return the param_from
     */
    public String getParam_from() {
        return param_from;
    }

    /**
     * @param param_from the param_from to set
     */
    public void setParam_from(String param_from) {
        this.param_from = param_from;
    }

    /**
     * @return the param_to
     */
    public String getParam_to() {
        return param_to;
    }

    /**
     * @param param_to the param_to to set
     */
    public void setParam_to(String param_to) {
        this.param_to = param_to;
    }

    /**
     * @return the lookup_name
     */
    public String getLookup_name() {
        return lookup_name;
    }

    /**
     * @param lookup_name the lookup_name to set
     */
    public void setLookup_name(String lookup_name) {
        this.lookup_name = lookup_name;
    }

}
