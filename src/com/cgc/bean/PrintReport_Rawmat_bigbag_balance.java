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
public class PrintReport_Rawmat_bigbag_balance {

    private int runno;
    private String product_id;
    private String wh_id;
    private String location_id;
    private Double rawmatt_transfer;
    private Double rawmatt_receive;
    private Double rawmatt_withdraw;    
    private Double rawmatt_balance;    
    private Timestamp date;
    private String by;
    private String month;
    private String year;    

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
     * @return the product_id
     */
    public String getProduct_id() {
        return product_id;
    }

    /**
     * @param product_id the product_id to set
     */
    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    /**
     * @return the wh_id
     */
    public String getWh_id() {
        return wh_id;
    }

    /**
     * @param wh_id the wh_id to set
     */
    public void setWh_id(String wh_id) {
        this.wh_id = wh_id;
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
     * @return the rawmatt_transfer
     */
    public Double getRawmatt_transfer() {
        return rawmatt_transfer;
    }

    /**
     * @param rawmatt_transfer the rawmatt_transfer to set
     */
    public void setRawmatt_transfer(Double rawmatt_transfer) {
        this.rawmatt_transfer = rawmatt_transfer;
    }

    /**
     * @return the rawmatt_receive
     */
    public Double getRawmatt_receive() {
        return rawmatt_receive;
    }

    /**
     * @param rawmatt_receive the rawmatt_receive to set
     */
    public void setRawmatt_receive(Double rawmatt_receive) {
        this.rawmatt_receive = rawmatt_receive;
    }

    /**
     * @return the rawmatt_withdraw
     */
    public Double getRawmatt_withdraw() {
        return rawmatt_withdraw;
    }

    /**
     * @param rawmatt_withdraw the rawmatt_withdraw to set
     */
    public void setRawmatt_withdraw(Double rawmatt_withdraw) {
        this.rawmatt_withdraw = rawmatt_withdraw;
    }

    /**
     * @return the rawmatt_balance
     */
    public Double getRawmatt_balance() {
        return rawmatt_balance;
    }

    /**
     * @param rawmatt_balance the rawmatt_balance to set
     */
    public void setRawmatt_balance(Double rawmatt_balance) {
        this.rawmatt_balance = rawmatt_balance;
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
     * @return the month
     */
    public String getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(String month) {
        this.month = month;
    }

    /**
     * @return the year
     */
    public String getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(String year) {
        this.year = year;
    }
    


}
