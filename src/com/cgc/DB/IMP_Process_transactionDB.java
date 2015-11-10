/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cgc.DB;

import com.cgc.Util.UtiDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

/**
 *
 * @author Beckeck
 */
public class IMP_Process_transactionDB {

    UtiDatabase objuti;

    public void generater_transaction_process(String date_from, String date_to, String process_id, String table, String doc_type, String r, String username) throws Exception {
        String Str_Writer, SQL, prod_cond, table_h, table_d, table_cred = "mcredit";
        //DBConnect objcon = new DBConnect();
        Connection con_mysql = new DBConnect().openMySQLDBConnection();
        Connection con_postgress = new DBConnect().openERPConnection();
        ResultSet rs = null;
        objuti = new UtiDatabase();
        java.util.Date date = new java.util.Date();
        System.out.println(new Timestamp(date.getTime()));
        java.sql.Timestamp timestamp = new java.sql.Timestamp(date.getTime());

        System.out.println(date_from + " - " + date_to);
        System.out.println("A = " + process_id + " - " + process_id);

        if (process_id.equals("RAWMAT")) {
            prod_cond = " (prod_code = '03' or prod_code = '04' or prod_code = '05' or prod_code = '14' or prod_code = '18' or prod_code = '19') ";
            table_h = "d_ticketbuy_doc";
            table_d = "d_ticketbuy";
        } else {
            prod_cond = " (prod_code = '10' or prod_code = '11' or prod_code = '32') ";
            table_h = "d_ticketbuy_fuel_doc";
            table_d = "d_ticketbuy_fuel";
        }

        String SQL_Search, SQL_Search_Rec, SQL_Search_Cred, sql_cred;

        try {

            SQL = "select ticket_text,truck_no,date_in,time_in,date_out,time_out,load_in,load_out,net_wght,cred_name,prod_code,prod_name"
                    + ",substring(Date_In,1,2) as date1,substring(Date_In,4,2) as month1,(cast(substring(Date_In,7,4) as SIGNED )+543) as year1"
                    + ",substring(Date_Out,1,2) as date2,substring(Date_Out,4,2) as month2,(cast(substring(Date_Out,7,4) as SIGNED )+543) as year2"
                    + ",cost_unt,cred_code from ticketbuy"
                    + " where ticket_text <> '' and "
                    + prod_cond
                    + " and "
                    + " str_to_date(date_in,'%d/%m/%Y')"
                    + " between str_to_date('" + objuti.Format_Date_For_Mysql(date_from) + "','%d-%m-%Y') and  str_to_date('" + objuti.Format_Date_For_Mysql(date_to) + "','%d-%m-%Y')"
                    + " order by ticket ";

            System.out.println("SQL = " + SQL);
            rs = con_mysql.createStatement().executeQuery(SQL);
            int i = 6;
            while (rs.next()) {

                SQL_Search_Rec = "Select Count(doc_id) As num from  " + table_h + " where doc_id ='" + objuti.NotNull(rs.getString("date1")) + "-" + objuti.NotNull(rs.getString("month1")) + "-" + objuti.NotNull(rs.getString("year1"))
                        + "' and delete_flag <> 'Y'  ";
                int rec_count = objuti.numRowdatabase(SQL_Search_Rec);
                if (rec_count == 0) {

                    System.out.println("SQL rec_count = " + SQL_Search_Rec);
                    System.out.println("rec_count = " + rec_count);

                    String sql_doc = "insert into " + table_h + "(doc_id,doc_date,doc_time,create_date,create_by) values (?,?,?,?,?)";

                    PreparedStatement p1;
                    p1 = con_postgress.prepareStatement(sql_doc);
                    p1.setString(1, objuti.NotNull(rs.getString("date1")) + "-" + objuti.NotNull(rs.getString("month1")) + "-" + objuti.NotNull(rs.getString("year1")));
                    p1.setString(2, objuti.NotNull(rs.getString("date1")) + "-" + objuti.NotNull(rs.getString("month1")) + "-" + objuti.NotNull(rs.getString("year1")));
                    p1.setString(3, objuti.NotNull(rs.getString("time_in")));
                    p1.setTimestamp(4, timestamp);
                    p1.setString(5, "System Import");
                    p1.executeUpdate();

                }

                SQL_Search = "Select Count(ticket_text) As num from   " + table_d + "  where ticket_text ='" + rs.getString("ticket_text") + "' and delete_flag <> 'Y'  ";
                int a = objuti.numRowdatabase(SQL_Search);
                if (a == 0) {
                    String sql1 = "insert into " + table_d + " (ticket_text,truck_no,date_in,time_in,date_out"
                            + ",time_out,cred_name,prod_code,prod_name,load_in,load_out,net_wght,cost_unt,date1,month1,year1,create_date,create_by,doc_id,doc_date,doc_time,date2,month2,year2,cred_code,net_weight_receive)"
                            + " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    System.out.println("sql1 = " + sql1);
                    PreparedStatement p;
                    p = con_postgress.prepareStatement(sql1);
                    p.setString(1, objuti.NotNull(rs.getString("ticket_text")));
                    p.setString(2, objuti.NotNull(rs.getString("truck_no")));
                    p.setString(3, objuti.NotNull(rs.getString("date1")) + "-" + objuti.NotNull(rs.getString("month1")) + "-" + objuti.NotNull(rs.getString("year1")));
                    //p.setString(3, objuti.NotNull(rs.getString("date_in")));                    
                    p.setString(4, objuti.NotNull(rs.getString("time_in")));
                    p.setString(5, objuti.NotNull(rs.getString("date2")) + "-" + objuti.NotNull(rs.getString("month2")) + "-" + objuti.NotNull(rs.getString("year2")));
                    //p.setString(5, objuti.NotNull(rs.getString("date_out")));
                    p.setString(6, objuti.NotNull(rs.getString("time_out")));
                    p.setString(7, objuti.NotNull(rs.getString("cred_name")));
                    p.setString(8, objuti.NotNull(rs.getString("prod_code")));
                    p.setString(9, objuti.NotNull(rs.getString("prod_name")));
                    p.setString(10, objuti.NotNull(rs.getString("load_in")));
                    p.setString(11, objuti.NotNull(rs.getString("load_out")));
                    p.setString(12, objuti.NotNull(rs.getString("net_wght")));
                    p.setString(13, objuti.NotNull(rs.getString("cost_unt")));
                    p.setString(14, objuti.NotNull(rs.getString("date1")));
                    p.setString(15, objuti.NotNull(rs.getString("month1")));
                    p.setString(16, objuti.NotNull(rs.getString("year1")));
                    p.setTimestamp(17, timestamp);
                    p.setString(18, "System Import");
                    p.setString(19, objuti.NotNull(rs.getString("date1")) + "-" + objuti.NotNull(rs.getString("month1")) + "-" + objuti.NotNull(rs.getString("year1")));
                    p.setString(20, objuti.NotNull(rs.getString("date1")) + "-" + objuti.NotNull(rs.getString("month1")) + "-" + objuti.NotNull(rs.getString("year1")));
                    p.setString(21, objuti.NotNull(rs.getString("time_in")));
                    p.setString(22, objuti.NotNull(rs.getString("date2")));
                    p.setString(23, objuti.NotNull(rs.getString("month2")));
                    p.setString(24, objuti.NotNull(rs.getString("year2")));
                    p.setString(25, objuti.NotNull(rs.getString("cred_code")));
                    p.setString(26, objuti.NotNull(rs.getString("net_wght")));
                    p.executeUpdate();

                    SQL_Search_Cred = "Select Count(cred_code) As num from   " + table_cred + "  where cred_code ='" + rs.getString("cred_code") + "' and delete_flag <> 'Y'  ";
                    int b = objuti.numRowdatabase(SQL_Search_Cred);
                    if (b == 0) {
                        sql_cred = "insert into " + table_cred + " (cred_code,cred_name) values (?,?)";
                        System.out.println("sql_cred = " + sql_cred);
                        PreparedStatement p_cred;
                        p_cred = con_postgress.prepareStatement(sql_cred);
                        p_cred.setString(1, objuti.NotNull(rs.getString("cred_code")));
                        p_cred.setString(2, objuti.NotNull(rs.getString("cred_name")));
                        p_cred.executeUpdate();
                    }

                } else {
                    String sql2 = "update " + table_d + " set ticket_text=?,truck_no=?,date_in=?,time_in=?,date_out=?"
                            //+ ",time_out=?,cred_name=?,prod_code=?,prod_name=?,load_in=?,load_out=?,net_wght=?,cost_unt=?,date1=?,month1=?,year1=?"
                            + ",time_out=?,cred_name=?,prod_code=?,prod_name=?,load_in=?,load_out=?,net_wght=?,date1=?,month1=?,year1=?,date2=?,month2=?,year2=?"
                            + ",update_date=?,update_by=?,cred_code=?,net_weight_receive=?"
                            + " where ticket_text = '" + rs.getString("ticket_text") + "'";
                    System.out.println("sql2 = " + sql2);
                    PreparedStatement p;
                    p = con_postgress.prepareStatement(sql2);
                    p.setString(1, objuti.NotNull(rs.getString("ticket_text")));
                    p.setString(2, objuti.NotNull(rs.getString("truck_no")));
                    p.setString(3, objuti.NotNull(rs.getString("date1")) + "-" + objuti.NotNull(rs.getString("month1")) + "-" + objuti.NotNull(rs.getString("year1")));
                    //p.setString(3, objuti.NotNull(rs.getString("date_in")));                    
                    p.setString(4, objuti.NotNull(rs.getString("time_in")));
                    p.setString(5, objuti.NotNull(rs.getString("date2")) + "-" + objuti.NotNull(rs.getString("month2")) + "-" + objuti.NotNull(rs.getString("year2")));
                    //p.setString(5, objuti.NotNull(rs.getString("date_out")));
                    p.setString(6, objuti.NotNull(rs.getString("time_out")));
                    p.setString(7, objuti.NotNull(rs.getString("cred_name")));
                    p.setString(8, objuti.NotNull(rs.getString("prod_code")));
                    p.setString(9, objuti.NotNull(rs.getString("prod_name")));
                    p.setString(10, objuti.NotNull(rs.getString("load_in")));
                    p.setString(11, objuti.NotNull(rs.getString("load_out")));
                    p.setString(12, objuti.NotNull(rs.getString("net_wght")));
                    //p.setString(13, objuti.NotNull(rs.getString("cost_unt")));                        
                    p.setString(13, objuti.NotNull(rs.getString("date1")));
                    p.setString(14, objuti.NotNull(rs.getString("month1")));
                    p.setString(15, objuti.NotNull(rs.getString("year1")));
                    p.setString(16, objuti.NotNull(rs.getString("date2")));
                    p.setString(17, objuti.NotNull(rs.getString("month2")));
                    p.setString(18, objuti.NotNull(rs.getString("year2")));
                    p.setTimestamp(19, timestamp);
                    p.setString(20, "System Import");
                    p.setString(21, objuti.NotNull(rs.getString("cred_code")));
                    p.setString(22, objuti.NotNull(rs.getString("net_wght")));
                    p.executeUpdate();

                    SQL_Search_Cred = "Select Count(cred_code) As num from   " + table_cred + "  where cred_code ='" + rs.getString("cred_code") + "' and delete_flag <> 'Y'  ";
                    int b = objuti.numRowdatabase(SQL_Search_Cred);
                    if (b == 0) {
                        sql_cred = "insert into " + table_cred + " (cred_code,cred_name) values (?,?)";
                        System.out.println("sql_cred = " + sql_cred);
                        PreparedStatement p_cred;
                        p_cred = con_postgress.prepareStatement(sql_cred);
                        p_cred.setString(1, objuti.NotNull(rs.getString("cred_code")));
                        p_cred.setString(2, objuti.NotNull(rs.getString("cred_name")));
                        p_cred.executeUpdate();
                    }
                }
                i++;
            }
            System.out.println("End Process ::: " + timestamp);

        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (con_mysql != null) {
                con_mysql.close();
            }
        }

    }
}
