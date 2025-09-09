package com.developers.Accounts;

public class SavingAccount extends BankAccount {
	private double interestRate = 5;

	public SavingAccount(String accountNumber, double balance, String customerName, String phoneNumber) {
		super(accountNumber, balance, customerName, phoneNumber);
	
	}
	
	public void applyInterest() {
		double balance = getBalance();
		balance = balance + (balance * interestRate / 100);
		setBalance(balance);
        System.out.println("InterestRate applied: " + interestRate);
        System.out.println("Updated Balance: " + getBalance());
	}
	
	@Override
	public double deposit(double amount) {
		if(amount >= 500) {
			this.balance += amount;
			System.out.println("Amount deposited Successfully");
			return balance;
		}
		else {
			System.out.println("Minumum Deposit balance is 500");
		}
		
		return balance;
	}

	@Override
	public String getAccountNumber() {
		return accountNumber;
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
		if(amount<0) {
			System.out.println("Invalid amount");
			return;
		}
		
		
		if(amount >=0 && amount <= balance) {
			balance = balance- amount;
			System.out.println("Withdrawal successfull ");
			System.out.println("Remaining Balance : "+ balance);
			
		}
		else {
			System.out.println("Insufficient Balance");
		}
		
		
	}
	
	public String toString() {
		return "Savings Account " + super.toString();
	}

}
