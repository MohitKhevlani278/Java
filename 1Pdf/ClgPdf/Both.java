import java.sql.*;
import java.io.*;

public class Both {
	public static void main(String args[]) {
		try {

			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con = DriverManager.getConnection("Jdbc:Odbc:DSN2");

			PreparedStatement ps = con.prepareStatement("insert into tab values(?,?)");

			System.out.println("Enter Id : ");
			int id = Integer.parseInt(br.readLine());
			System.out.println("Enter Name:  ");
			String nm = br.readLine();

			ps.setInt(1, id);
			ps.setString(2, nm);

			int i = ps.executeUpdate();
			System.out.println("Record Insert");

			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

			System.out.println("Enter Record to search : ");
			int no = Integer.parseInt(br.readLine());

			ResultSet rs = st.executeQuery("select * from tab");
			rs.absolute(no);
			System.out.println("record");

			System.out.println("Record" + rs.getInt("ID"));
			System.out.println("Record" + rs.getString("Name"));

			ps.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}