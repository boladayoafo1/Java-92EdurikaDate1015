package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class BatchExec {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDBConnection();
		
		Statement st = con.createStatement();
		
		con.setAutoCommit(false);
		
		st.addBatch("insert into emp values(110, 'User-1', 2500)");
		st.addBatch("insert into emp values(111, 'User-2', 3500)");
		//st.addBatch("insert into emp values(110, 'User-3', 4500)");
		st.addBatch("insert into emp values(112, 'User-3', 4500)");
		st.addBatch("update emp set sal=5000");
		
		try {
			int[] rowsAffected = st.executeBatch();
			for(int x : rowsAffected) {
				System.out.println("employees updated = " + x);
				con.commit();
			}
		}catch(Exception ex) {
			System.out.println(ex);
			con.rollback();
		}
		finally {
			st.close();
			con.close();
		}
	}

}
