//--------------------------------------------------------------
// Reuben Turner
// Aug 31, 2016
// Assignment 11
// Account.java
//
// This class defines a generic savings account.
//--------------------------------------------------------------

package ssa;

public class Savings extends Account
{
	private final char accountType = 'S';
	private double interestRate = 0.015;

	// Get account type
	public char getAccountType() 
	{
		return accountType;
	}

	// return the interest rate
	public double getInterestRate() 
	{
		return interestRate;
	}

	// set the interest rate
	public void setInterestRate(double interestRate) 
	{
		if(interestRate > 0)
			this.interestRate = interestRate;
		else
			showError();
	}
	
	//------------------------------------
	// calculate the total interest for 
	// a specified number of months
	//------------------------------------
	public double CalcDepositInterest(int months)
	{
		double result = 0;
		if(super.getBalance() > 0)
		{
			if(months >= 1)
			{
				result = (this.interestRate / 12) * months * super.getBalance();
				super.deposit(result);
			}
			else
			{
				showError(); 
			}
		}
		else
		{
			System.out.println("The account has no balance. No interest can be earned.");
		}
		return result;
	}

	//---------------------------------------------
	// If the program tester enters invalid data,
	// quit the program and show an error message
	//---------------------------------------------
	private void showError() 
	{
		System.out.println("Invalid data. Program terminated.");
		System.exit(0);
	}
	
	//--------------------------------------------------------
	// Display the balance for the current Account instance
	//--------------------------------------------------------
	public String print() 
	{
		String line = String.format("%-2s%-4s%-29s%-7s%-4s%-4s", this.accountType, this.getId(), 
				this.getDescription(), this.getBalance(), "n/a", this.getInterestRate());
		return line;
	}
}
