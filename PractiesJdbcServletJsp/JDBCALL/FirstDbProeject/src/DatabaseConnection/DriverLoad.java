package DatabaseConnection;
import java.sql.*;
public class DriverLoad {
    public static Connection getCon(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bhtest","root","1234@");
            return conn;
        }
        catch(ClassNotFoundException | SQLException e)
        {
            return null;
        }
    }
}
