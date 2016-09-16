package ssa;

public class Checking extends Account {
	static int lastCheckNbr = 1000;

	public int getLastCheckNbr() {
		return this.lastCheckNbr;
	}

	public void setLastCheckNbr(int lastCheckNbr) {
		this.lastCheckNbr = lastCheckNbr;
	}
	
	@Override
	double withdraw(double amount){
		double newBalance = super.withdraw(amount);
		int checkNbr = ++lastCheckNbr;
		return this.getBalance();
	}
	
	public Checking(){
		this.setType("C");
	}
	
	public Checking(String aDescription){
		this.setType("C");
		setDescription(aDescription);
	}
}
