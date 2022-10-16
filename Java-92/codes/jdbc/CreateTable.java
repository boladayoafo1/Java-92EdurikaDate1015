package co.edureka.jdbc;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public class CreateTable {

	public static void main(String[] args) throws Exception {
		//-- initialize MySQL JDBC Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//-- connect to MySQL db_edureka database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_edureka", "root", "root");
		
		//-- create an instance for passing SQL to connected DB
		Statement st = con.createStatement();
		
		//-- pass the SQL query to create DB table
		String sql = "create table emp(empno int(5), ename varchar(30), sal float(10,2), primary key(empno))";
		
		try {
			st.execute(sql);
			System.out.println("Database Table Created!");
		}
		catch(Exception ex) {
			System.out.println("DB Table could not be created --> " + ex.toString());
		}
		
		//-- close the connection with database
		st.close();
		con.close();
	}
}
