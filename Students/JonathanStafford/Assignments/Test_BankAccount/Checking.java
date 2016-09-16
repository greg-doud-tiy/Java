package ssa;

public class Checking extends Account {

	public static int lastChecknbr;

	public String print() {
		return super.print() + " Check Number is " + lastChecknbr;
	}
	
	double withdraw(double amount) {
		lastChecknbr++;
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
	}
}
