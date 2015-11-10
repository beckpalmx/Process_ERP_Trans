/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cgc.bean;

/**
 *
 * @author Beck
 */
public class DataBeanError_Stock_Item {
    private String doc_id;
    private String line_no;
    private String warehouse_id;
    private String location_id;
    private String product_id;
    private String status;
    private String weight;

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
     * @return the line_no
     */
    public String getLine_no() {
        return line_no;
    }

    /**
     * @param line_no the line_no to set
     */
    public void setLine_no(String line_no) {
        this.line_no = line_no;
    }

    /**
     * @return the warehouse_id
     */
    public String getWarehouse_id() {
        return warehouse_id;
    }

    /**
     * @param warehouse_id the warehouse_id to set
     */
    public void setWarehouse_id(String warehouse_id) {
        this.warehouse_id = warehouse_id;
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
     * @return the Status
     */
    public String getStatus() {
        return (status.equals("-2"))
                ?"ไม่มีคลังสินค้าที่ระบุ"
                :(status.equals("-3"))
                ?"ไม่มีเลขที่กองที่ระบุ"
                :(status.equals("-4"))
                ?"ไม่มีรหัสสินค้าที่ระบุ"
                :"สินค้าไม่พอที่จะทำการเบิกได้";


        //return Status;
    }

    /**
     * @param Status the Status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the weight
     */
    public String getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

}
