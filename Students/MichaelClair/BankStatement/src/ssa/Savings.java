package ssa;

import java.text.DecimalFormat;

public class Savings extends Account {

	double interestRate;
	double minBalance;
	double interestAccumulated;
	
	public Savings () {
	}
	public Savings (String aDescription) {
  		super(aDescription);
	}
	public Savings (int aId, String aDescription) {
		super(aId, aDescription);
	}
	public String print(){
		DecimalFormat df = new DecimalFormat("#.00");
		return "S " + this.getId() + " " + String.format("%-20s", this.getDescription()) + df.format(this.getBalance()) + "      " + df.format(this.getInterestRate());
//		return "C " + this.getId() + " " + String.format("%-20s", this.getDescription()) + df.format(this.getBalance()) + " " + this.getLastCheckNbr();

		
		//		return super.print() + ". Interest Accumulated is $" + df.format(this.getInterestAccumulated());
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	//Method to attempt to account for a string of "1.5%". 
	public void setInterestRate(String interestRate) { 
		interestRate = interestRate.replace("%", "");
		double interestDouble = Double.parseDouble(interestRate);
		interestDouble = interestDouble/100;
		this.interestRate = interestDouble;
	}
	public double getMinBalance() {
		return minBalance;
	}
	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
	public double getInterestAccumulated() {
		return interestAccumulated;
	}

	public void calcDepositInterest(int months){
		if (this.getBalance() < minBalance) {
			System.out.println("Balance is below minimum, interest will not be paid");
		} else {
		this.deposit(this.getBalance()*(interestRate/12) * months);
		interestAccumulated += (this.getBalance()*(interestRate/12) * months);
	}
	}
}