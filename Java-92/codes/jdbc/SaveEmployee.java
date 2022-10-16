package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SaveEmployee {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_edureka", "root", "root");
		
		Statement st = con.createStatement();
		
		String sql = "insert into emp values(101, 'Sunil', 2500)";
		
		try {
			int employeesSaved = st.executeUpdate(sql);
			System.out.println("Employees Saved = " + employeesSaved);
		}
		catch(Exception ex) {
			System.out.println(ex.toString());
		}
		
		st.close();
		con.close();
	}
}
