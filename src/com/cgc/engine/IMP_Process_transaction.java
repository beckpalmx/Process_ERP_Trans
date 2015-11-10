/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cgc.engine;

import com.cgc.DB.DBConnect;
import com.cgc.DB.IMP_Process_transactionDB;
import java.sql.Connection;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Beckeck
 */
public class IMP_Process_transaction {

    /**
     * @param args the command line arguments
     */
    public String main_check(String doc_date_from, String doc_date_to, String username, String process_for) throws Exception {
        Connection Conn = new DBConnect().openERPConnection();
        StringBuffer String_return = new StringBuffer();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy h:mm:ss");
        Timestamp cur_time = new Timestamp(new java.util.Date().getTime());
        String start_time = sdf.format(cur_time);

        // TODO code application logic here
        try {

            IMP_Process_transactionDB obj = new IMP_Process_transactionDB();
            Random r = new Random();
            String r_create = Long.toString(Math.abs(r.nextLong()), 36);

                //เรียกใช้งานให้ส่ง Parameter ตามนี้ obj.generater_transaction_process(date_from, date_to,process_id,table,doc_type);   
            obj.generater_transaction_process(doc_date_from, doc_date_to, process_for, "d_ticketbuy_doc", "+", r_create, username);

            //}
            Timestamp cur_time2 = new Timestamp(new java.util.Date().getTime());
            String stop_time = sdf.format(cur_time2);
            System.out.println("END Transaction Process ... " + '\n');
            String_return.append("ประมวลผลเสร็จสิ้น " + '\n');
            String_return.append("เริ่มประมวลผลเวลา : " + start_time + '\n');
            String_return.append("เสร็จสิ้นเวลา :           " + stop_time);

            String Insert_Log = "insert into t_process_log (log_id,process_id,start_time,end_time,create_date,create_by,complete_flag) values (?,?,?,?,?,?,?) ";

            PreparedStatement p_log;
            p_log = Conn.prepareStatement(Insert_Log);
            p_log.setString(1, r_create);
            p_log.setString(2, "Import Weight");
            p_log.setTimestamp(3, cur_time);
            p_log.setTimestamp(4, cur_time2);
            p_log.setTimestamp(5, cur_time2);
            p_log.setString(6, username);
            p_log.setString(7, "Y");
            p_log.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        //String_return.append(" ");
        //System.out.println("END Transaction Process ... ");
        //String_return.append("ประมวลผลเสร็จสิ้น");
        return String_return.toString();

    }
}
