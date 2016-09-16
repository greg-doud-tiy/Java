package ssa;

public class Checking extends Account {

	
	
	public Checking(){}

	public String accountType = null;
		
	public String getAccountType() {
		return accountType;
	}
	
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public int getLastCheckNumber() {
		return lastCheckNumber;
	}
	
	public void setLastCheckNumber(int lastCheckNumber) {
		this.lastCheckNumber = lastCheckNumber;
	}
	public String print() {
		String str = super.print();
		return String.format("     %s     %7d", str, this.getLastCheckNumber());
	}
}
