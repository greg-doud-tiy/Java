package ssa;

public class Checking extends Account {
	
	private int lastCheckNbr;
	

	public Checking()
	{
		super();
	}
	
	public String print() {

		return  super.print() +  getLastCheckNbr();
	}
	
	public Checking(int lastCheckNbr)
	{
		this.lastCheckNbr = lastCheckNbr;
	}

	public int getLastCheckNbr() {
		return lastCheckNbr;
	}

	public void setLastCheckNbr(int lastCheckNbr) {
		this.lastCheckNbr = lastCheckNbr;
	}

	
	
}
