import com.cgc.DB.DBConnect;
import com.cgc.Util.DateUtil;
import com.cgc.Util.OS_Type;
import com.cgc.Util.PeriodDate;
import com.cgc.engine.IMP_Process_transaction;
import com.cgc.engine.Process_transaction_new;
import org.apache.commons.codec.binary.Base64;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class Process_ERP_Transaction {

    public static void main(String args[]) {

        Process_Transaction();
/*
        Timer myTimer;
        myTimer = new Timer();
        myTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                Process_Transaction();
            }
        }, 0, 60000000);
*/
    }

    private static void Process_Transaction() {
        try {

            Process_transaction_new objcom = new Process_transaction_new();
            IMP_Process_transaction objImp = new IMP_Process_transaction();

            String username = "System", process_for;
            Calendar c = Calendar.getInstance();
            SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");

            PeriodDate period = new PeriodDate();
            DateUtil DaTeU = new DateUtil();
            OS_Type os_type = new OS_Type();

            String date_from = period.Start_Period("S");

            String date_to = DaTeU.Return_Date_Now_full();

            if (os_type.GetOS_Type("Y").equals("WIN")) {
                System.out.println("Y date_to = " + date_to);
            } else {
                date_to = DaTeU.EngDate_To_ThaiDate(DaTeU.Return_Date_Now_full());
                System.out.println("N date_to = " + date_to);
            }

            //System.out.println("export_path = " + os_type.GetPath(os_type.GetOS_Type("Y")));
            //System.out.println("Date Util Return = " + DaTeU.Return_Date_Now_full());


            System.out.println("Select DB start_period : " + date_from);
            System.out.println("Start Process Date : " + new Timestamp(new java.util.Date().getTime()));
            System.out.println("Process " + date_from + " - " + date_to);

            for (int Count = 1; Count <= 2; Count++) {
                process_for = (Count == 1 ? "WAREHOUSE" : "RAWMAT");

                Random r = new Random();
                String r_create = Long.toString(Math.abs(r.nextLong()), 36);

                System.out.println("process_for " + process_for + " Loop " + Count);
                objcom.main_check(date_from, date_to, username, process_for,r_create);
            }

            date_from = DaTeU.ThaiDate_To_ThaiDate(date_from);
            System.out.println("Before date_from = " + date_from);

            if (os_type.GetOS_Type("Y").equals("WIN")) {
                date_to = DaTeU.ThaiDate_To_ThaiDate(DaTeU.Return_Date_Now_full());
                System.out.println("WIN date_to = " + date_to);
            } else {
                System.out.println("Linux DaTeU.ThaiDate_To_ThaiDate(DaTeU.Return_Date_Now_full() = " + DaTeU.ThaiDate_To_ThaiDate(DaTeU.Return_Date_Now_full()));
                date_to = DaTeU.EngDate_To_ThaiDate_Mysql(DaTeU.Return_Date_Now_full());
                System.out.println("Linux date_to = " + date_to);
            }

            System.out.println("Mysql date_from " + date_from);
            System.out.println("Mysql date_to " + date_to);

/*

            for (int Counter = 1; Counter <= 2; Counter++) {
                process_for = (Counter == 1 ? "FUEL" : "RAWMAT");
                System.out.println("process_for " + process_for + " Counter " + Counter);
                objImp.main_check(date_from, date_to, username, process_for);
            }
*/

            System.out.println("End Process Date : " + new Timestamp(new java.util.Date().getTime()));


        } catch (Exception ex) {
            System.out.println("ERROR");
        }

    }

    private static void Encode() {
        try {
            DBConnect dbConnect = new DBConnect();
            ResultSet rs;
            Connection con = dbConnect.openConnection_ERP_Y();
            String Select_UserAcc = "select emp_id,username,password from muser_account limit 1";
            String Update_UserAcc = "";
            PreparedStatement p;
            PreparedStatement p1;
            p = con.prepareStatement(Select_UserAcc);
            System.out.println("Select_UserAcc = " + Select_UserAcc);
            rs = p.executeQuery();

            String Enter_Text_Encode = "-";

            byte[] text_encode = Base64.encodeBase64(Enter_Text_Encode.getBytes());

            System.out.println("text_encode = " + new String(text_encode));

            while (rs.next()) {

                Calendar c = Calendar.getInstance();
                SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
                String formattedDate = df.format(c.getTime());
                System.out.println("Time now : " + formattedDate);

            }

        } catch (Exception ex) {
            System.out.println("ERROR");
        }

    }

}