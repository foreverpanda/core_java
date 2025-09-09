package com.developers.tester;

import java.util.Scanner;

import com.developers.Accounts.BankAccount;
import com.developers.Accounts.CurrentAccount;
import com.developers.Accounts.SavingAccount;
import com.developers.OpenAccount.*;

public class TestBanking {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BankAccount[] bankAccounts = new BankAccount[100]; // max support of 100 accounts

		boolean exit = false;
		int counter = 0;
		while (!exit) {
			System.out.println(
					"\n1. Open Saving Account\n2. Open Current Account\n3. Display Account Summary \n4. Deposit\n5. Withdraw \n6. Exit\n");
			int choice = sc.nextInt();
			switch (choice) {

			case 1: {
				System.out.println("Enter AccountNumber : ");
				String accNumber = sc.next();
				System.out.println("Enter deposited balance : ");
				double balance = sc.nextDouble();
				System.out.println("Enter Customer name : ");
				String customerName = sc.next();
				System.out.println("Enter phone number : ");
				String phoneNumber = sc.next();

				bankAccounts[counter++] = OpenAccount.openSavingAccount(accNumber, balance, customerName, phoneNumber);
				break;
			}
			case 2:

			{
				System.out.println("Enter AccountNumber : ");
				String accNumber = sc.next();
				System.out.println("Enter deposited balance : ");
				double balance = sc.nextDouble();
				System.out.println("Enter Customer name : ");
				String customerName = sc.next();
				System.out.println("Enter phone number : ");
				String phoneNumber = sc.next();
				System.out.println("Enter Overdraft Limit : ");
				double overDraftLimit = sc.nextDouble();

				bankAccounts[counter++] = OpenAccount.openCurrentAccount(accNumber, balance, customerName, phoneNumber,
						overDraftLimit);
				break;
			}
			case 3: {
				System.out.println("Please enter Account Number : ");
				String accountNumber = sc.next();
				int found = 0;
				for (BankAccount i : bankAccounts) {
					if (i instanceof CurrentAccount) {
						String compthis = ((CurrentAccount) i).getAccountNumber();
						if (compthis.equals(accountNumber)) {
							System.out.println(((CurrentAccount) i).toString());
						}

					} else if (i instanceof SavingAccount) {
						String compthis = ((SavingAccount) i).getAccountNumber();
						if (compthis.equals(accountNumber)) {
							System.out.println(((SavingAccount) i).toString());
						}
					}
				}
				if (found == 0)
					System.out.println("INVALID ACCOUNT NUMBER");

				break;
			}
			case 4: {
				System.out.println("Please enter Account Number : ");
				String accountNumber = sc.next();
				int found = 0;
				for (BankAccount i : bankAccounts) {
					if (i instanceof CurrentAccount) {
						String compthis = ((CurrentAccount) i).getAccountNumber();
						if (compthis.equals(accountNumber)) {
							System.out.println("Enter Deposit amount : ");
							double amt = sc.nextDouble();
							((CurrentAccount) i).deposit(amt);
							found = 1;
						}

					} else if (i instanceof SavingAccount) {
						String compthis = ((SavingAccount) i).getAccountNumber();
						if (compthis.equals(accountNumber)) {
							System.out.println("Enter Deposit amount : ");
							double amt = sc.nextDouble();
							((SavingAccount) i).deposit(amt);
							found = 1;
						}
					}

				}
				if (found == 0)
					System.out.println("INVALID ACCOUNT NUMBER");
				break;
			}

			case 5: {
				System.out.println("Please enter Account Number : ");
				String accountNumber = sc.next();
				int found = 0;
				for (BankAccount i : bankAccounts) {
					if (i instanceof CurrentAccount) {
						String compthis = ((CurrentAccount) i).getAccountNumber();
						if (compthis.equals(accountNumber)) {
							System.out.println("Enter Withdraw amount : ");
							double amt = sc.nextDouble();
							((CurrentAccount) i).withdraw(amt);
							found = 1;
						}

					} else if (i instanceof SavingAccount) {
						String compthis = ((SavingAccount) i).getAccountNumber();
						if (compthis.equals(accountNumber)) {
							System.out.println("Enter withdraw amount : ");
							double amt = sc.nextDouble();
							((SavingAccount) i).withdraw(amt);
							found = 1;
						}
					}

				}
				if (found == 0)
					System.out.println("INVALID ACCOUNT NUMBER");
				break;
			}

			case 6:
				exit = true;
				break;
			}

		}
	}
}