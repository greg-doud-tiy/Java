package ssa;

public class Savings extends Account {
	double interestRate;
	double minimumBalance;
	boolean lowVal = false;
	
	
	String print(){
		return super.print() + getInterestRate();
	}
	
	public double getMinimumBalance() {
		return minimumBalance;
	}
	
	public void setMimimumBalance(double minimumBalance) {
		lowVal = true;
		this.minimumBalance = minimumBalance;
	}
	

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public void calcDepositInterest(double months) {
		if(lowVal == false && this.getBalance() >= getMinimumBalance()){
		this.setInterestRate((getInterestRate() / 12));
		this.setInterestRate(this.getInterestRate() * months);
		deposit(getInterestRate() * getBalance());
		}
		else{
						
		}
		
	}
	

public Savings() {
	this.setType("S");
		}
	
public Savings(String aDescription){
	this.setType("S");
	setDescription(aDescription);
	}

public Savings(int Rate, String aDescription){
	this.setType("S");
	setDescription(aDescription);
	setInterestRate(Rate);
	
}

}
