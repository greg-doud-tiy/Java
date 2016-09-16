package ssa;

public class Checking extends Account{

	private static int lastCheckNbr = 100;
	private int myLastCheckNbr;
	
	public Checking()
	{
		super();
		super.setType("C");
		myLastCheckNbr = lastCheckNbr;
		lastCheckNbr++;
	}
	
	public int getLastCheckNbr() {	return myLastCheckNbr;
	}

	public void setMyLastCheckNbr(int myLastCheckNbr) {	this.myLastCheckNbr = myLastCheckNbr;
	}

	public boolean withdraw(double amt)
	{
		lastCheckNbr++;
		return super.withdraw(amt);
	}
	
	public String print()
	{
		return super.print() + String.format(" %d", this.getLastCheckNbr());
	}
	
}
