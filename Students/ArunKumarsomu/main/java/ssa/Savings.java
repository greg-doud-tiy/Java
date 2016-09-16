package ssa;

import java.text.DecimalFormat;

public class Savings extends Account{
	private double interestRate;
	double depositInterest;

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		depositInterest = interestRate;
		this.interestRate = interestRate / 12;
		
	}
	
	public Savings(){
		super();
		interestRate = 0.015;
		depositInterest = 0.015;
		this.setInterestRate(interestRate);
	}
	
	public Savings(int actid, String desc){
		super(actid, desc);
		interestRate = 0.015;
		depositInterest = 0.015;
		this.setInterestRate(interestRate);
	}
	
	public Savings( String desc){
		super(desc);
		interestRate = 0.015;
		depositInterest = 0.015;
		this.setInterestRate(interestRate);
	}
	public void calcDepositInterest(int months){
		double amount;
		amount = this.getBalance();
		amount = amount * this.getInterestRate() * months ;
		this.deposit(amount);
			
	}
	
	public String print(){
		double printIntRate = this.depositInterest * 100;
		DecimalFormat df = new DecimalFormat("0.00");      
		double IntRate = Double.valueOf(df.format(printIntRate));
		return ("S" + super.print()+ " \t \t" + IntRate+'0');
	}

	}
