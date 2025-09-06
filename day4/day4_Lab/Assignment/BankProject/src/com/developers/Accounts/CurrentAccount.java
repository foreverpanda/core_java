package com.developers.Accounts;

public class CurrentAccount extends BankAccount {

	private double overDraftLimit = 5000;

	public CurrentAccount(String accountNumber, double balance, String customerName, String phoneNumber) {
		super(accountNumber, balance, customerName, phoneNumber);

	}

	public void useOverdraftFacility(double amount) {
		balance = balance + overDraftLimit;
		balance = balance - amount;
		overDraftLimit = balance;
		balance = 0;
		System.out.println("Remaining OverdraftLimit : " + overDraftLimit);

	}

	@Override
	public double deposit(double amount) {
		this.balance += amount;
		System.out.println("Amount deposited Successfully");
		return balance;
	}
	
	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public void setBalance(double amount) {

	}
	
	@Override
	public void withdraw(double amount) {

			if(balance >= amount) {
				balance = balance- amount;
				
			}
		
			else if (amount > balance + overDraftLimit) {
			System.out.println("Insufficient Balance");
		} else {
			useOverdraftFacility(amount);
		}

	}
	
	
	public String toString() {
		return "Current Account " + super.toString();
	}

}
