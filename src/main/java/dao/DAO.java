package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
    public static Connection con;

    public DAO(){
        if(con == null){
            String dbUrl = "jdbc:mysql://localhost:3306/xep_hang_tay_dua?autoReconnect=true&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=Asia/Ho_Chi_Minh";
            String dbClass = "com.mysql.cj.jdbc.Driver";

            try {
                Class.forName(dbClass);
                con = DriverManager.getConnection (dbUrl, "root", "newpassword");
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
