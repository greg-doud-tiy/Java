package ssa;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

//A bank account
class Account {
	int id; // unique identifier for the account
	String description; // a user defined name for the account
	private double balance; // the amount in the account.
	//BigDecimal(String.valueOf(this.balance)).setScale(2, BigDecimal.ROUND_FLOOR);
	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
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
		 DecimalFormat df = new DecimalFormat("#.##");

		    df.setRoundingMode(RoundingMode.FLOOR);

		    double result = new Double(df.format(this.getBalance()));
		return "Account: id is " + id + ", desc is " + description + ", balance is $" + result;

	}

	// deposit into the account
	double deposit(double amount) {
		if (amount <= -1) {
			System.out.println("Invalid deposit!");
		}else{
			this.setBalance(this.getBalance() + amount);
		}
		
		return this.getBalance();
	}

	// withdraw from the account, but cannot go negative
	double withdraw(double amount) {
		if (amount > balance || amount <= -1) {
			System.out.println("Invalid withdraw!");
		} else {
			this.setBalance(this.getBalance() - amount);
			
		}
		return this.getBalance();
	}

	// transfers money from one account to another
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
		this.id = accountId;
		this.description = description;
		this.balance = 0;
		accountId = ((int) (Math.random() * (10) + 1));
	}

	public Account(String description) {
		this.description = description;
		this.balance = 0;
		this.id = ((int) (Math.random() * (10) + 1));
	}

	public Account() {
		this.balance = 0;
		this.id = ((int) (Math.random() * (10) + 1));
		this.description = "New Account";
	}
}