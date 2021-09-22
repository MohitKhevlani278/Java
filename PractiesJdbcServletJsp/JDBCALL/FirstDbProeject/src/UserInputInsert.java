import java.sql.*;
import java.util.Scanner;

import DatabaseConnection.DriverLoad;

public class UserInputInsert {

    public static void main(String[] args) throws Exception {

        try {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Name : ");
            String nms = sc.nextLine();
            System.out.print("Enter Email : ");
            String email = sc.nextLine();
            System.out.print("Enter Password : ");
            String password = sc.nextLine();
            System.out.print("Enter Mobile No : ");
            int mobile = sc.nextInt();
            sc.close();

            Connection conn = DriverLoad.getCon();

            Statement st = conn.createStatement();
            st.execute("use bhtest");

            PreparedStatement pst = conn.prepareStatement("insert into testb (name, email, password, mobile) values ('"
                    + nms + "','" + email + "','" + password + "','" + mobile + "') ");
            pst.executeUpdate();
            System.out.println("Done Updating");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
