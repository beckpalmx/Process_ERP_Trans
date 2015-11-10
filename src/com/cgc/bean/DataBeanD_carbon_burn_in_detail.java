/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cgc.bean;
import java.sql.Timestamp;
public class DataBeanD_carbon_burn_in_detail {
    private String doc_id;
    private String line_no;
    private String product_id;
    private String quantity;
    private String wh_in;
    private String wh_out;
    private String remark;
    private Timestamp date;
    private String by;
    private String tank_suite;
    private String weight;
    private String weight_tank;
    private String weight_tot;
    private String silo_no;
    private String doc_date;
    private String prod_name;
    private String location_id;
    private String channel;

    public String getDoc_id() {
        return doc_id;
    }

    public void setDoc_id(String doc_id) {
        this.doc_id = doc_id;
    }

    public String getLine_no() {
        return line_no;
    }

    public void setLine_no(String line_no) {
        this.line_no = line_no;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getWh_in() {
        return wh_in;
    }

    public void setWh_in(String wh_in) {
        this.wh_in = wh_in;
    }

    public String getWh_out() {
        return wh_out;
    }

    public void setWh_out(String wh_out) {
        this.wh_out = wh_out;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }

    public String getTank_suite() {
        return tank_suite;
    }

    public void setTank_suite(String tank_suite) {
        this.tank_suite = tank_suite;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getWeight_tank() {
        return weight_tank;
    }

    public void setWeight_tank(String weight_tank) {
        this.weight_tank = weight_tank;
    }

    public String getWeight_tot() {
        return weight_tot;
    }

    public void setWeight_tot(String weight_tot) {
        this.weight_tot = weight_tot;
    }

    public String getSilo_no() {
        return silo_no;
    }
    public void setSilo_no(String silo_no) {
        this.silo_no = silo_no;
    }

    public String getDoc_date() {
        return doc_date;
    }
    public void setDoc_date(String doc_date) {
        this.doc_date = doc_date;
    }

    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    /**
     * @return the location_id
     */
    public String getLocation_id() {
        return location_id;
    }

    /**
     * @param location_id the location_id to set
     */
    public void setLocation_id(String location_id) {
        this.location_id = location_id;
    }

    /**
     * @return the channel
     */
    public String getChannel() {
        return channel;
    }

    /**
     * @param channel the channel to set
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

}
