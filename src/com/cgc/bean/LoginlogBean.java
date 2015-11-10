package com.cgc.bean;

import java.sql.Timestamp;

public class LoginlogBean {
    private String logid;
    private String user_name;
    private String session_id;
    private String remort_ip;
    private Timestamp create_date;
    private Timestamp login_time;
    private String select_session;
    private Timestamp logout_time;
    private String login_status;

    /**
     * @return the logid
     */
    public String getLogid() {
        return logid;
    }

    /**
     * @param logid the logid to set
     */
    public void setLogid(String logid) {
        this.logid = logid;
    }

    /**
     * @return the user_name
     */
    public String getUser_name() {
        return user_name;
    }

    /**
     * @param user_name the user_name to set
     */
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    /**
     * @return the session_id
     */
    public String getSession_id() {
        return session_id;
    }

    /**
     * @param session_id the session_id to set
     */
    public void setSession_id(String session_id) {
        this.session_id = session_id;
    }

    /**
     * @return the remort_ip
     */
    public String getRemote_ip() {
        return remort_ip;
    }

    /**
     * @param remort_ip the remort_ip to set
     */
    public void setRemote_ip(String remort_ip) {
        this.remort_ip = remort_ip;
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
     * @return the login_time
     */
    public Timestamp getLogin_time() {
        return login_time;
    }

    /**
     * @param login_time the login_time to set
     */
    public void setLogin_time(Timestamp login_time) {
        this.login_time = login_time;
    }

    /**
     * @return the select_session
     */
    public String getSelect_session() {
        return select_session;
    }

    /**
     * @param select_session the select_session to set
     */
    public void setSelect_session(String select_session) {
        this.select_session = select_session;
    }

    /**
     * @return the logout_time
     */
    public Timestamp getLogout_time() {
        return logout_time;
    }

    /**
     * @param logout_time the logout_time to set
     */
    public void setLogout_time(Timestamp logout_time) {
        this.logout_time = logout_time;
    }

    /**
     * @return the login_status
     */
    public String getLogin_status() {
        return login_status;
    }

    /**
     * @param login_status the login_status to set
     */
    public void setLogin_status(String login_status) {
        this.login_status = login_status;
    }
}
