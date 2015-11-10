/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cgc.DB;

import java.sql.*;
import java.io.*;
import java.util.Properties;

import org.apache.commons.codec.binary.Base64;
import org.xml.sax.InputSource;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

public class DBConnect {

    public String db_postgres_jdbc = "jdbc:postgresql://";
    public String db_mysql_jdbc = "jdbc:mysql://";
    public String db_postgres_dbma = "";
    public String db_postgres_dberp = "";
    public String db_postgres_dbcenter = "";
    public String db_postgres_server = "";
    public String db_postgres_server_bw = "";
    public String server_center = "";

    public String db_postgres_username = "";
    public String db_postgres_password = "";
    public String db_postgres_center_user = "";
    public String db_postgres_center_pass = "";

    //Connect Mysql For Weight Scale System
    public String db_mysql_server = "";
    public String db_mysql_weight_scale_database = "";
    public String db_mysql_username = "";
    public String db_mysql_password = "";

    public DBConnect() {
    }

    public void closeConnection(Connection conn) throws Exception {
        if (conn != null) {
            //System.out.println("#: PostgreSQL connection {"+conn+"} has been droped.");
            conn.close();
        }
    }

    public Connection openERPConnection() throws Exception {
        Connection conn;
        Class.forName("org.postgresql.Driver");
        ReadXMLConfig();
        String CONNECTION_DB = db_postgres_jdbc + db_postgres_server + db_postgres_dberp;
        byte[] user_decode = Base64.decodeBase64(db_postgres_username);
        byte[] pass_decode = Base64.decodeBase64(db_postgres_password);
        conn = DriverManager.getConnection(CONNECTION_DB, new String(user_decode), new String(pass_decode));
        if (conn == null) {
            throw new SQLException("Cannot initial database connection, because it's NULL.");
        }
        return conn;
    }

    public Connection openCMMSConnection() throws Exception {
        Connection conn;
        Class.forName("org.postgresql.Driver");
        ReadXMLConfig();
        String CONNECTION_DB = db_postgres_jdbc + db_postgres_server + db_postgres_dbma;
        byte[] user_decode = Base64.decodeBase64(db_postgres_username);
        byte[] pass_decode = Base64.decodeBase64(db_postgres_password);
        conn = DriverManager.getConnection(CONNECTION_DB, new String(user_decode), new String(pass_decode));
        if (conn == null) {
            throw new SQLException("Cannot initial database connection, because it's NULL.");
        }
        return conn;
    }

    public Connection openCenterDBConnection() throws Exception {
        Connection conn;
        Class.forName("org.postgresql.Driver");
        ReadXMLConfig();
        String CONNECTION_DB = db_postgres_jdbc + server_center + db_postgres_dbcenter;
        byte[] user_decode = Base64.decodeBase64(db_postgres_center_user);
        byte[] pass_decode = Base64.decodeBase64(db_postgres_center_pass);
        conn = DriverManager.getConnection(CONNECTION_DB, new String(user_decode), new String(pass_decode));
        if (conn == null) {
            throw new SQLException("Cannot initial database connection, because it's NULL.");
        }
        return conn;
    }

    public Connection openMySQLDBConnection() throws Exception {
        Connection conn;
        Class.forName("com.mysql.jdbc.Driver");
        ReadXMLConfig();
        String CONNECTION_DB = db_mysql_jdbc + db_mysql_server + db_mysql_weight_scale_database;
        byte[] user_decode = Base64.decodeBase64(db_mysql_username);
        byte[] pass_decode = Base64.decodeBase64(db_mysql_password);
        conn = DriverManager.getConnection(CONNECTION_DB, new String(user_decode), new String(pass_decode));
        if (conn == null) {
            throw new SQLException("Cannot initial database connection, because it's NULL.");
        }
        return conn;
    }

    public void ReadXMLConfig() throws Exception {
        XPath xpath = XPathFactory.newInstance().newXPath();
        InputSource inputSource = new InputSource("cgc_config.xml");
        try {

            //System.out.println("In Class");
            //System.out.println("xpath = " + xpath );
            //System.out.println("inputSource = " + inputSource );
            db_postgres_server = xpath.evaluate("//server", inputSource);
            db_postgres_server_bw = xpath.evaluate("//server_bw", inputSource);

            db_postgres_dbma = xpath.evaluate("//db_ma", inputSource);
            db_postgres_dberp = xpath.evaluate("//db_erp", inputSource);
            db_postgres_username = xpath.evaluate("//db_user", inputSource);
            db_postgres_password = xpath.evaluate("//db_pass", inputSource);

            db_postgres_dbcenter = xpath.evaluate("//db_ma_center", inputSource);
            db_postgres_center_user = xpath.evaluate("//db_center_db_user", inputSource);
            db_postgres_center_pass = xpath.evaluate("//db_center_db_pass", inputSource);


            db_mysql_server = xpath.evaluate("//server_mysql_weight", inputSource);
            db_mysql_weight_scale_database = xpath.evaluate("//db_mysql_weight", inputSource);
            db_mysql_username = xpath.evaluate("//db_mysql_weight_user", inputSource);
            db_mysql_password = xpath.evaluate("//db_mysql_weight_pass", inputSource);
/*
            System.out.println("db_postgres_server = " + db_postgres_server );
            System.out.println("db_postgres_dbma = " + db_postgres_dbma );
            System.out.println("db_postgres_dberp = " + db_postgres_dberp );
            System.out.println("db_postgres_username = " + db_postgres_username );
            System.out.println("db_postgres_password = " + db_postgres_password );

            System.out.println("db_postgres_dbcenter = " + db_postgres_dbcenter );
            System.out.println("db_postgres_center_user = " + db_postgres_center_user );
            System.out.println("db_postgres_center_pass = " + db_postgres_center_pass );
            System.out.println("db_mysql_server = " + db_mysql_server );
            System.out.println("db_mysql_weight_scale_database = " + db_mysql_weight_scale_database );
            System.out.println("db_mysql_username = " + db_mysql_username );
            System.out.println("db_mysql_password = " + db_mysql_password );
*/

        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
    }

}
