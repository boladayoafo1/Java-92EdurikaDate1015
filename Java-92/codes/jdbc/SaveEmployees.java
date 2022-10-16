package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class SaveEmployees {

	public static void main(String[] args) throws Exception {		
		
		Connection con = ConnectionFactory.getDBConnection();
		
		Statement st = con.createStatement();
		
		//String sql = "insert into emp values(102, 'Anil', 2500)";
		String sql = "insert into emp(empno, ename, sal) values (103, 'Praveen', 3500), (104, 'Sanjay', 8525.5),"
				+ "(105, 'Kishore', 7500), (106, 'Vaishnav', 3750)";
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
