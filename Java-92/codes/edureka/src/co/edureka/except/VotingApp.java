package co.edureka.except;

import java.util.Scanner;

public class VotingApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		String req = "Y";
		
		while(req.equalsIgnoreCase("Y")) {
			try {
				System.out.print("enter the age of voter: ");
				int age = sc.nextInt();
				
				if(age >= 18) {
					System.out.println("Voting Done <beep><beep>");
				}else {
					throw new InvalidAgeException("age should be >= 18");
				}
			}catch(Exception ex) {
				System.out.println(ex.toString());
			}
			
			System.out.print("\nanyone else in queue [Y/N]: ");
			req = sc.next();
		}//while

	}

}
