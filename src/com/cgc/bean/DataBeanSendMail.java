/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cgc.bean;

/**
 *
 * @author Beckeckpalmx
 */
public class DataBeanSendMail {
    private String email_from;
    private String email_to;
    private String email_server;
    private String email_port;

    /**
     * @return the email_from
     */
    public String getEmail_from() {
        return email_from;
    }

    /**
     * @param email_from the email_from to set
     */
    public void setEmail_from(String email_from) {
        this.email_from = email_from;
    }

    /**
     * @return the email_to
     */
    public String getEmail_to() {
        return email_to;
    }

    /**
     * @param email_to the email_to to set
     */
    public void setEmail_to(String email_to) {
        this.email_to = email_to;
    }

    /**
     * @return the email_server
     */
    public String getEmail_server() {
        return email_server;
    }

    /**
     * @param email_server the email_server to set
     */
    public void setEmail_server(String email_server) {
        this.email_server = email_server;
    }

    /**
     * @return the email_port
     */
    public String getEmail_port() {
        return email_port;
    }

    /**
     * @param email_port the email_port to set
     */
    public void setEmail_port(String email_port) {
        this.email_port = email_port;
    }
}
