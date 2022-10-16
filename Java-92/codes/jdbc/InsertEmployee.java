package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class InsertEmployee {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDBConnection();
		
		Statement st = con.createStatement();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter employee no: ");
		int eno = sc.nextInt();
		sc.nextLine();
		
		System.out.print("enter employee name: ");
		String name = sc.nextLine();
		
		System.out.print("enter employee salary: ");
		float sal = sc.nextFloat();
		
		String sql = "insert into emp values("+eno+",'"+name+"',"+sal+")";

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
