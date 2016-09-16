package ssa;

public class Checking extends Account {

	static int lastChecknbr;

	public String print() {
		
		return super.print()  + getLastChecknbr();
	}
	
	double withdraw(double amount) {
		if (amount <= -1) {
			
		}else
		this.lastChecknbr++;
		return super.withdraw(amount);
	}
	
	
	public static int getLastChecknbr() {
		return lastChecknbr;
	}

	public static void setLastChecknbr(int lastChecknbr) {
		Checking.lastChecknbr = lastChecknbr;
	}

	public Checking() {
		lastChecknbr = 100;
		super.accountType = "C";
	}
}
