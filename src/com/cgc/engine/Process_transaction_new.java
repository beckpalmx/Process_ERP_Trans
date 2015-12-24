/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cgc.engine;

import com.cgc.DB.Process_transactionDB;
import com.cgc.DB.Process_transaction_rawmat_DB;
import com.cgc.DB.Check_MProduct_Price;
import com.cgc.DB.Transfer_MProduct_Price;
import com.cgc.DB.Transfer_MRawmat_Price;
import com.cgc.DB.Check_MRawmat_Price;

//import java.util.Random;
import java.text.SimpleDateFormat;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.cgc.Util.System_Log;

public class Process_transaction_new {

    /**
     * @param date_from
     * @param date_to
     * @param username
     * @param process_for
     * @param log_id
     * @return
     * @throws java.lang.Exception
     */
    System_Log Log = new System_Log();
    Process_transactionDB obj = new Process_transactionDB();
    Process_transaction_rawmat_DB obj_rawmat = new Process_transaction_rawmat_DB();

    public String main_check(String date_from, String date_to, String username, String process_for, String log_id) throws Exception {
        StringBuilder String_return = new StringBuilder();
        String date_from_send1, date_to_send1, date_from_send2, date_to_send2, date_from_send3, date_to_send3, date_from_send4, date_to_send4, Time_Loop;
        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        System.out.println("A date_from = " + date_from);
        System.out.println("A date_to = " + date_to);
        int day_f = Integer.parseInt(date_from.substring(0, 2));
        int month_f = Integer.parseInt(date_from.substring(3, 5));
        int year_f = Integer.parseInt(date_from.substring(6, 10)) - 543;

        int day_t = Integer.parseInt(date_to.substring(0, 2));
        int month_t = Integer.parseInt(date_to.substring(3, 5));
        int year_t = Integer.parseInt(date_to.substring(6, 10)) - 543;

        calendar1.set(year_f, month_f, day_f);
        calendar2.set(year_t, month_t, day_t);

        long milsecs1 = calendar1.getTimeInMillis();
        long milsecs2 = calendar2.getTimeInMillis();
        long diff_1 = milsecs2 - milsecs1;

        long dsecs = diff_1 / 1000;
        //long dminutes = diff_1 / (60 * 1000);
        //long dhours = diff_1 / (60 * 60 * 1000);
        long ddays = diff_1 / (24 * 60 * 60 * 1000);

        System.out.println("Your Day Difference=" + dsecs);

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy h:mm:ss");

        Timestamp cur_time = new Timestamp(new java.util.Date().getTime());
        String Sql_Ins = "insert into t_process_log_transaction (log_id,process_id,start_time,end_time,create_date,create_by,remark) "
                + "values ('" + log_id + "','" + process_for + "','" + cur_time + "','" + cur_time + "','" + cur_time + "','" + username + "','START')";

        System.out.println("Sql_Ins = " + Sql_Ins);

        Log.WriteTimeStamp(Sql_Ins);
        String start_time = sdf.format(cur_time);

        Check_MProduct_Price obj_prd_price = new Check_MProduct_Price();
        Transfer_MProduct_Price obj_transfer_prd_price = new Transfer_MProduct_Price();
        Check_MRawmat_Price obj_rawmat_price = new Check_MRawmat_Price();
        Transfer_MRawmat_Price obj_transfer_raw_price = new Transfer_MRawmat_Price();

        try {
            if (process_for.equals("WAREHOUSE")) {

                obj_transfer_prd_price.generater_transaction_process(date_from, date_to, "PRODUCT_PRICE", "mproduct_price", "X", log_id, username);
                obj_prd_price.generater_transaction_process(date_from, date_to, "PRODUCT_PRICE", "mproduct_price", "X", log_id, username);

                startProcess(date_from, date_to, "PR_034", "vd_carbon_withdraw_detail_wh", "-", log_id, username);
                startProcess(date_from, date_to, "PR_036", "vd_product_receive_detail_prod_wh_report", "+", log_id, username);
                startProcess(date_from, date_to, "PR_040", "vd_packing_product_detail_wh", "-", log_id, username);
                startProcess(date_from, date_to, "PR_041", "vd_packing_product_detail_prod_wh", "+", log_id, username);
                startProcess(date_from, date_to, "PR_042", "vd_requisition_product_detail_wh", "-", log_id, username);
                startProcess(date_from, date_to, "PR_114", "vd_carbon_return_detail_wh", "+", log_id, username);
                startProcess(date_from, date_to, "PR_115", "vd_adjust_product_detail", "*", log_id, username);
                startProcess(date_from, date_to, "PR_029", "vd_carbon_burn_out_detail_wh_complete", "+", log_id, username);
                startProcess(date_from, date_to, "PR_060", "vd_carbon_send_product_detail", "+", log_id, username);

            } else {

                System.out.println("Begin RAWMAT ");
                obj_transfer_raw_price.generater_transaction_process(date_from, date_to, "RAWMAT_PRICE", "mproduct_price", "Y", log_id, username);
                obj_rawmat_price.generater_transaction_process(date_from, date_to, "RAWMAT_PRICE", "mproduct_price", "Y", log_id, username);
                startProcess(date_from, date_to, "PR_022", "vd_rawmatt_receive", "+", log_id, username);
                startProcess(date_from, date_to, "PR_023", "vd_rawmatt_withdraw_detail", "-", log_id, username);
                startProcess(date_from, date_to, "PR_057", "vd_rawmatt_bigbag_withdraw_detail", "-", log_id, username);
                startProcess(date_from, date_to, "PR_117", "vd_adjust_rawmat_detail", "*", log_id, username);
                obj_rawmat.generater_transaction_process(date_from, date_to, "PR_022", "vd_rawmatt_receive", "+", log_id, username);
                obj_rawmat.generater_transaction_process(date_from, date_to, "PR_023", "vd_rawmatt_withdraw_detail", "-", log_id, username);
                obj_rawmat.generater_transaction_process(date_from, date_to, "PR_024", "vd_carbon_friction_withdraw_detail", "-", log_id, username);
                startProcess(date_from, date_to, "PR_025", "vd_carbon_friction_receive_detail_2", "+", log_id, username);
                System.out.println("End RAWMAT ");

            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

        Timestamp cur_time2 = new Timestamp(new java.util.Date().getTime());
        String stop_time = sdf.format(cur_time2);

        Date d1 = sdf.parse(start_time);
        Date d2 = sdf.parse(stop_time);

        long diff = d2.getTime() - d1.getTime();
        long diffSeconds = diff / 1000 % 60;
        long diffMinutes = diff / (60 * 1000) % 60;
        long diffHours = diff / (60 * 60 * 1000) % 24;

        //long diffDays = diff / (24 * 60 * 60 * 1000);        
        String_return.append("ระบบกำลังประมวลผล กรุณารอสักครู่ ... " + '\n');
        return String_return.toString();
    }

    public void startProcess(final String date_from, final String date_to, final String process_id, final String table_name, final String transaction_type, final String log_id, final String username) throws Exception {

        Runnable runnable;
        runnable = new Runnable() {

            @Override
            public void run() {
                try {
                    try {
                        try {
                            Thread.sleep(0);
                        } catch (InterruptedException e) {
                            System.out.println("Info : " + e);
                        }
                        obj.generater_transaction_process(date_from, date_to, process_id, table_name, transaction_type, log_id, username);
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }

                    System.out.println("Final OK");
                    String Str_Proc = "XXX process_id = " + process_id;
                    //System.out.println(Str_Proc);
                    Timestamp cur_time2 = new Timestamp(new java.util.Date().getTime());
                    String Update_Str = "";
                    if (Str_Proc.equals("XXX process_id = PR_060") || Str_Proc.equals("XXX process_id = PR_025")) {
                        System.out.println(Str_Proc);
                        Update_Str = " ,remark = 'FINISH' " ;
                    }

                    String Sql_Update = "Update t_process_log_transaction set end_time = '" + cur_time2 + "',update_date = '"
                            + cur_time2 + "',update_by = '" + username + "',condition = '" + process_id + "'"
                            + Update_Str + " where log_id = '" + log_id + "'";

                    Log.WriteTimeStamp(Sql_Update);

                } catch (Exception ex) {
                    System.out.println(ex);
                    //Logger.getLogger(Process_transaction_rawmat_friction_summary.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        new Thread(runnable).start();
    }

    private void Final_Process(String Time_Loop) throws Exception {
        System.out.println("Final_Process ..." + Time_Loop);
    }

}
