package com.developers.tester;
import com.developers.Accounts.*;
import java.util.*;
public class TestBanking {

	
	static void ssavingAccount(SavingAccount s) {
		boolean exit = false;
		Scanner sc = new Scanner(System.in);

		
		while(!exit) {
			System.out.println("\n1. Check Balance\n2. Withdraw Amount\n3. Account Summary\n4. Deposit Amount\n5. Exit\n");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: System.out.println("Account Balance : "+s.getBalance()); break;
			case 2 : System.out.println("Enter Amount to withdraw : ");
			s.withdraw(sc.nextDouble());break;
			case 3: System.out.println(s.toString());; break;
			case 4: System.out.println("Enter deposit amount : ");
			s.deposit(sc.nextDouble());break;
			case 5 : exit=true;
			}

		}
	}
	
	static void ccurrAccount(CurrentAccount c) {
		
	}
	
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		CurrentAccount currAcc = new CurrentAccount("1111 2222 3333 4444",10000,"Ritesh Deshmukh", "+91 92140410");		
		SavingAccount saveAcc = new SavingAccount("1111 2222 3333 4444",10000,"Ritesh Deshmukh", "+91 92140410");
		
		
		boolean exit = false;
		while(!exit) {
			System.out.println("\n1. Use Saving Account\n2. Use Current Account\n3. Exit\n");
			int choice = sc.nextInt();
			switch (choice) {
			
			case 1: ssavingAccount(saveAcc); break;
			
			case 2 : ccurrAccount(currAcc); break;
			
			case 3: exit = true; break;
			}
		}
	
}
}