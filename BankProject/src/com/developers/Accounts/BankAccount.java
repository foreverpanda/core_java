package com.developers.Accounts;

public abstract  class BankAccount {
	public String accountNumber;
	public double balance;
	private String customerName;
	private String phoneNumber;
	public BankAccount(String accountNumber, double balance, String customerName, String phoneNumber) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
	}
	
	
	public abstract double getBalance() ;
	protected abstract void setBalance(double amount);
	public abstract double deposit(double amount);
	public abstract void withdraw(double amount);
	public abstract String getAccountNumber();
	public String toString() {
		return "Account Number : "+ accountNumber +
				"\nAccount holder Name : " + customerName + 
				"\nRegistered Mobile Number : "+ phoneNumber;
	}
	
	
}
