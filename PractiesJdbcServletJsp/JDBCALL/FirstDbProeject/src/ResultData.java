import java.sql.*;

public class ResultData {
    public static void main(String[] args) throws Exception {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "1234@");
            Statement st = conn.createStatement();
            st.execute("use bhtest");   
            
            ResultSet rs =st.executeQuery("select * from testb where id = 3");
            int idno,mono;
            String nm , em , pass;

            while(rs.next()) {
                idno = rs.getInt(1);
                nm   = rs.getString(2);
                em   = rs.getString(3);
                pass = rs.getString(4);
                mono = rs.getInt(5);
                System.out.println(idno + " " + nm + " " + em + " " +pass +" " + mono);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

