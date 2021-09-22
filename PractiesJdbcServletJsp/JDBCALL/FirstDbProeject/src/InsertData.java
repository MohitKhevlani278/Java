import java.sql.*;

import DatabaseConnection.DriverLoad;

public class InsertData {
    public static void main(String[] args) throws Exception {

        try {

            Connection conn = DriverLoad.getCon();

            Statement st = conn.createStatement();
            st.execute("use bhtest");

            PreparedStatement pst = conn.prepareStatement(
                    "insert into testb (name, email, password, mobile) values('bha','bkbhesniya11@gmail.com','Bh@vine',79883)");
            pst.executeUpdate();
            
            System.out.println("Record Insert Successfully");            
            conn.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
