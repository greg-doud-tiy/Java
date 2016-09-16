package ssa;

public class Checking extends Account
{
	private final char accountType = 'C';

	public char getAccountType() 
	{
		return accountType;
	}
	
	//--------------------------------------------------------
	// Display the balance for the current Account instance
	//--------------------------------------------------------
	public String print() 
	{
		String line = String.format("%-2s%-4s%-29s%-7s%-4s%-4s", this.accountType, this.getId(), 
				this.getDescription(), this.getBalance(), this.getCheckNum(), "n/a");
		return line;
	}
}
