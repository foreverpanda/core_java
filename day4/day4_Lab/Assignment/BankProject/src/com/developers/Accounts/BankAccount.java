package com.developers.Accounts;

abstract  class BankAccount {
	private String accountNumber;
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
	
	
	protected abstract double getBalance() ;
	protected abstract void setBalance(double amount);
	protected abstract double deposit(double amount);
	protected abstract void withdraw(double amount);
	
	public String toString() {
		return "Account Number : "+ accountNumber +
				"\nAccount holder Name : " + customerName + 
				"\nRegistered Mobile Number : "+ phoneNumber;
	}
	
	
}
