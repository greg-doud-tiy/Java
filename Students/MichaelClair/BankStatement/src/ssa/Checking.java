package ssa;

import java.text.DecimalFormat;

public class Checking extends Account{
	
	private int lastCheckNbr=100;

	public Checking(){}
	
	public Checking(int aId, String aDescription){
		this.setId(aId);
		this.setDescription(aDescription);
	}
	
	public double withdraw(double amt, int aLastCheckNbr){
		this.lastCheckNbr = aLastCheckNbr;
		lastCheckNbr++;
		return super.withdraw(amt);
	}   

	public int getLastCheckNbr() {
		return lastCheckNbr;
	}

	public void setLastCheckNbr(int lastCheckNbr) {
		this.lastCheckNbr = lastCheckNbr;
	}
	
	public String print() {
		DecimalFormat df = new DecimalFormat("#.00");

		return "C " + this.getId() + " " + String.format("%-20s", this.getDescription()) + df.format(this.getBalance()) + " " + this.getLastCheckNbr();

	}

}
