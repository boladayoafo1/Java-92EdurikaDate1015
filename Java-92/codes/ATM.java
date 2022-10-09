import java.util.Scanner;

public class ATM 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Bank bank = null;

		System.out.print("which bank's card[1.SBI | 2.ICICI]? ");
		int bankType = sc.nextInt();
		
		switch(bankType){
			case 1:
				bank = new SBI();
				break;
			case 2:
				bank = new ICICI();
				break;
			default:
				System.out.println("Card Read Error... Try Again");
				return;
		}//switch

		System.out.println("\n=================== WELCOME TO "+bank.getClass().getName().toUpperCase()+" ===================\n"); 

		bank.deposit(1000);
		bank.withdraw(500);
		System.out.println();
		
		System.out.println(Bank.n);
		System.out.println(bank.n);
		System.out.println(SBI.n);
		System.out.println(ICICI.n);
	}
}
