package co.edureka.except;

class UserService{
	public void findUser() throws java.sql.SQLException {
		System.out.println("finding user");
	}
}

public class ThrowsTest {

	public static void main(String[] args) throws InterruptedException {
		UserService service = new UserService();
		try {
			service.findUser();
		}catch(Exception ex) {}
		
		System.out.println("please wait for 4 seconds");
		Thread.sleep(4000); //4000 milliseconds
		System.out.println("thank you!!!");
	}

}
