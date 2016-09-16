package com.ssa.tiy.thebankaccount;

import java.util.ArrayList;
import java.util.HashMap;

public class Savings extends Account { //Savings inherits from Account
	
	double interestRate = 0.015;
	
	public Savings(double interestRate){
		super();
		this.interestRate = interestRate;
	}
		
	
	
	public double getInterestRate() {
	//interestRate /= 100.00; //convert interest rate from 0.015 to 1.5
	return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	//method that calculates amount of interest using the interest rate
			//then the method deposits that amount into the savings account
	public double CalcDepositInterest(int months){
				
	  double CalcDepostitInterest = (interestRate/12) * months*getBalance();
						
	return CalcDepostitInterest;
			
 }
	public String print(){
		String printFromAccount = super.print();
		return String.format("%s  %11.3f",printFromAccount, this.getInterestRate());
	}
		
	
}
