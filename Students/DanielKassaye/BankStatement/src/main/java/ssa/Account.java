package ssa;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Account {
	NumberFormat formatter = new DecimalFormat("#0.00");

	private int id;
	private String description;
	private double balance;
	private char indicator;
	static int count = 100;

	public Account() {
		this.balance = 0;
		this.id = count;
		count++;
	}

	public Account(String description) {
		this.description = description;
		this.id = count;
		count++;

	}

	public Account(int id, String description) {
		this.id = id;
		this.description = description;
		this.id = count;
		count++;

	}

	public char firstLetterOfAccountName() {
		this.indicator = this.description.charAt(0);

		return this.indicator;
	}

	public String print() {

		return firstLetterOfAccountName() + "  " + getId() + "\t" + getDescription() + "\t\t" + formatter.format(getBalance())+ "  ";
	}

	// Transfer $$ method

	public double transferFrom(Account accountName, double transferAmount) {

		if (transferAmount <= accountName.getBalance()) {
			accountName.withdraw(transferAmount);
			return this.deposit(transferAmount);

		}

		else

			return 0;

	}

	// method to perform deposit
	public double deposit(double depositAmount) {

		if (depositAmount > 0) {

			this.balance += depositAmount;

			return this.balance;
		}

		else

		{

			return 0;
		}
	}

	// method to perform withdraw
	public double withdraw(double withdrawAmount) {

		if (this.balance - withdrawAmount < 0 && withdrawAmount > 0) {

			return 0;

		}

		else

		{
			this.balance = this.balance - withdrawAmount;
			return this.balance;
		}

	}

	// setters and getter for accountId, description and balance

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public char getIndicator() {
		return indicator;
	}

	public void setIndicator(char indicator) {
		this.indicator = indicator;
	}

}
