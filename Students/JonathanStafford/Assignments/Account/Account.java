package ssa;

import java.text.DecimalFormat;

//A bank account
class Account {
	private int accountId; // unique identifier for the account
	String description; // a user defined name for the account
	private double balance; // the amount in the account.

	public int getAccountId() {
		return accountId;
	}

	private void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public double getBalance() {
		return balance;
	}

	private void setBalance(double balance) {
		this.balance = balance;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	// returns the account info as a string
	public String print() {
		return "Account: id is " + accountId + ", desc is " + description + ", balance is $" + balance;
		  
	}

	// deposit into the account
	double deposit(double amount) {
		this.balance += amount;DecimalFormat df = new DecimalFormat("#.00");
		 
		return this.balance;
	}

	// withdraw from the account, but cannot go negative
	double withdraw(double amount) {
		
		if (amount > balance) {
			System.out.println("Insufficient funds!");
		} else {
			this.balance -= amount;
			
		}
		return this.balance;
	}

	public double transferFrom(Account account, double amount) {
		if (amount > account.getBalance()) {
			System.out.println("Insufficient funds!");
		} else {
			 account.withdraw(amount);
			 this.deposit(amount);
		}
		return this.balance; 
			
		
	}
	public Account(int accountId, String description) {
		this.accountId = accountId;
		this.description = description;
		this.balance = 0;
		accountId = ((int) (Math.random() * (10) + 1));
	}
	public Account(String description) {
		this.description = description;
		this.balance = 0;
		this.accountId = ((int) (Math.random() * (10) + 1));
	}

	public Account() {
		this.balance = 0;
		this.accountId = ((int) (Math.random() * (10) + 1));
	}
}