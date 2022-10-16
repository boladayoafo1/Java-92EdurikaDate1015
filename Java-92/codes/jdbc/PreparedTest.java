package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedTest {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDBConnection();

		PreparedStatement pst = con.prepareStatement("insert into emp values(?,?,?)");

		Scanner sc = new Scanner(System.in);

		String req = "Y";
		while (req.equalsIgnoreCase("Y")) {
			System.out.print("enter employee no: ");
			int eno = sc.nextInt();
			sc.nextLine();

			System.out.print("enter employee name: ");
			String name = sc.nextLine();

			System.out.print("enter employee salary: ");
			float sal = sc.nextFloat();

			pst.setInt(1, eno);
			pst.setString(2, name);
			pst.setFloat(3, sal);
			try {
				int employeesSaved = pst.executeUpdate();
				System.out.println("Employees Saved\n");
			} catch (Exception ex) {
				System.out.println(ex.toString());
			}

			System.out.print("do you want to save more employees[Y/N]: ");
			req = sc.next();
		} // while

		pst.close();
		con.close();
	}
}
