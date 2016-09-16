package ssa;

import java.text.DecimalFormat;

//A bank account
 class Account {
	private int id; // unique identifier for the account
	private String description; // a user defined name for the account
	protected String accountType;
	private double balance; // the amount in the account.
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {

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
		 DecimalFormat df = new DecimalFormat("#.00");


		    String result = df.format(this.getBalance());
		    return  String.format("%s %3s %-28s %5s ", accountType, id, description, result );

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

	public Account() {
		this.balance = 0;
		this.id = ((int) (Math.random() * (999) + 1));
		this.description = "New Account";
	}
}