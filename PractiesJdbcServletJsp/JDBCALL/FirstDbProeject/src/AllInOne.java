import java.sql.*;

import DatabaseConnection.DriverLoad;
public class AllInOne {
    public static void main(String[] args) throws Exception {

        try {

            Connection conn = DriverLoad.getCon();
            Statement st = conn.createStatement();
            // st.executeUpdate("create database bhtest");  //create database using statement
            st.execute("use bhtest");   //st.executeUpdate("") // st.executequery();Not do data manipulation with this

            // st.executeUpdate("create table testb (id int auto_increment primary key, name varchar(30) not null, email varchar(30) not null, password varchar(30) not null,mobile int)");
            

            PreparedStatement pst = conn.prepareStatement("insert into testb (name, email, password, mobile) values('bha','bkbhesniya11@gmail.com','Bh@vine',79883)");
            // pst.executeUpdate();

            
            ResultSet rs =pst.executeQuery("select * from testb where id =1");
            int idno,mono;
            String nm , em , pass;

            while(rs.next()) {
                idno = rs.getInt(1);
                nm = rs.getString(2);
                em = rs.getString(3);
                pass = rs.getString(4);
                mono = rs.getInt(5);
                System.out.println(idno + " " + nm + " " + em + " " +pass +" " + mono);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
