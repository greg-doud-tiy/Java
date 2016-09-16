package ssa;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Savings extends Account {

	private double intRate;
	private double months;
	private double interest;
	NumberFormat formatter = new DecimalFormat("#0.00");

	public Savings() {
		super();

	}

	public Savings(double months) {
		this.months = months;
	}

	public String print() {

		return super.print() + "      " + formatter.format(calcDepositInterest());
	}

	public double calcDepositInterest() {

		this.interest = (getIntRate()) * (months / 12) * getBalance();
		deposit(this.interest);

		return this.interest;
	}

	public double getIntRate() {
		return intRate;
	}

	public void setIntRate(double intRate) {
		this.intRate = intRate;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public double getMonths() {
		return months;
	}

	public void setMonths(double months) {
		this.months = months;
	}

}
